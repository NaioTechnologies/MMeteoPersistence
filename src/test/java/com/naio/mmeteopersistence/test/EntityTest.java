package com.naio.mmeteopersistence.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.naio.mmeteopersistence.common.HibernateUtil;
import com.naio.mmeteopersistence.dao.CustomerDao;
import com.naio.mmeteopersistence.entity.Customer;
import com.naio.mmeteopersistence.entity.MMeteoBox;
import com.naio.mmeteopersistence.entity.Naio;
import com.naio.mmeteopersistence.entity.Customer.CUSTOMER_STATUS;


public class EntityTest
{
	private static final Logger logger = Logger.getLogger(EntityTest.class);
	
	@SuppressWarnings("unchecked")
	@Test
	public void hibernateCfgTest() throws Exception
	{
		Session session =  null;
		
		Transaction transaction = null; 
		
		try
		{
			CustomerDao customerDao = new CustomerDao();
			
			session =  HibernateUtil.getSessionFactory().openSession();
	
			transaction = session.beginTransaction();
			
			Criteria mmeteoBoxCriteria = session.createCriteria(MMeteoBox.class);
			
			for( MMeteoBox mmeteoBox : (List<MMeteoBox>)(mmeteoBoxCriteria.list()) )
			{
				if( mmeteoBox.getCustomer() == null )
				{
					mmeteoBox.setCustomer( customerDao.getDefaultCustomer(session) );
					
					session.save(mmeteoBox);
				}
			}
			
			
			Criteria naioCriteria = session.createCriteria(Naio.class);
			
			for( Naio naio : (List<Naio>)(naioCriteria.list()) )
			{
				logger.info(naio.getName());
			}

			Criteria joanCriteria = session.createCriteria( Naio.class );
			 
			joanCriteria.add( Restrictions.eq( Naio.PROP_NAME, "Joan" ) );
			
			if( joanCriteria.uniqueResult() == null )
			{
				Naio naioJoan = new Naio();
				
				naioJoan.setAlertPhoneNumber("+33607753407");
				naioJoan.setEmail("joan@naio-technologies.com");
				naioJoan.setName("Joan");
				naioJoan.setSendEmailAlert(true);
				naioJoan.setSendSmsAlert(true);
				naioJoan.setSendServerError(true);
				
				session.save(naioJoan);
			}
			
			Criteria aymericCriteria = session.createCriteria( Naio.class );
			 
			aymericCriteria.add( Restrictions.eq( Naio.PROP_NAME, "Aymeric" ) );
			
			if( aymericCriteria.uniqueResult() == null )
			{
				Naio naioAymeric = new Naio();
				
				naioAymeric.setAlertPhoneNumber("+33678785871");
				naioAymeric.setEmail("aymeric@naio-technologies.com");
				naioAymeric.setName("Aymeric");
				naioAymeric.setSendEmailAlert(true);
				naioAymeric.setSendSmsAlert(true);
				naioAymeric.setSendServerError(false);
		
				
				session.save(naioAymeric);
			}
			
			Criteria gaetanCriteria = session.createCriteria( Naio.class );
			
			gaetanCriteria.add( Restrictions.eq( Naio.PROP_NAME, "Gaetan" ) );
			
			if( gaetanCriteria.uniqueResult() == null )
			{
				Naio naioGaetan = new Naio();
				
				naioGaetan.setAlertPhoneNumber("+33650051286");
				naioGaetan.setEmail("gaetan@naio-technologies.com");
				naioGaetan.setName("Gaetan");
				naioGaetan.setSendEmailAlert(true);
				naioGaetan.setSendSmsAlert(true);
				naioGaetan.setSendServerError(false);
			

				session.save(naioGaetan);
			}

			Criteria jeanCriteria = session.createCriteria( Naio.class );
			
			jeanCriteria.add( Restrictions.eq( Naio.PROP_NAME, "Jean" ) );
			
			if( jeanCriteria.uniqueResult() == null )
			{
				Naio naioJean = new Naio();
				
				naioJean.setAlertPhoneNumber("+33651231530");
				naioJean.setEmail("jean@naio-technologies.com");
				naioJean.setName("Jean");
				naioJean.setSendEmailAlert(true);
				naioJean.setSendSmsAlert(true);
				naioJean.setSendServerError(false);
			
				session.save(naioJean);
			}
			
			Criteria brunoCriteria = session.createCriteria( Naio.class );
			
			brunoCriteria.add( Restrictions.eq( Naio.PROP_NAME, "Bruno" ) );
			
			if( brunoCriteria.uniqueResult() == null )
			{
				Naio naioBruno = new Naio();
				
				naioBruno.setAlertPhoneNumber("+33650516207");
				naioBruno.setEmail("bruno@naio-technologies.com");
				naioBruno.setName("Bruno");
				naioBruno.setSendEmailAlert(true);
				naioBruno.setSendSmsAlert(true);
				naioBruno.setSendServerError(true);

				session.save(naioBruno);
			}
			
			
			Criteria matthiasCriteria = session.createCriteria( Naio.class );
			
			matthiasCriteria.add( Restrictions.eq( Naio.PROP_NAME, "Matthias" ) );
			
			if( matthiasCriteria.uniqueResult() == null )
			{
				Naio matthiasBruno = new Naio();
				
				matthiasBruno.setAlertPhoneNumber("+33782037728");
				matthiasBruno.setEmail("matthias@naio-technologies.com");
				matthiasBruno.setName("Matthias");
				matthiasBruno.setSendEmailAlert(true);
				matthiasBruno.setSendSmsAlert(true);
				matthiasBruno.setSendServerError(true);

				session.save(matthiasBruno);
			}
			
			Customer defaultCustomer = customerDao.getDefaultCustomer(session);
			
			if( defaultCustomer == null )
			{
				defaultCustomer = new Customer();
				
				defaultCustomer.setName("Naïo Technologies");
				
				defaultCustomer.setAddress("3 Avenue Didier Daurat");
				defaultCustomer.setCity("Toulouse");
				defaultCustomer.setCountry("France");
				defaultCustomer.setCustomerStatus(CUSTOMER_STATUS.ACTIVE);
				defaultCustomer.setPhoneNumber("+33972454085");
				defaultCustomer.setPostalCode("31400");
				defaultCustomer.setSocial("Naïo Technologies");

				defaultCustomer.setSendDailyReport(false);
				defaultCustomer.setSendMonthlyReport(false);
				defaultCustomer.setSendEmailAlert(false);
				defaultCustomer.setSendSmsAlert(false);
				
				defaultCustomer.setContactEmail("joan@naio-technologies.com");
				
				session.save(defaultCustomer);				
			}
			
			
			for(int i=1; i<20; i++)
			{
				String name = "Customer_" + String.format("%02d", i);
				Customer customer = customerDao.getCustomerByName(session, name );
				
				if( customer == null )
				{
					Customer newCustomer = new Customer();
					
					newCustomer.setAddress("3 avenue Didier Daurat");
					newCustomer.setCity("Toulouse");
					newCustomer.setCountry("France");
					newCustomer.setCustomerStatus(CUSTOMER_STATUS.TEST);
					newCustomer.setPhoneNumber("+33972454085");
					newCustomer.setPostalCode("31400");
					newCustomer.setSocial(name);
					newCustomer.setName(name);
					
					newCustomer.setSendDailyReport(false);
					newCustomer.setSendMonthlyReport(false);
					newCustomer.setSendEmailAlert(false);
					newCustomer.setSendSmsAlert(false);
					
					session.save(newCustomer);			
				}
			}
			
			if( !transaction.wasCommitted() )
			{
				transaction.commit();
			}	
		}
		catch(Exception e)
		{
			if( transaction != null )
			{
				transaction.rollback();
			}
			
			throw new Exception(e);
		}
		finally
		{
			if( session != null )
			{
				session.close();
			}
		}
	}
	
	
}
