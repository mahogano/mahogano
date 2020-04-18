package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductOptionTypeValue;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductOptionTypeValueMapper implements RowMapper<CatalogProductOptionTypeValue> {

    @Override
    public CatalogProductOptionTypeValue mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductOptionTypeValue catalogProductOptionTypeValue = new CatalogProductOptionTypeValue();
        catalogProductOptionTypeValue.setOptionTypeId(rs.getInt("option_type_id"));
        catalogProductOptionTypeValue.setOptionId(rs.getInt("option_id"));
        catalogProductOptionTypeValue.setSku(rs.getString("sku"));
        catalogProductOptionTypeValue.setSortOrder(rs.getInt("sort_order"));
        return catalogProductOptionTypeValue;
    }

}

