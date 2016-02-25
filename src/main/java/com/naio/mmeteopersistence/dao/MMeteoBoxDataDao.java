package com.naio.mmeteopersistence.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.naio.mmeteopersistence.entity.MMeteoBox;
import com.naio.mmeteopersistence.entity.MMeteoBoxData;

public class MMeteoBoxDataDao
{
	static final long ONE_MINUTE_IN_MILLIS=60000;//millisecs
	
	public MMeteoBoxDataDao()
	{
	
	}
	
	public MMeteoBoxData findByImei(final Session session, final String imei)
	{
		MMeteoBoxData myMMeteoBoxData = null;
		
		Criteria criteria = session.createCriteria(MMeteoBoxData.class);
		Criteria subCriteria = criteria.createCriteria(MMeteoBoxData.PROP_MMETEO_BOX);
		subCriteria.add(Restrictions.eq(MMeteoBox.PROP_IMEI, imei) );
		
		myMMeteoBoxData = (MMeteoBoxData) criteria.uniqueResult();
				
		return myMMeteoBoxData;
	}
	
	@SuppressWarnings({ "unchecked" })
	public List<MMeteoBoxData> findNoActiveBox( final Session session )
	{
		List<MMeteoBoxData> myMMeteoBoxList = new ArrayList<MMeteoBoxData>();
		
		long currentTime = new Date().getTime();
		
		Criteria criteria = session.createCriteria(MMeteoBoxData.class);
		
		for(MMeteoBoxData mmeteoBoxData : (List<MMeteoBoxData>)(criteria.list()) )
		{
			Date dateForMinutes = new Date();
			
			dateForMinutes = new Date( currentTime - ( mmeteoBoxData.getMmeteoBox().getActivityTimeoutMinute() * ONE_MINUTE_IN_MILLIS ) );
			
			if( mmeteoBoxData.getLastIncomingMessageTime() < dateForMinutes.getTime() )
			{
				myMMeteoBoxList.add( mmeteoBoxData );
			}
		}
				
		return myMMeteoBoxList;
	}
}
