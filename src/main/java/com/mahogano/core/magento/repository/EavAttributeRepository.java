package com.mahogano.core.magento.repository;

import com.mahogano.core.magento.entity.EavAttribute;
import com.mahogano.core.magento.entity.EavEntity;
import com.mahogano.core.magento.mapper.EavAttributeMapper;
import com.mahogano.core.magento.mapper.EavEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EavAttributeRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(@Qualifier("magentoJdbc") JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final static String ID = "attribute_id";

    private final static String[] COLUMNS = {
            "entity_type_id",
            "attribute_code",
            "attribute_model",
            "backend_model",
            "backend_type",
            "backend_table",
            "frontend_model",
            "frontend_input",
            "frontend_label",
            "frontend_class",
            "source_model",
            "is_required",
            "is_user_defined",
            "default_value",
            "is_unique",
            "note"
    };

    public List<EavAttribute> findAll() {
        return jdbcTemplate.query(
                String.format("SELECT %s, %s FROM eav_attribute", ID, String.join(", ", COLUMNS)),
                new EavAttributeMapper()
        );
    }

}
