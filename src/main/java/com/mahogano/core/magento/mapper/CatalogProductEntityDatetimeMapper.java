package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductEntityDatetime;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductEntityDatetimeMapper implements RowMapper<CatalogProductEntityDatetime> {

    @Override
    public CatalogProductEntityDatetime mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductEntityDatetime catalogProductEntityDatetime = new CatalogProductEntityDatetime();
        catalogProductEntityDatetime.setValueId(rs.getInt("value_id"));
        catalogProductEntityDatetime.setEntityTypeId(rs.getInt("entity_type_id"));
        catalogProductEntityDatetime.setAttributeId(rs.getInt("attribute_id"));
        catalogProductEntityDatetime.setStoreId(rs.getInt("store_id"));
        catalogProductEntityDatetime.setEntityId(rs.getInt("entity_id"));
        catalogProductEntityDatetime.setValue(rs.getTimestamp("value") != null ? rs.getTimestamp("value").toLocalDateTime() : null);
        return catalogProductEntityDatetime;
    }

}

