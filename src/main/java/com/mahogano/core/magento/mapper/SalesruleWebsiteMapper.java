package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesruleWebsite;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesruleWebsiteMapper implements RowMapper<SalesruleWebsite> {

    @Override
    public SalesruleWebsite mapRow(ResultSet rs, int i) throws SQLException {
        SalesruleWebsite salesruleWebsite = new SalesruleWebsite();
        salesruleWebsite.setRuleId(rs.getInt("rule_id"));
        salesruleWebsite.setWebsiteId(rs.getInt("website_id"));
        return salesruleWebsite;
    }

}

