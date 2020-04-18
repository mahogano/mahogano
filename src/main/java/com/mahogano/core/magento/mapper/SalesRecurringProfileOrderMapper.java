package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesRecurringProfileOrder;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesRecurringProfileOrderMapper implements RowMapper<SalesRecurringProfileOrder> {

    @Override
    public SalesRecurringProfileOrder mapRow(ResultSet rs, int i) throws SQLException {
        SalesRecurringProfileOrder salesRecurringProfileOrder = new SalesRecurringProfileOrder();
        salesRecurringProfileOrder.setLinkId(rs.getInt("link_id"));
        salesRecurringProfileOrder.setProfileId(rs.getInt("profile_id"));
        salesRecurringProfileOrder.setOrderId(rs.getInt("order_id"));
        return salesRecurringProfileOrder;
    }

}

