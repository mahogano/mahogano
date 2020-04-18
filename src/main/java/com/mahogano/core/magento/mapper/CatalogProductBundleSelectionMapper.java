package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductBundleSelection;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductBundleSelectionMapper implements RowMapper<CatalogProductBundleSelection> {

    @Override
    public CatalogProductBundleSelection mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductBundleSelection catalogProductBundleSelection = new CatalogProductBundleSelection();
        catalogProductBundleSelection.setSelectionId(rs.getInt("selection_id"));
        catalogProductBundleSelection.setOptionId(rs.getInt("option_id"));
        catalogProductBundleSelection.setParentProductId(rs.getInt("parent_product_id"));
        catalogProductBundleSelection.setProductId(rs.getInt("product_id"));
        catalogProductBundleSelection.setPosition(rs.getInt("position"));
        catalogProductBundleSelection.setIsDefault(rs.getInt("is_default"));
        catalogProductBundleSelection.setSelectionPriceType(rs.getInt("selection_price_type"));
        catalogProductBundleSelection.setSelectionPriceValue(rs.getBigDecimal("selection_price_value"));
        catalogProductBundleSelection.setSelectionQty(rs.getBigDecimal("selection_qty"));
        catalogProductBundleSelection.setSelectionCanChangeQty(rs.getInt("selection_can_change_qty"));
        return catalogProductBundleSelection;
    }

}

