package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.AdminAssert;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminAssertMapper implements RowMapper<AdminAssert> {

    @Override
    public AdminAssert mapRow(ResultSet rs, int i) throws SQLException {
        AdminAssert adminAssert = new AdminAssert();
        adminAssert.setAssertId(rs.getInt("assert_id"));
        adminAssert.setAssertType(rs.getString("assert_type"));
        adminAssert.setAssertData(rs.getString("assert_data"));
        return adminAssert;
    }

}

