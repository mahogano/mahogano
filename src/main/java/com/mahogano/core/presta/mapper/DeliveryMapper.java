package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Delivery;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeliveryMapper implements RowMapper<Delivery> {

    @Override
    public Delivery mapRow(ResultSet rs, int i) throws SQLException {
        Delivery delivery = new Delivery();
        delivery.setIdDelivery(rs.getInt("id_delivery"));
        delivery.setIdShop(rs.getInt("id_shop"));
        delivery.setIdShopGroup(rs.getInt("id_shop_group"));
        delivery.setIdCarrier(rs.getInt("id_carrier"));
        delivery.setIdRangePrice(rs.getInt("id_range_price"));
        delivery.setIdRangeWeight(rs.getInt("id_range_weight"));
        delivery.setIdZone(rs.getInt("id_zone"));
        delivery.setPrice(rs.getBigDecimal("price"));
        return delivery;
    }

}

