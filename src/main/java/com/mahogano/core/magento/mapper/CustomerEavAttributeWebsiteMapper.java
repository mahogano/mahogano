package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CustomerEavAttributeWebsite;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerEavAttributeWebsiteMapper implements RowMapper<CustomerEavAttributeWebsite> {

    @Override
    public CustomerEavAttributeWebsite mapRow(ResultSet rs, int i) throws SQLException {
        CustomerEavAttributeWebsite customerEavAttributeWebsite = new CustomerEavAttributeWebsite();
        customerEavAttributeWebsite.setAttributeId(rs.getInt("attribute_id"));
        customerEavAttributeWebsite.setWebsiteId(rs.getInt("website_id"));
        customerEavAttributeWebsite.setIsVisible(rs.getInt("is_visible"));
        customerEavAttributeWebsite.setIsRequired(rs.getInt("is_required"));
        customerEavAttributeWebsite.setDefaultValue(rs.getString("default_value"));
        customerEavAttributeWebsite.setMultilineCount(rs.getInt("multiline_count"));
        return customerEavAttributeWebsite;
    }

}

