package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductIndexTierPrice;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductIndexTierPriceMapper implements RowMapper<CatalogProductIndexTierPrice> {

    @Override
    public CatalogProductIndexTierPrice mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductIndexTierPrice catalogProductIndexTierPrice = new CatalogProductIndexTierPrice();
        catalogProductIndexTierPrice.setEntityId(rs.getInt("entity_id"));
        catalogProductIndexTierPrice.setCustomerGroupId(rs.getInt("customer_group_id"));
        catalogProductIndexTierPrice.setWebsiteId(rs.getInt("website_id"));
        catalogProductIndexTierPrice.setMinPrice(rs.getBigDecimal("min_price"));
        return catalogProductIndexTierPrice;
    }

}

