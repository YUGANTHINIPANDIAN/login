package com.niit.DB;

import java.util.Locale.Category;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import proj.niit.model.product;
import proj.niit.model.supplier;
import proj.niit.model.user;


@ComponentScan("com.niit")
@Configuration
@EnableTransactionManagement

public class DBconfig {

	@Bean(name="dataSource")
	public DataSource getH2DataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:~/test");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		System.out.println("Data Source");
		return dataSource;
	}
	
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory()
	{
		Properties hibernateProperties= new Properties();
		hibernateProperties.put("hibernet.dialect","org.hibernate.dialect.H2Dialect");
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto","update");
		LocalSessionFactoryBuilder localsessionFactory=new LocalSessionFactoryBuilder(getH2DataSource());
		localsessionFactory.addProperties(hibernateProperties);
		localsessionFactory.addAnnotatedClass(Category.class);
		localsessionFactory.addAnnotatedClass(product.class);
		localsessionFactory.addAnnotatedClass(user.class);
		localsessionFactory.addAnnotatedClass(supplier.class);
		
		SessionFactory sessionFactory=localsessionFactory.buildSessionFactory();
		System.out.println("session factory");
		return sessionFactory;
		}
	@Bean(name="txtManager")
	
		public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory)
		{
			System.out.println("Transaction manager");
			return new HibernateTransactionManager(sessionFactory);
		}
	}
	

