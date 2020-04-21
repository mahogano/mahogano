package com.mahogano.core.magento.repository;

import com.mahogano.core.magento.entity.CustomerEntity;
import com.mahogano.core.magento.entity.CustomerGroup;
import com.mahogano.core.magento.mapper.CustomerEntityMapper;
import com.mahogano.core.magento.mapper.CustomerGroupMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerGroupRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(@Qualifier("magentoJdbc") JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final static String ID = "customer_group_id";

    private final static String[] COLUMNS = {
            "customer_group_code",
            "tax_class_id"
    };

    public List<CustomerGroup> findAll() {
        return jdbcTemplate.query(
                String.format("SELECT %s, %s FROM customer_group", ID, String.join(", ", COLUMNS)),
                new CustomerGroupMapper()
        );
    }

    public CustomerGroup find(Integer customerGroupId) {
        return jdbcTemplate.queryForObject(
                String.format(
                        "SELECT %s, %s FROM customer_group WHERE customer_group_id = ?",
                        ID,
                        String.join(", ", COLUMNS)
                ),
                new Object[] {customerGroupId},
                new CustomerGroupMapper()
        );
    }

}
