package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductSuperLink;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductSuperLinkMapper implements RowMapper<CatalogProductSuperLink> {

    @Override
    public CatalogProductSuperLink mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductSuperLink catalogProductSuperLink = new CatalogProductSuperLink();
        catalogProductSuperLink.setLinkId(rs.getInt("link_id"));
        catalogProductSuperLink.setProductId(rs.getInt("product_id"));
        catalogProductSuperLink.setParentId(rs.getInt("parent_id"));
        return catalogProductSuperLink;
    }

}

