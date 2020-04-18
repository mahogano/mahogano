package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.EavFormType;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EavFormTypeMapper implements RowMapper<EavFormType> {

    @Override
    public EavFormType mapRow(ResultSet rs, int i) throws SQLException {
        EavFormType eavFormType = new EavFormType();
        eavFormType.setTypeId(rs.getInt("type_id"));
        eavFormType.setCode(rs.getString("code"));
        eavFormType.setLabel(rs.getString("label"));
        eavFormType.setIsSystem(rs.getInt("is_system"));
        eavFormType.setTheme(rs.getString("theme"));
        eavFormType.setStoreId(rs.getInt("store_id"));
        return eavFormType;
    }

}

