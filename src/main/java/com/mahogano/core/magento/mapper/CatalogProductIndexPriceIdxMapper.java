package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductIndexPriceIdx;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductIndexPriceIdxMapper implements RowMapper<CatalogProductIndexPriceIdx> {

    @Override
    public CatalogProductIndexPriceIdx mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductIndexPriceIdx catalogProductIndexPriceIdx = new CatalogProductIndexPriceIdx();
        catalogProductIndexPriceIdx.setEntityId(rs.getInt("entity_id"));
        catalogProductIndexPriceIdx.setCustomerGroupId(rs.getInt("customer_group_id"));
        catalogProductIndexPriceIdx.setWebsiteId(rs.getInt("website_id"));
        catalogProductIndexPriceIdx.setTaxClassId(rs.getInt("tax_class_id"));
        catalogProductIndexPriceIdx.setPrice(rs.getBigDecimal("price"));
        catalogProductIndexPriceIdx.setFinalPrice(rs.getBigDecimal("final_price"));
        catalogProductIndexPriceIdx.setMinPrice(rs.getBigDecimal("min_price"));
        catalogProductIndexPriceIdx.setMaxPrice(rs.getBigDecimal("max_price"));
        catalogProductIndexPriceIdx.setTierPrice(rs.getBigDecimal("tier_price"));
        catalogProductIndexPriceIdx.setGroupPrice(rs.getBigDecimal("group_price"));
        return catalogProductIndexPriceIdx;
    }

}

