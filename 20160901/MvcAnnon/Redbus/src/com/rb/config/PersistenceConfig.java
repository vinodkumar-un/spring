package com.rb.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

import com.rb.entities.Bus;
import com.rb.entities.Journey;

@Configuration
@PropertySource("classpath:db.properties")
public class PersistenceConfig {
	@Autowired
	protected Environment env;

	@Bean
	public DataSource newDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName(env.getProperty("db.driverClassname"));
		dataSource.setUrl(env.getProperty("db.url"));
		dataSource.setUsername(env.getProperty("db.username"));
		dataSource.setPassword(env.getProperty("db.password"));

		return dataSource;
	}

	@Bean(autowire = Autowire.BY_TYPE)
	public LocalSessionFactoryBean newSessionFactory() {
		Properties hibernateProperties = null;
		LocalSessionFactoryBean sessionFactoryBean = null;

		sessionFactoryBean = new LocalSessionFactoryBean();
		sessionFactoryBean.setAnnotatedClasses(new Class<?>[] { Journey.class,
				Bus.class });
		hibernateProperties = new Properties();
		hibernateProperties.put("hibernate.dialect",
				"org.hibernate.dialect.Oracle10gDialect");
		hibernateProperties.put("show_sql", "true");

		sessionFactoryBean.setHibernateProperties(hibernateProperties);
		return sessionFactoryBean;
	}

	@Bean(autowire = Autowire.BY_TYPE)
	public HibernateTemplate newHibernateTemplate() {
		HibernateTemplate hibernateTemplate = null;

		hibernateTemplate = new HibernateTemplate();
		return hibernateTemplate;
	}

	@Bean(name = "transactionManager", autowire = Autowire.BY_TYPE)
	public HibernateTransactionManager newHibernateTransactionManager() {
		HibernateTransactionManager transactionManager = null;

		transactionManager = new HibernateTransactionManager();
		return transactionManager;
	}

}
