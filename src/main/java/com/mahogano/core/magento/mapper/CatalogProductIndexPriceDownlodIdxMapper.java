package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductIndexPriceDownlodIdx;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductIndexPriceDownlodIdxMapper implements RowMapper<CatalogProductIndexPriceDownlodIdx> {

    @Override
    public CatalogProductIndexPriceDownlodIdx mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductIndexPriceDownlodIdx catalogProductIndexPriceDownlodIdx = new CatalogProductIndexPriceDownlodIdx();
        catalogProductIndexPriceDownlodIdx.setEntityId(rs.getInt("entity_id"));
        catalogProductIndexPriceDownlodIdx.setCustomerGroupId(rs.getInt("customer_group_id"));
        catalogProductIndexPriceDownlodIdx.setWebsiteId(rs.getInt("website_id"));
        catalogProductIndexPriceDownlodIdx.setMinPrice(rs.getBigDecimal("min_price"));
        catalogProductIndexPriceDownlodIdx.setMaxPrice(rs.getBigDecimal("max_price"));
        return catalogProductIndexPriceDownlodIdx;
    }

}

