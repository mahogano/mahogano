package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductIndexGroupPrice;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductIndexGroupPriceMapper implements RowMapper<CatalogProductIndexGroupPrice> {

    @Override
    public CatalogProductIndexGroupPrice mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductIndexGroupPrice catalogProductIndexGroupPrice = new CatalogProductIndexGroupPrice();
        catalogProductIndexGroupPrice.setEntityId(rs.getInt("entity_id"));
        catalogProductIndexGroupPrice.setCustomerGroupId(rs.getInt("customer_group_id"));
        catalogProductIndexGroupPrice.setWebsiteId(rs.getInt("website_id"));
        catalogProductIndexGroupPrice.setPrice(rs.getBigDecimal("price"));
        return catalogProductIndexGroupPrice;
    }

}

