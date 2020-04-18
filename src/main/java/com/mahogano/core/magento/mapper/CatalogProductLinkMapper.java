package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductLink;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductLinkMapper implements RowMapper<CatalogProductLink> {

    @Override
    public CatalogProductLink mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductLink catalogProductLink = new CatalogProductLink();
        catalogProductLink.setLinkId(rs.getInt("link_id"));
        catalogProductLink.setProductId(rs.getInt("product_id"));
        catalogProductLink.setLinkedProductId(rs.getInt("linked_product_id"));
        catalogProductLink.setLinkTypeId(rs.getInt("link_type_id"));
        return catalogProductLink;
    }

}

