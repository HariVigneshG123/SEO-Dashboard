package com.agsdashboard.get.config;

import java.util.HashMap;
import java.util.Map;

import javax.activation.DataSource;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "agsEntityManagerFactory", basePackages = {
		"com.agsdashboard.get.agsRepository" },transactionManagerRef = "agstransactionManager")
public class agsDBConfig {
	
	@Bean(name = "agsdatasource")
	@ConfigurationProperties(prefix = "spring.ags.datasource")
	public DataSource dataSource() {
		return (DataSource) DataSourceBuilder.create().build();
	}

	@Bean(name = "agsEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(EntityManagerFactoryBuilder builder,
			@Qualifier("agsdatasource") DataSource dataSource) {

		Map<String, Object> properties = new HashMap<>();
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
		return builder.dataSource((javax.sql.DataSource) dataSource).properties(properties)
				.packages("com.agsdashboard.get.agsEntity").persistenceUnit("AgsEntry").build();
	}

	@Bean(name = "agstransactionManager")
	public PlatformTransactionManager transactionManager(
			@Qualifier("agsEntityManagerFactory") EntityManagerFactory entityManagerFactory) {

		return new JpaTransactionManager(entityManagerFactory);

	}

}
