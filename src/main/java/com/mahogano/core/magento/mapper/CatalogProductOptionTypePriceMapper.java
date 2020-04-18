package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductOptionTypePrice;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductOptionTypePriceMapper implements RowMapper<CatalogProductOptionTypePrice> {

    @Override
    public CatalogProductOptionTypePrice mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductOptionTypePrice catalogProductOptionTypePrice = new CatalogProductOptionTypePrice();
        catalogProductOptionTypePrice.setOptionTypePriceId(rs.getInt("option_type_price_id"));
        catalogProductOptionTypePrice.setOptionTypeId(rs.getInt("option_type_id"));
        catalogProductOptionTypePrice.setStoreId(rs.getInt("store_id"));
        catalogProductOptionTypePrice.setPrice(rs.getBigDecimal("price"));
        catalogProductOptionTypePrice.setPriceType(rs.getString("price_type"));
        return catalogProductOptionTypePrice;
    }

}

