package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogruleGroupWebsite;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogruleGroupWebsiteMapper implements RowMapper<CatalogruleGroupWebsite> {

    @Override
    public CatalogruleGroupWebsite mapRow(ResultSet rs, int i) throws SQLException {
        CatalogruleGroupWebsite catalogruleGroupWebsite = new CatalogruleGroupWebsite();
        catalogruleGroupWebsite.setRuleId(rs.getInt("rule_id"));
        catalogruleGroupWebsite.setCustomerGroupId(rs.getInt("customer_group_id"));
        catalogruleGroupWebsite.setWebsiteId(rs.getInt("website_id"));
        return catalogruleGroupWebsite;
    }

}

