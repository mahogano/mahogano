package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.ApiAssert;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ApiAssertMapper implements RowMapper<ApiAssert> {

    @Override
    public ApiAssert mapRow(ResultSet rs, int i) throws SQLException {
        ApiAssert apiAssert = new ApiAssert();
        apiAssert.setAssertId(rs.getInt("assert_id"));
        apiAssert.setAssertType(rs.getString("assert_type"));
        apiAssert.setAssertData(rs.getString("assert_data"));
        return apiAssert;
    }

}

