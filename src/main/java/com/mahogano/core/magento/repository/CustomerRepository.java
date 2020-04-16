package com.mahogano.core.magento.repository;

import com.mahogano.core.magento.entity.Customer;
import com.mahogano.core.magento.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public CustomerRepository(@Qualifier("magentoJdbc") JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final static String ID = "entity_id";

    private final static String[] COLUMNS = {
            "entity_id",
            "entity_type_id",
            "attribute_set_id",
            "website_id",
            "email",
            "group_id",
            "increment_id",
            "store_id",
            "created_at",
            "updated_at",
            "is_active",
            "disable_auto_group_change"
    };

    public List<Customer> findAll() {
        return jdbcTemplate.query(
                String.format("SELECT %s, %s FROM customer_entity", ID, String.join(", ", COLUMNS)),
                new CustomerMapper()
        );
    }

}
