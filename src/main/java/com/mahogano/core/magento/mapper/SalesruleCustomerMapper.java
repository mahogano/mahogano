package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesruleCustomer;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesruleCustomerMapper implements RowMapper<SalesruleCustomer> {

    @Override
    public SalesruleCustomer mapRow(ResultSet rs, int i) throws SQLException {
        SalesruleCustomer salesruleCustomer = new SalesruleCustomer();
        salesruleCustomer.setRuleCustomerId(rs.getInt("rule_customer_id"));
        salesruleCustomer.setRuleId(rs.getInt("rule_id"));
        salesruleCustomer.setCustomerId(rs.getInt("customer_id"));
        salesruleCustomer.setTimesUsed(rs.getInt("times_used"));
        return salesruleCustomer;
    }

}

