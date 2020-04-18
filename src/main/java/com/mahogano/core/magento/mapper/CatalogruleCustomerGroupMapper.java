package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogruleCustomerGroup;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogruleCustomerGroupMapper implements RowMapper<CatalogruleCustomerGroup> {

    @Override
    public CatalogruleCustomerGroup mapRow(ResultSet rs, int i) throws SQLException {
        CatalogruleCustomerGroup catalogruleCustomerGroup = new CatalogruleCustomerGroup();
        catalogruleCustomerGroup.setRuleId(rs.getInt("rule_id"));
        catalogruleCustomerGroup.setCustomerGroupId(rs.getInt("customer_group_id"));
        return catalogruleCustomerGroup;
    }

}

