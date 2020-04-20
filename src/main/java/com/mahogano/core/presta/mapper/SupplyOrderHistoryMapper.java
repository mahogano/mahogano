package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.SupplyOrderHistory;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SupplyOrderHistoryMapper implements RowMapper<SupplyOrderHistory> {

    @Override
    public SupplyOrderHistory mapRow(ResultSet rs, int i) throws SQLException {
        SupplyOrderHistory supplyOrderHistory = new SupplyOrderHistory();
        supplyOrderHistory.setIdSupplyOrderHistory(rs.getInt("id_supply_order_history"));
        supplyOrderHistory.setIdSupplyOrder(rs.getInt("id_supply_order"));
        supplyOrderHistory.setIdEmployee(rs.getInt("id_employee"));
        supplyOrderHistory.setEmployeeLastname(rs.getString("employee_lastname"));
        supplyOrderHistory.setEmployeeFirstname(rs.getString("employee_firstname"));
        supplyOrderHistory.setIdState(rs.getInt("id_state"));
        supplyOrderHistory.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        return supplyOrderHistory;
    }

}

