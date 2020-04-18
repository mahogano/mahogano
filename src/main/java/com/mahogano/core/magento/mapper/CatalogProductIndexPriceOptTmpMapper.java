package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductIndexPriceOptTmp;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductIndexPriceOptTmpMapper implements RowMapper<CatalogProductIndexPriceOptTmp> {

    @Override
    public CatalogProductIndexPriceOptTmp mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductIndexPriceOptTmp catalogProductIndexPriceOptTmp = new CatalogProductIndexPriceOptTmp();
        catalogProductIndexPriceOptTmp.setEntityId(rs.getInt("entity_id"));
        catalogProductIndexPriceOptTmp.setCustomerGroupId(rs.getInt("customer_group_id"));
        catalogProductIndexPriceOptTmp.setWebsiteId(rs.getInt("website_id"));
        catalogProductIndexPriceOptTmp.setMinPrice(rs.getBigDecimal("min_price"));
        catalogProductIndexPriceOptTmp.setMaxPrice(rs.getBigDecimal("max_price"));
        catalogProductIndexPriceOptTmp.setTierPrice(rs.getBigDecimal("tier_price"));
        catalogProductIndexPriceOptTmp.setGroupPrice(rs.getBigDecimal("group_price"));
        return catalogProductIndexPriceOptTmp;
    }

}

