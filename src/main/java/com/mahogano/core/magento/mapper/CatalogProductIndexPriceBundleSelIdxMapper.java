package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductIndexPriceBundleSelIdx;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductIndexPriceBundleSelIdxMapper implements RowMapper<CatalogProductIndexPriceBundleSelIdx> {

    @Override
    public CatalogProductIndexPriceBundleSelIdx mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductIndexPriceBundleSelIdx catalogProductIndexPriceBundleSelIdx = new CatalogProductIndexPriceBundleSelIdx();
        catalogProductIndexPriceBundleSelIdx.setEntityId(rs.getInt("entity_id"));
        catalogProductIndexPriceBundleSelIdx.setCustomerGroupId(rs.getInt("customer_group_id"));
        catalogProductIndexPriceBundleSelIdx.setWebsiteId(rs.getInt("website_id"));
        catalogProductIndexPriceBundleSelIdx.setOptionId(rs.getInt("option_id"));
        catalogProductIndexPriceBundleSelIdx.setSelectionId(rs.getInt("selection_id"));
        catalogProductIndexPriceBundleSelIdx.setGroupType(rs.getInt("group_type"));
        catalogProductIndexPriceBundleSelIdx.setIsRequired(rs.getInt("is_required"));
        catalogProductIndexPriceBundleSelIdx.setPrice(rs.getBigDecimal("price"));
        catalogProductIndexPriceBundleSelIdx.setTierPrice(rs.getBigDecimal("tier_price"));
        catalogProductIndexPriceBundleSelIdx.setGroupPrice(rs.getBigDecimal("group_price"));
        return catalogProductIndexPriceBundleSelIdx;
    }

}

