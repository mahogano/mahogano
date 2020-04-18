package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductIndexEavIdx;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductIndexEavIdxMapper implements RowMapper<CatalogProductIndexEavIdx> {

    @Override
    public CatalogProductIndexEavIdx mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductIndexEavIdx catalogProductIndexEavIdx = new CatalogProductIndexEavIdx();
        catalogProductIndexEavIdx.setEntityId(rs.getInt("entity_id"));
        catalogProductIndexEavIdx.setAttributeId(rs.getInt("attribute_id"));
        catalogProductIndexEavIdx.setStoreId(rs.getInt("store_id"));
        catalogProductIndexEavIdx.setValue(rs.getInt("value"));
        return catalogProductIndexEavIdx;
    }

}

