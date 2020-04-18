package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.EavEntity;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EavEntityMapper implements RowMapper<EavEntity> {

    @Override
    public EavEntity mapRow(ResultSet rs, int i) throws SQLException {
        EavEntity eavEntity = new EavEntity();
        eavEntity.setEntityId(rs.getInt("entity_id"));
        eavEntity.setEntityTypeId(rs.getInt("entity_type_id"));
        eavEntity.setAttributeSetId(rs.getInt("attribute_set_id"));
        eavEntity.setIncrementId(rs.getString("increment_id"));
        eavEntity.setParentId(rs.getInt("parent_id"));
        eavEntity.setStoreId(rs.getInt("store_id"));
        eavEntity.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        eavEntity.setUpdatedAt(rs.getTimestamp("updated_at").toLocalDateTime());
        eavEntity.setIsActive(rs.getInt("is_active"));
        return eavEntity;
    }

}

