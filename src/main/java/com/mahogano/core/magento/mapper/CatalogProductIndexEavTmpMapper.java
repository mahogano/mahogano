package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductIndexEavTmp;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductIndexEavTmpMapper implements RowMapper<CatalogProductIndexEavTmp> {

    @Override
    public CatalogProductIndexEavTmp mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductIndexEavTmp catalogProductIndexEavTmp = new CatalogProductIndexEavTmp();
        catalogProductIndexEavTmp.setEntityId(rs.getInt("entity_id"));
        catalogProductIndexEavTmp.setAttributeId(rs.getInt("attribute_id"));
        catalogProductIndexEavTmp.setStoreId(rs.getInt("store_id"));
        catalogProductIndexEavTmp.setValue(rs.getInt("value"));
        return catalogProductIndexEavTmp;
    }

}

