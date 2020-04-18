package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.EavFormTypeEntity;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EavFormTypeEntityMapper implements RowMapper<EavFormTypeEntity> {

    @Override
    public EavFormTypeEntity mapRow(ResultSet rs, int i) throws SQLException {
        EavFormTypeEntity eavFormTypeEntity = new EavFormTypeEntity();
        eavFormTypeEntity.setTypeId(rs.getInt("type_id"));
        eavFormTypeEntity.setEntityTypeId(rs.getInt("entity_type_id"));
        return eavFormTypeEntity;
    }

}

