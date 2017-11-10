package com.shopping.ShoppingCartFinal.Config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.shopping.ShoppingCartFinal")
@EnableTransactionManagement
public class DBConfig {
	@Bean(name="dataSource")
	public DataSource getOracleDataSource(){
		System.out.println("Starting of the method getOracleDataSource");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("SPRING_PROJECT");
		dataSource.setPassword("1234");
		System.out.println("DataSource Creation");
		return dataSource;
	}
	
	@Autowired
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource){
		System.out.println("----Hibernate properties----");
		Properties prop = new Properties();
		prop.setProperty("hibernate.hbm2ddl.auto", "update");
		prop.put("hibernate.show_sql", "true");
		prop.put("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
		System.out.println("---Hibernate Properties Created---");
		System.out.println("---Local Sessionfactory Build Object creation---");
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(getOracleDataSource());
		sessionBuilder.addProperties(prop);
		System.out.println("--Factory Builder Object Creation--");
		sessionBuilder.scanPackages("com.shopping.ShoppingCartFinal.Model");
		System.out.println("SessionFactory Object creation");
		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = sessionBuilder.buildSessionFactory();
		System.out.println("SessionFactory Object Creation");
		return sessionFactory;	
	}
	
	@Autowired
	@Bean(name="transactionManager")
	public HibernateTransactionManager geTransactionManager(SessionFactory sessionFactory){
		System.out.println("--Transaction manager object creation--");
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		System.out.println("--Transaction Manager Object creation--");
		return null;	
	}
}
