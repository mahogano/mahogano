package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductIndexPriceOptIdx;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductIndexPriceOptIdxMapper implements RowMapper<CatalogProductIndexPriceOptIdx> {

    @Override
    public CatalogProductIndexPriceOptIdx mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductIndexPriceOptIdx catalogProductIndexPriceOptIdx = new CatalogProductIndexPriceOptIdx();
        catalogProductIndexPriceOptIdx.setEntityId(rs.getInt("entity_id"));
        catalogProductIndexPriceOptIdx.setCustomerGroupId(rs.getInt("customer_group_id"));
        catalogProductIndexPriceOptIdx.setWebsiteId(rs.getInt("website_id"));
        catalogProductIndexPriceOptIdx.setMinPrice(rs.getBigDecimal("min_price"));
        catalogProductIndexPriceOptIdx.setMaxPrice(rs.getBigDecimal("max_price"));
        catalogProductIndexPriceOptIdx.setTierPrice(rs.getBigDecimal("tier_price"));
        catalogProductIndexPriceOptIdx.setGroupPrice(rs.getBigDecimal("group_price"));
        return catalogProductIndexPriceOptIdx;
    }

}

