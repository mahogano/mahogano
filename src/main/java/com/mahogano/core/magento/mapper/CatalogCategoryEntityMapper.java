package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogCategoryEntity;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogCategoryEntityMapper implements RowMapper<CatalogCategoryEntity> {

    @Override
    public CatalogCategoryEntity mapRow(ResultSet rs, int i) throws SQLException {
        CatalogCategoryEntity catalogCategoryEntity = new CatalogCategoryEntity();
        catalogCategoryEntity.setEntityId(rs.getInt("entity_id"));
        catalogCategoryEntity.setEntityTypeId(rs.getInt("entity_type_id"));
        catalogCategoryEntity.setAttributeSetId(rs.getInt("attribute_set_id"));
        catalogCategoryEntity.setParentId(rs.getInt("parent_id"));
        catalogCategoryEntity.setCreatedAt(rs.getTimestamp("created_at") != null ? rs.getTimestamp("created_at").toLocalDateTime() : null);
        catalogCategoryEntity.setUpdatedAt(rs.getTimestamp("updated_at") != null ? rs.getTimestamp("updated_at").toLocalDateTime() : null);
        catalogCategoryEntity.setPath(rs.getString("path"));
        catalogCategoryEntity.setPosition(rs.getInt("position"));
        catalogCategoryEntity.setLevel(rs.getInt("level"));
        catalogCategoryEntity.setChildrenCount(rs.getInt("children_count"));
        return catalogCategoryEntity;
    }

}

