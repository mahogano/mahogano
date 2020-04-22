package com.mahogano.core.magento.repository;

import com.mahogano.core.magento.entity.EavEntity;
import com.mahogano.core.magento.mapper.EavEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EavEntityRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(@Qualifier("magentoJdbc") JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final static String ID = "entity_id";

    private final static String[] COLUMNS = {
            "entity_type_id",
            "attribute_set_id",
            "increment_id",
            "parent_id",
            "store_id",
            "created_at",
            "updated_at",
            "is_active"
    };

    public List<EavEntity> findAll() {
        return jdbcTemplate.query(
                String.format("SELECT %s, %s FROM eav_entity", ID, String.join(", ", COLUMNS)),
                new EavEntityMapper()
        );
    }

}
