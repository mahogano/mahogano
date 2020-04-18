package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogCategoryEntityDatetime;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogCategoryEntityDatetimeMapper implements RowMapper<CatalogCategoryEntityDatetime> {

    @Override
    public CatalogCategoryEntityDatetime mapRow(ResultSet rs, int i) throws SQLException {
        CatalogCategoryEntityDatetime catalogCategoryEntityDatetime = new CatalogCategoryEntityDatetime();
        catalogCategoryEntityDatetime.setValueId(rs.getInt("value_id"));
        catalogCategoryEntityDatetime.setEntityTypeId(rs.getInt("entity_type_id"));
        catalogCategoryEntityDatetime.setAttributeId(rs.getInt("attribute_id"));
        catalogCategoryEntityDatetime.setStoreId(rs.getInt("store_id"));
        catalogCategoryEntityDatetime.setEntityId(rs.getInt("entity_id"));
        catalogCategoryEntityDatetime.setValue(rs.getTimestamp("value") != null ? rs.getTimestamp("value").toLocalDateTime() : null);
        return catalogCategoryEntityDatetime;
    }

}

