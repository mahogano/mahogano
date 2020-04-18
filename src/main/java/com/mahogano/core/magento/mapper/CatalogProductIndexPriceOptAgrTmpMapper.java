package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductIndexPriceOptAgrTmp;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductIndexPriceOptAgrTmpMapper implements RowMapper<CatalogProductIndexPriceOptAgrTmp> {

    @Override
    public CatalogProductIndexPriceOptAgrTmp mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductIndexPriceOptAgrTmp catalogProductIndexPriceOptAgrTmp = new CatalogProductIndexPriceOptAgrTmp();
        catalogProductIndexPriceOptAgrTmp.setEntityId(rs.getInt("entity_id"));
        catalogProductIndexPriceOptAgrTmp.setCustomerGroupId(rs.getInt("customer_group_id"));
        catalogProductIndexPriceOptAgrTmp.setWebsiteId(rs.getInt("website_id"));
        catalogProductIndexPriceOptAgrTmp.setOptionId(rs.getInt("option_id"));
        catalogProductIndexPriceOptAgrTmp.setMinPrice(rs.getBigDecimal("min_price"));
        catalogProductIndexPriceOptAgrTmp.setMaxPrice(rs.getBigDecimal("max_price"));
        catalogProductIndexPriceOptAgrTmp.setTierPrice(rs.getBigDecimal("tier_price"));
        catalogProductIndexPriceOptAgrTmp.setGroupPrice(rs.getBigDecimal("group_price"));
        return catalogProductIndexPriceOptAgrTmp;
    }

}

