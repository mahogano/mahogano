package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.StockMvt;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StockMvtMapper implements RowMapper<StockMvt> {

    @Override
    public StockMvt mapRow(ResultSet rs, int i) throws SQLException {
        StockMvt stockMvt = new StockMvt();
        stockMvt.setIdStockMvt(rs.getLong("id_stock_mvt"));
        stockMvt.setIdStock(rs.getInt("id_stock"));
        stockMvt.setIdOrder(rs.getInt("id_order"));
        stockMvt.setIdSupplyOrder(rs.getInt("id_supply_order"));
        stockMvt.setIdStockMvtReason(rs.getInt("id_stock_mvt_reason"));
        stockMvt.setIdEmployee(rs.getInt("id_employee"));
        stockMvt.setEmployeeLastname(rs.getString("employee_lastname"));
        stockMvt.setEmployeeFirstname(rs.getString("employee_firstname"));
        stockMvt.setPhysicalQuantity(rs.getInt("physical_quantity"));
        stockMvt.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        stockMvt.setSign(rs.getInt("sign"));
        stockMvt.setPriceTe(rs.getBigDecimal("price_te"));
        stockMvt.setLastWa(rs.getBigDecimal("last_wa"));
        stockMvt.setCurrentWa(rs.getBigDecimal("current_wa"));
        stockMvt.setReferer(rs.getLong("referer"));
        return stockMvt;
    }

}

