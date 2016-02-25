package com.naio.mmeteopersistence.common;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.naio.mmeteopersistence.common.DatabaseInterceptor;
 
public class HibernateUtil
{
 	private static SessionFactory sessionFactory = buildSessionFactory();
 	private static ServiceRegistry serviceRegistry;
 	private static DatabaseInterceptor databaseInterceptor;
 	private static Configuration configuration;
 	
	private static SessionFactory buildSessionFactory()
	{
		try 
		{
			// load from different directory
			configuration = new Configuration();

			databaseInterceptor = new DatabaseInterceptor();
			
			//String hibernateCfgXmlFile = "E:/dev/workspace/MMeteoManager/src/main/resources/hibernate.cfg.xml";// HibernateUtil.class.getClassLoader().getResource("E:/dev/workspace/MMeteoManager/src/main/resourceshibernate.cfg.xml").getPath().toString(); 
			String hibernateCfgXmlFile = "hibernate.cfg.xml";
					
			configuration.configure( hibernateCfgXmlFile );
			
			//configuration.configure();
			
			serviceRegistry = new StandardServiceRegistryBuilder().applySettings( configuration.getProperties() ).build();
			
			sessionFactory = configuration.setInterceptor( databaseInterceptor ).buildSessionFactory( serviceRegistry );
			
			return sessionFactory;
		}
		catch ( Throwable ex )
		{
			// Make sure you log the exception, as it might be swallowed
			System.err.println( "Initial SessionFactory creation failed." + ex );
			
			throw new ExceptionInInitializerError( ex );
		}
	}
 
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
 
	public static void shutdown() 
	{
		// Close caches and connection pools
		getSessionFactory().close();
	}
 
}