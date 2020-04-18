package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogruleWebsite;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogruleWebsiteMapper implements RowMapper<CatalogruleWebsite> {

    @Override
    public CatalogruleWebsite mapRow(ResultSet rs, int i) throws SQLException {
        CatalogruleWebsite catalogruleWebsite = new CatalogruleWebsite();
        catalogruleWebsite.setRuleId(rs.getInt("rule_id"));
        catalogruleWebsite.setWebsiteId(rs.getInt("website_id"));
        return catalogruleWebsite;
    }

}

