package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductLinkAttributeVarchar;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductLinkAttributeVarcharMapper implements RowMapper<CatalogProductLinkAttributeVarchar> {

    @Override
    public CatalogProductLinkAttributeVarchar mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductLinkAttributeVarchar catalogProductLinkAttributeVarchar = new CatalogProductLinkAttributeVarchar();
        catalogProductLinkAttributeVarchar.setValueId(rs.getInt("value_id"));
        catalogProductLinkAttributeVarchar.setProductLinkAttributeId(rs.getInt("product_link_attribute_id"));
        catalogProductLinkAttributeVarchar.setLinkId(rs.getInt("link_id"));
        catalogProductLinkAttributeVarchar.setValue(rs.getString("value"));
        return catalogProductLinkAttributeVarchar;
    }

}

