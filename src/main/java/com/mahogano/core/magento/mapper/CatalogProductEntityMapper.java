package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductEntity;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductEntityMapper implements RowMapper<CatalogProductEntity> {

    @Override
    public CatalogProductEntity mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductEntity catalogProductEntity = new CatalogProductEntity();
        catalogProductEntity.setEntityId(rs.getInt("entity_id"));
        catalogProductEntity.setEntityTypeId(rs.getInt("entity_type_id"));
        catalogProductEntity.setAttributeSetId(rs.getInt("attribute_set_id"));
        catalogProductEntity.setTypeId(rs.getString("type_id"));
        catalogProductEntity.setSku(rs.getString("sku"));
        catalogProductEntity.setHasOptions(rs.getInt("has_options"));
        catalogProductEntity.setRequiredOptions(rs.getInt("required_options"));
        catalogProductEntity.setCreatedAt(rs.getTimestamp("created_at") != null ? rs.getTimestamp("created_at").toLocalDateTime() : null);
        catalogProductEntity.setUpdatedAt(rs.getTimestamp("updated_at") != null ? rs.getTimestamp("updated_at").toLocalDateTime() : null);
        return catalogProductEntity;
    }

}

