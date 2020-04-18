package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductEntityGroupPrice;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductEntityGroupPriceMapper implements RowMapper<CatalogProductEntityGroupPrice> {

    @Override
    public CatalogProductEntityGroupPrice mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductEntityGroupPrice catalogProductEntityGroupPrice = new CatalogProductEntityGroupPrice();
        catalogProductEntityGroupPrice.setValueId(rs.getInt("value_id"));
        catalogProductEntityGroupPrice.setEntityId(rs.getInt("entity_id"));
        catalogProductEntityGroupPrice.setAllGroups(rs.getInt("all_groups"));
        catalogProductEntityGroupPrice.setCustomerGroupId(rs.getInt("customer_group_id"));
        catalogProductEntityGroupPrice.setValue(rs.getBigDecimal("value"));
        catalogProductEntityGroupPrice.setWebsiteId(rs.getInt("website_id"));
        catalogProductEntityGroupPrice.setIsPercent(rs.getInt("is_percent"));
        return catalogProductEntityGroupPrice;
    }

}

