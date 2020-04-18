package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductBundleSelectionPrice;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductBundleSelectionPriceMapper implements RowMapper<CatalogProductBundleSelectionPrice> {

    @Override
    public CatalogProductBundleSelectionPrice mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductBundleSelectionPrice catalogProductBundleSelectionPrice = new CatalogProductBundleSelectionPrice();
        catalogProductBundleSelectionPrice.setSelectionId(rs.getInt("selection_id"));
        catalogProductBundleSelectionPrice.setWebsiteId(rs.getInt("website_id"));
        catalogProductBundleSelectionPrice.setSelectionPriceType(rs.getInt("selection_price_type"));
        catalogProductBundleSelectionPrice.setSelectionPriceValue(rs.getBigDecimal("selection_price_value"));
        return catalogProductBundleSelectionPrice;
    }

}

