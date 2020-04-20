package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.SupplyOrderState;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SupplyOrderStateMapper implements RowMapper<SupplyOrderState> {

    @Override
    public SupplyOrderState mapRow(ResultSet rs, int i) throws SQLException {
        SupplyOrderState supplyOrderState = new SupplyOrderState();
        supplyOrderState.setIdSupplyOrderState(rs.getInt("id_supply_order_state"));
        supplyOrderState.setDeliveryNote(rs.getInt("delivery_note"));
        supplyOrderState.setEditable(rs.getInt("editable"));
        supplyOrderState.setReceiptState(rs.getInt("receipt_state"));
        supplyOrderState.setPendingReceipt(rs.getInt("pending_receipt"));
        supplyOrderState.setEnclosed(rs.getInt("enclosed"));
        supplyOrderState.setColor(rs.getString("color"));
        return supplyOrderState;
    }

}

