package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductSuperAttributeLabel;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductSuperAttributeLabelMapper implements RowMapper<CatalogProductSuperAttributeLabel> {

    @Override
    public CatalogProductSuperAttributeLabel mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductSuperAttributeLabel catalogProductSuperAttributeLabel = new CatalogProductSuperAttributeLabel();
        catalogProductSuperAttributeLabel.setValueId(rs.getInt("value_id"));
        catalogProductSuperAttributeLabel.setProductSuperAttributeId(rs.getInt("product_super_attribute_id"));
        catalogProductSuperAttributeLabel.setStoreId(rs.getInt("store_id"));
        catalogProductSuperAttributeLabel.setUseDefault(rs.getInt("use_default"));
        catalogProductSuperAttributeLabel.setValue(rs.getString("value"));
        return catalogProductSuperAttributeLabel;
    }

}

