package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductWebsite;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductWebsiteMapper implements RowMapper<CatalogProductWebsite> {

    @Override
    public CatalogProductWebsite mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductWebsite catalogProductWebsite = new CatalogProductWebsite();
        catalogProductWebsite.setProductId(rs.getInt("product_id"));
        catalogProductWebsite.setWebsiteId(rs.getInt("website_id"));
        return catalogProductWebsite;
    }

}

