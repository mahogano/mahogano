package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductIndexPriceCfgOptAgrTmp;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductIndexPriceCfgOptAgrTmpMapper implements RowMapper<CatalogProductIndexPriceCfgOptAgrTmp> {

    @Override
    public CatalogProductIndexPriceCfgOptAgrTmp mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductIndexPriceCfgOptAgrTmp catalogProductIndexPriceCfgOptAgrTmp = new CatalogProductIndexPriceCfgOptAgrTmp();
        catalogProductIndexPriceCfgOptAgrTmp.setParentId(rs.getInt("parent_id"));
        catalogProductIndexPriceCfgOptAgrTmp.setChildId(rs.getInt("child_id"));
        catalogProductIndexPriceCfgOptAgrTmp.setCustomerGroupId(rs.getInt("customer_group_id"));
        catalogProductIndexPriceCfgOptAgrTmp.setWebsiteId(rs.getInt("website_id"));
        catalogProductIndexPriceCfgOptAgrTmp.setPrice(rs.getBigDecimal("price"));
        catalogProductIndexPriceCfgOptAgrTmp.setTierPrice(rs.getBigDecimal("tier_price"));
        catalogProductIndexPriceCfgOptAgrTmp.setGroupPrice(rs.getBigDecimal("group_price"));
        return catalogProductIndexPriceCfgOptAgrTmp;
    }

}

