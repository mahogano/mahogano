package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesruleProductAttribute;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesruleProductAttributeMapper implements RowMapper<SalesruleProductAttribute> {

    @Override
    public SalesruleProductAttribute mapRow(ResultSet rs, int i) throws SQLException {
        SalesruleProductAttribute salesruleProductAttribute = new SalesruleProductAttribute();
        salesruleProductAttribute.setRuleId(rs.getInt("rule_id"));
        salesruleProductAttribute.setWebsiteId(rs.getInt("website_id"));
        salesruleProductAttribute.setCustomerGroupId(rs.getInt("customer_group_id"));
        salesruleProductAttribute.setAttributeId(rs.getInt("attribute_id"));
        return salesruleProductAttribute;
    }

}

