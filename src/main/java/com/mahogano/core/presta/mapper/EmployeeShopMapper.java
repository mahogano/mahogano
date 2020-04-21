package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.EmployeeShop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeShopMapper implements RowMapper<EmployeeShop> {

    @Override
    public EmployeeShop mapRow(ResultSet rs, int i) throws SQLException {
        EmployeeShop employeeShop = new EmployeeShop();
        employeeShop.setIdEmployee(rs.getInt("id_employee"));
        employeeShop.setIdShop(rs.getInt("id_shop"));
        return employeeShop;
    }

}

