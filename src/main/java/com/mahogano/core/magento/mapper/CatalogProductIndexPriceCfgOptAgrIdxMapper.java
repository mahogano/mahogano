package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductIndexPriceCfgOptAgrIdx;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductIndexPriceCfgOptAgrIdxMapper implements RowMapper<CatalogProductIndexPriceCfgOptAgrIdx> {

    @Override
    public CatalogProductIndexPriceCfgOptAgrIdx mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductIndexPriceCfgOptAgrIdx catalogProductIndexPriceCfgOptAgrIdx = new CatalogProductIndexPriceCfgOptAgrIdx();
        catalogProductIndexPriceCfgOptAgrIdx.setParentId(rs.getInt("parent_id"));
        catalogProductIndexPriceCfgOptAgrIdx.setChildId(rs.getInt("child_id"));
        catalogProductIndexPriceCfgOptAgrIdx.setCustomerGroupId(rs.getInt("customer_group_id"));
        catalogProductIndexPriceCfgOptAgrIdx.setWebsiteId(rs.getInt("website_id"));
        catalogProductIndexPriceCfgOptAgrIdx.setPrice(rs.getBigDecimal("price"));
        catalogProductIndexPriceCfgOptAgrIdx.setTierPrice(rs.getBigDecimal("tier_price"));
        catalogProductIndexPriceCfgOptAgrIdx.setGroupPrice(rs.getBigDecimal("group_price"));
        return catalogProductIndexPriceCfgOptAgrIdx;
    }

}

