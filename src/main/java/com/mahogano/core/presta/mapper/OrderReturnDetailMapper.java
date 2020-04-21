package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.OrderReturnDetail;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderReturnDetailMapper implements RowMapper<OrderReturnDetail> {

    @Override
    public OrderReturnDetail mapRow(ResultSet rs, int i) throws SQLException {
        OrderReturnDetail orderReturnDetail = new OrderReturnDetail();
        orderReturnDetail.setIdOrderReturn(rs.getInt("id_order_return"));
        orderReturnDetail.setIdOrderDetail(rs.getInt("id_order_detail"));
        orderReturnDetail.setIdCustomization(rs.getInt("id_customization"));
        orderReturnDetail.setProductQuantity(rs.getInt("product_quantity"));
        return orderReturnDetail;
    }

}

