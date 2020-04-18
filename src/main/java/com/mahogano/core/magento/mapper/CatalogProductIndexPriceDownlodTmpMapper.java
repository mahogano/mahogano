package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductIndexPriceDownlodTmp;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductIndexPriceDownlodTmpMapper implements RowMapper<CatalogProductIndexPriceDownlodTmp> {

    @Override
    public CatalogProductIndexPriceDownlodTmp mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductIndexPriceDownlodTmp catalogProductIndexPriceDownlodTmp = new CatalogProductIndexPriceDownlodTmp();
        catalogProductIndexPriceDownlodTmp.setEntityId(rs.getInt("entity_id"));
        catalogProductIndexPriceDownlodTmp.setCustomerGroupId(rs.getInt("customer_group_id"));
        catalogProductIndexPriceDownlodTmp.setWebsiteId(rs.getInt("website_id"));
        catalogProductIndexPriceDownlodTmp.setMinPrice(rs.getBigDecimal("min_price"));
        catalogProductIndexPriceDownlodTmp.setMaxPrice(rs.getBigDecimal("max_price"));
        return catalogProductIndexPriceDownlodTmp;
    }

}

