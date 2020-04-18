package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductIndexPriceTmp;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductIndexPriceTmpMapper implements RowMapper<CatalogProductIndexPriceTmp> {

    @Override
    public CatalogProductIndexPriceTmp mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductIndexPriceTmp catalogProductIndexPriceTmp = new CatalogProductIndexPriceTmp();
        catalogProductIndexPriceTmp.setEntityId(rs.getInt("entity_id"));
        catalogProductIndexPriceTmp.setCustomerGroupId(rs.getInt("customer_group_id"));
        catalogProductIndexPriceTmp.setWebsiteId(rs.getInt("website_id"));
        catalogProductIndexPriceTmp.setTaxClassId(rs.getInt("tax_class_id"));
        catalogProductIndexPriceTmp.setPrice(rs.getBigDecimal("price"));
        catalogProductIndexPriceTmp.setFinalPrice(rs.getBigDecimal("final_price"));
        catalogProductIndexPriceTmp.setMinPrice(rs.getBigDecimal("min_price"));
        catalogProductIndexPriceTmp.setMaxPrice(rs.getBigDecimal("max_price"));
        catalogProductIndexPriceTmp.setTierPrice(rs.getBigDecimal("tier_price"));
        catalogProductIndexPriceTmp.setGroupPrice(rs.getBigDecimal("group_price"));
        return catalogProductIndexPriceTmp;
    }

}

