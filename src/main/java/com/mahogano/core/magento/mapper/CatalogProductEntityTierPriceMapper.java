package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductEntityTierPrice;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductEntityTierPriceMapper implements RowMapper<CatalogProductEntityTierPrice> {

    @Override
    public CatalogProductEntityTierPrice mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductEntityTierPrice catalogProductEntityTierPrice = new CatalogProductEntityTierPrice();
        catalogProductEntityTierPrice.setValueId(rs.getInt("value_id"));
        catalogProductEntityTierPrice.setEntityId(rs.getInt("entity_id"));
        catalogProductEntityTierPrice.setAllGroups(rs.getInt("all_groups"));
        catalogProductEntityTierPrice.setCustomerGroupId(rs.getInt("customer_group_id"));
        catalogProductEntityTierPrice.setQty(rs.getBigDecimal("qty"));
        catalogProductEntityTierPrice.setValue(rs.getBigDecimal("value"));
        catalogProductEntityTierPrice.setWebsiteId(rs.getInt("website_id"));
        return catalogProductEntityTierPrice;
    }

}

