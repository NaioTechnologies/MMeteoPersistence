package com.naio.mmeteopersistence.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.naio.mmeteopersistence.entity.Customer;

public class CustomerDao
{
	static final long ONE_MINUTE_IN_MILLIS=60000;//millisecs
	static final String DEFAULT_CUSTOMER_NAME = "Naïo Technologies";
	
	public CustomerDao()
	{
	
	}
	
	public Customer getDefaultCustomer(final Session session)
	{
		return getCustomerByName( session, DEFAULT_CUSTOMER_NAME );
	}
	
	public Customer getCustomerByName(final Session session, final String name)
	{
		Criteria customerCriteria = session.createCriteria( Customer.class );
		 
		customerCriteria.add( Restrictions.eq( Customer.PROP_NAME, name ) );
		
		return (Customer)( customerCriteria.uniqueResult() ) ;
	}
}
