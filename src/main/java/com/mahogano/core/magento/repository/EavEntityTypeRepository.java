package com.mahogano.core.magento.repository;

import com.mahogano.core.magento.entity.EavEntityType;
import com.mahogano.core.magento.mapper.EavEntityTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EavEntityTypeRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(@Qualifier("magentoJdbc") JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final static String ID = "entity_type_id";

    private final static String[] COLUMNS = {
            "entity_type_code",
            "entity_model",
            "attribute_model",
            "entity_table",
            "value_table_prefix",
            "entity_id_field",
            "is_data_sharing",
            "data_sharing_key",
            "default_attribute_set_id",
            "increment_model",
            "increment_per_store",
            "increment_pad_length",
            "increment_pad_char",
            "additional_attribute_table",
            "entity_attribute_collection"
    };

    public List<EavEntityType> findAll() {
        return jdbcTemplate.query(
                String.format("SELECT %s, %s FROM eav_entity_type", ID, String.join(", ", COLUMNS)),
                new EavEntityTypeMapper()
        );
    }

}
