package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductIndexPriceOptAgrIdx;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductIndexPriceOptAgrIdxMapper implements RowMapper<CatalogProductIndexPriceOptAgrIdx> {

    @Override
    public CatalogProductIndexPriceOptAgrIdx mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductIndexPriceOptAgrIdx catalogProductIndexPriceOptAgrIdx = new CatalogProductIndexPriceOptAgrIdx();
        catalogProductIndexPriceOptAgrIdx.setEntityId(rs.getInt("entity_id"));
        catalogProductIndexPriceOptAgrIdx.setCustomerGroupId(rs.getInt("customer_group_id"));
        catalogProductIndexPriceOptAgrIdx.setWebsiteId(rs.getInt("website_id"));
        catalogProductIndexPriceOptAgrIdx.setOptionId(rs.getInt("option_id"));
        catalogProductIndexPriceOptAgrIdx.setMinPrice(rs.getBigDecimal("min_price"));
        catalogProductIndexPriceOptAgrIdx.setMaxPrice(rs.getBigDecimal("max_price"));
        catalogProductIndexPriceOptAgrIdx.setTierPrice(rs.getBigDecimal("tier_price"));
        catalogProductIndexPriceOptAgrIdx.setGroupPrice(rs.getBigDecimal("group_price"));
        return catalogProductIndexPriceOptAgrIdx;
    }

}

