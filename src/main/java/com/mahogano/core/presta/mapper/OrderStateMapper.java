package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.OrderState;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderStateMapper implements RowMapper<OrderState> {

    @Override
    public OrderState mapRow(ResultSet rs, int i) throws SQLException {
        OrderState orderState = new OrderState();
        orderState.setIdOrderState(rs.getInt("id_order_state"));
        orderState.setInvoice(rs.getInt("invoice"));
        orderState.setSendEmail(rs.getInt("send_email"));
        orderState.setModuleName(rs.getString("module_name"));
        orderState.setColor(rs.getString("color"));
        orderState.setUnremovable(rs.getInt("unremovable"));
        orderState.setHidden(rs.getInt("hidden"));
        orderState.setLogable(rs.getInt("logable"));
        orderState.setDelivery(rs.getInt("delivery"));
        orderState.setShipped(rs.getInt("shipped"));
        orderState.setPaid(rs.getInt("paid"));
        orderState.setPdfInvoice(rs.getInt("pdf_invoice"));
        orderState.setPdfDelivery(rs.getInt("pdf_delivery"));
        orderState.setDeleted(rs.getInt("deleted"));
        return orderState;
    }

}

