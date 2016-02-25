package com.naio.mmeteopersistence.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.naio.mmeteopersistence.entity.MMeteoBox;
import com.naio.mmeteopersistence.entity.MMeteoBoxData;

public class MMeteoBoxDao
{
	static final long ONE_MINUTE_IN_MILLIS=60000;//millisecs
	
	public MMeteoBoxDao()
	{
	
	}
	
	public MMeteoBox findByImei(final Session session, final String imei)
	{
		MMeteoBox myMMeteoBox = null;
		
		Criteria criteria = session.createCriteria(MMeteoBox.class);
		
		criteria.add(Restrictions.eq(MMeteoBox.PROP_IMEI, imei) );
		
		myMMeteoBox = (MMeteoBox) criteria.uniqueResult();
				
		return myMMeteoBox;
	}
	
	@SuppressWarnings({ "unchecked" })
	public List<MMeteoBox> findNoActiveBox( final Session session )
	{
		List<MMeteoBox> myMMeteoBoxList = new ArrayList<MMeteoBox>();
		
		long currentTime = new Date().getTime();
		
		Criteria criteria = session.createCriteria(MMeteoBoxData.class);
		
		for(MMeteoBoxData mmeteoBoxData : (List<MMeteoBoxData>)(criteria.list()) )
		{
			Date dateForMinutes = new Date();
			
			dateForMinutes = new Date( currentTime - ( mmeteoBoxData.getMmeteoBox().getActivityTimeoutMinute() * ONE_MINUTE_IN_MILLIS ) );
			
			if( mmeteoBoxData.getLastIncomingMessageTime() < dateForMinutes.getTime() )
			{
				myMMeteoBoxList.add( mmeteoBoxData.getMmeteoBox() );
			}
		}
				
		return myMMeteoBoxList;
	}
}
