package com.mahogano;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class MahoganoConfiguration {

    @Bean(name = "mahoganoDataSource")
    @ConfigurationProperties(prefix = "spring.mahogano")
    public DataSource mahoganoDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "magentoDataSource")
    @ConfigurationProperties(prefix = "spring.magento")
    public DataSource magentoDataSource() {
        return DataSourceBuilder.create().build();
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
