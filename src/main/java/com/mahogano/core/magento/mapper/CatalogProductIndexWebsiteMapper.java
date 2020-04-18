package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductIndexWebsite;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductIndexWebsiteMapper implements RowMapper<CatalogProductIndexWebsite> {

    @Override
    public CatalogProductIndexWebsite mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductIndexWebsite catalogProductIndexWebsite = new CatalogProductIndexWebsite();
        catalogProductIndexWebsite.setWebsiteId(rs.getInt("website_id"));
        catalogProductIndexWebsite.setWebsiteDate(rs.getTimestamp("website_date") != null ? rs.getTimestamp("website_date").toLocalDateTime() : null);
        catalogProductIndexWebsite.setRate(rs.getFloat("rate"));
        return catalogProductIndexWebsite;
    }

}

