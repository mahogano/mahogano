package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductLinkAttribute;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductLinkAttributeMapper implements RowMapper<CatalogProductLinkAttribute> {

    @Override
    public CatalogProductLinkAttribute mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductLinkAttribute catalogProductLinkAttribute = new CatalogProductLinkAttribute();
        catalogProductLinkAttribute.setProductLinkAttributeId(rs.getInt("product_link_attribute_id"));
        catalogProductLinkAttribute.setLinkTypeId(rs.getInt("link_type_id"));
        catalogProductLinkAttribute.setProductLinkAttributeCode(rs.getString("product_link_attribute_code"));
        catalogProductLinkAttribute.setDataType(rs.getString("data_type"));
        return catalogProductLinkAttribute;
    }

}

