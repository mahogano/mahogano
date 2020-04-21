package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CustomizedData;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomizedDataMapper implements RowMapper<CustomizedData> {

    @Override
    public CustomizedData mapRow(ResultSet rs, int i) throws SQLException {
        CustomizedData customizedData = new CustomizedData();
        customizedData.setIdCustomization(rs.getInt("id_customization"));
        customizedData.setType(rs.getInt("type"));
        customizedData.setIndex(rs.getInt("index"));
        customizedData.setValue(rs.getString("value"));
        customizedData.setIdModule(rs.getInt("id_module"));
        customizedData.setPrice(rs.getBigDecimal("price"));
        customizedData.setWeight(rs.getBigDecimal("weight"));
        return customizedData;
    }

}

