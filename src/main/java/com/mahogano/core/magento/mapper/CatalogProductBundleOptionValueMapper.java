package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductBundleOptionValue;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductBundleOptionValueMapper implements RowMapper<CatalogProductBundleOptionValue> {

    @Override
    public CatalogProductBundleOptionValue mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductBundleOptionValue catalogProductBundleOptionValue = new CatalogProductBundleOptionValue();
        catalogProductBundleOptionValue.setValueId(rs.getInt("value_id"));
        catalogProductBundleOptionValue.setOptionId(rs.getInt("option_id"));
        catalogProductBundleOptionValue.setStoreId(rs.getInt("store_id"));
        catalogProductBundleOptionValue.setTitle(rs.getString("title"));
        return catalogProductBundleOptionValue;
    }

}

