package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductIndexPriceCfgOptTmp;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductIndexPriceCfgOptTmpMapper implements RowMapper<CatalogProductIndexPriceCfgOptTmp> {

    @Override
    public CatalogProductIndexPriceCfgOptTmp mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductIndexPriceCfgOptTmp catalogProductIndexPriceCfgOptTmp = new CatalogProductIndexPriceCfgOptTmp();
        catalogProductIndexPriceCfgOptTmp.setEntityId(rs.getInt("entity_id"));
        catalogProductIndexPriceCfgOptTmp.setCustomerGroupId(rs.getInt("customer_group_id"));
        catalogProductIndexPriceCfgOptTmp.setWebsiteId(rs.getInt("website_id"));
        catalogProductIndexPriceCfgOptTmp.setMinPrice(rs.getBigDecimal("min_price"));
        catalogProductIndexPriceCfgOptTmp.setMaxPrice(rs.getBigDecimal("max_price"));
        catalogProductIndexPriceCfgOptTmp.setTierPrice(rs.getBigDecimal("tier_price"));
        catalogProductIndexPriceCfgOptTmp.setGroupPrice(rs.getBigDecimal("group_price"));
        return catalogProductIndexPriceCfgOptTmp;
    }

}

