package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesruleCustomerGroup;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesruleCustomerGroupMapper implements RowMapper<SalesruleCustomerGroup> {

    @Override
    public SalesruleCustomerGroup mapRow(ResultSet rs, int i) throws SQLException {
        SalesruleCustomerGroup salesruleCustomerGroup = new SalesruleCustomerGroup();
        salesruleCustomerGroup.setRuleId(rs.getInt("rule_id"));
        salesruleCustomerGroup.setCustomerGroupId(rs.getInt("customer_group_id"));
        return salesruleCustomerGroup;
    }

}

