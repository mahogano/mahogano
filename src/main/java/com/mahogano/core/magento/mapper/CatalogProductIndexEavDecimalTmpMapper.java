package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductIndexEavDecimalTmp;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductIndexEavDecimalTmpMapper implements RowMapper<CatalogProductIndexEavDecimalTmp> {

    @Override
    public CatalogProductIndexEavDecimalTmp mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductIndexEavDecimalTmp catalogProductIndexEavDecimalTmp = new CatalogProductIndexEavDecimalTmp();
        catalogProductIndexEavDecimalTmp.setEntityId(rs.getInt("entity_id"));
        catalogProductIndexEavDecimalTmp.setAttributeId(rs.getInt("attribute_id"));
        catalogProductIndexEavDecimalTmp.setStoreId(rs.getInt("store_id"));
        catalogProductIndexEavDecimalTmp.setValue(rs.getBigDecimal("value"));
        return catalogProductIndexEavDecimalTmp;
    }

}

