package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductIndexEavDecimalIdx;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductIndexEavDecimalIdxMapper implements RowMapper<CatalogProductIndexEavDecimalIdx> {

    @Override
    public CatalogProductIndexEavDecimalIdx mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductIndexEavDecimalIdx catalogProductIndexEavDecimalIdx = new CatalogProductIndexEavDecimalIdx();
        catalogProductIndexEavDecimalIdx.setEntityId(rs.getInt("entity_id"));
        catalogProductIndexEavDecimalIdx.setAttributeId(rs.getInt("attribute_id"));
        catalogProductIndexEavDecimalIdx.setStoreId(rs.getInt("store_id"));
        catalogProductIndexEavDecimalIdx.setValue(rs.getBigDecimal("value"));
        return catalogProductIndexEavDecimalIdx;
    }

}

