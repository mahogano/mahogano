package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductLinkAttributeInt;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductLinkAttributeIntMapper implements RowMapper<CatalogProductLinkAttributeInt> {

    @Override
    public CatalogProductLinkAttributeInt mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductLinkAttributeInt catalogProductLinkAttributeInt = new CatalogProductLinkAttributeInt();
        catalogProductLinkAttributeInt.setValueId(rs.getInt("value_id"));
        catalogProductLinkAttributeInt.setProductLinkAttributeId(rs.getInt("product_link_attribute_id"));
        catalogProductLinkAttributeInt.setLinkId(rs.getInt("link_id"));
        catalogProductLinkAttributeInt.setValue(rs.getInt("value"));
        return catalogProductLinkAttributeInt;
    }

}

