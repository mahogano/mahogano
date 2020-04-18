package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductOptionPrice;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductOptionPriceMapper implements RowMapper<CatalogProductOptionPrice> {

    @Override
    public CatalogProductOptionPrice mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductOptionPrice catalogProductOptionPrice = new CatalogProductOptionPrice();
        catalogProductOptionPrice.setOptionPriceId(rs.getInt("option_price_id"));
        catalogProductOptionPrice.setOptionId(rs.getInt("option_id"));
        catalogProductOptionPrice.setStoreId(rs.getInt("store_id"));
        catalogProductOptionPrice.setPrice(rs.getBigDecimal("price"));
        catalogProductOptionPrice.setPriceType(rs.getString("price_type"));
        return catalogProductOptionPrice;
    }

}

