package com.mahogano;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class MahoganoConfiguration {

    private Environment environment;

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    @Bean(name = "mahoganoDataSource")
    public DataSource mahoganoDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(environment.getProperty("spring.mahogano.datasource.url"));
        dataSource.setUsername(environment.getProperty("spring.mahogano.datasource.username"));
        dataSource.setPassword(environment.getProperty("spring.mahogano.datasource.password"));
        return dataSource;
    }

    @Bean(name = "magentoDataSource")
    public DataSource magentoDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(environment.getProperty("spring.magento.datasource.url"));
        dataSource.setUsername(environment.getProperty("spring.magento.datasource.username"));
        dataSource.setPassword(environment.getProperty("spring.magento.datasource.password"));
        return dataSource;
    }

    @Bean(name = "mahoganoJdbc")
    public JdbcTemplate mahoganoJdbc(@Qualifier("mahoganoDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean(name = "magentoJdbc")
    public JdbcTemplate magentoJdbc(@Qualifier("magentoDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

}
