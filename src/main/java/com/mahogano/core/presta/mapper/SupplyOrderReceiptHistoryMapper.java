package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.SupplyOrderReceiptHistory;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SupplyOrderReceiptHistoryMapper implements RowMapper<SupplyOrderReceiptHistory> {

    @Override
    public SupplyOrderReceiptHistory mapRow(ResultSet rs, int i) throws SQLException {
        SupplyOrderReceiptHistory supplyOrderReceiptHistory = new SupplyOrderReceiptHistory();
        supplyOrderReceiptHistory.setIdSupplyOrderReceiptHistory(rs.getInt("id_supply_order_receipt_history"));
        supplyOrderReceiptHistory.setIdSupplyOrderDetail(rs.getInt("id_supply_order_detail"));
        supplyOrderReceiptHistory.setIdEmployee(rs.getInt("id_employee"));
        supplyOrderReceiptHistory.setEmployeeLastname(rs.getString("employee_lastname"));
        supplyOrderReceiptHistory.setEmployeeFirstname(rs.getString("employee_firstname"));
        supplyOrderReceiptHistory.setIdSupplyOrderState(rs.getInt("id_supply_order_state"));
        supplyOrderReceiptHistory.setQuantity(rs.getInt("quantity"));
        supplyOrderReceiptHistory.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        return supplyOrderReceiptHistory;
    }

}

