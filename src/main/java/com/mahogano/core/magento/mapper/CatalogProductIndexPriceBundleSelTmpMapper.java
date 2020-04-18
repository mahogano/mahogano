package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductIndexPriceBundleSelTmp;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductIndexPriceBundleSelTmpMapper implements RowMapper<CatalogProductIndexPriceBundleSelTmp> {

    @Override
    public CatalogProductIndexPriceBundleSelTmp mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductIndexPriceBundleSelTmp catalogProductIndexPriceBundleSelTmp = new CatalogProductIndexPriceBundleSelTmp();
        catalogProductIndexPriceBundleSelTmp.setEntityId(rs.getInt("entity_id"));
        catalogProductIndexPriceBundleSelTmp.setCustomerGroupId(rs.getInt("customer_group_id"));
        catalogProductIndexPriceBundleSelTmp.setWebsiteId(rs.getInt("website_id"));
        catalogProductIndexPriceBundleSelTmp.setOptionId(rs.getInt("option_id"));
        catalogProductIndexPriceBundleSelTmp.setSelectionId(rs.getInt("selection_id"));
        catalogProductIndexPriceBundleSelTmp.setGroupType(rs.getInt("group_type"));
        catalogProductIndexPriceBundleSelTmp.setIsRequired(rs.getInt("is_required"));
        catalogProductIndexPriceBundleSelTmp.setPrice(rs.getBigDecimal("price"));
        catalogProductIndexPriceBundleSelTmp.setTierPrice(rs.getBigDecimal("tier_price"));
        catalogProductIndexPriceBundleSelTmp.setGroupPrice(rs.getBigDecimal("group_price"));
        return catalogProductIndexPriceBundleSelTmp;
    }

}

