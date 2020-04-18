package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductIndexPriceCfgOptIdx;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductIndexPriceCfgOptIdxMapper implements RowMapper<CatalogProductIndexPriceCfgOptIdx> {

    @Override
    public CatalogProductIndexPriceCfgOptIdx mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductIndexPriceCfgOptIdx catalogProductIndexPriceCfgOptIdx = new CatalogProductIndexPriceCfgOptIdx();
        catalogProductIndexPriceCfgOptIdx.setEntityId(rs.getInt("entity_id"));
        catalogProductIndexPriceCfgOptIdx.setCustomerGroupId(rs.getInt("customer_group_id"));
        catalogProductIndexPriceCfgOptIdx.setWebsiteId(rs.getInt("website_id"));
        catalogProductIndexPriceCfgOptIdx.setMinPrice(rs.getBigDecimal("min_price"));
        catalogProductIndexPriceCfgOptIdx.setMaxPrice(rs.getBigDecimal("max_price"));
        catalogProductIndexPriceCfgOptIdx.setTierPrice(rs.getBigDecimal("tier_price"));
        catalogProductIndexPriceCfgOptIdx.setGroupPrice(rs.getBigDecimal("group_price"));
        return catalogProductIndexPriceCfgOptIdx;
    }

}

