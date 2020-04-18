package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CustomerEavAttribute;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerEavAttributeMapper implements RowMapper<CustomerEavAttribute> {

    @Override
    public CustomerEavAttribute mapRow(ResultSet rs, int i) throws SQLException {
        CustomerEavAttribute customerEavAttribute = new CustomerEavAttribute();
        customerEavAttribute.setAttributeId(rs.getInt("attribute_id"));
        customerEavAttribute.setIsVisible(rs.getInt("is_visible"));
        customerEavAttribute.setInputFilter(rs.getString("input_filter"));
        customerEavAttribute.setMultilineCount(rs.getInt("multiline_count"));
        customerEavAttribute.setValidateRules(rs.getString("validate_rules"));
        customerEavAttribute.setIsSystem(rs.getInt("is_system"));
        customerEavAttribute.setSortOrder(rs.getInt("sort_order"));
        customerEavAttribute.setDataModel(rs.getString("data_model"));
        return customerEavAttribute;
    }

}

