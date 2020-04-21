package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ReferrerShop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReferrerShopMapper implements RowMapper<ReferrerShop> {

    @Override
    public ReferrerShop mapRow(ResultSet rs, int i) throws SQLException {
        ReferrerShop referrerShop = new ReferrerShop();
        referrerShop.setIdReferrer(rs.getInt("id_referrer"));
        referrerShop.setIdShop(rs.getInt("id_shop"));
        referrerShop.setCacheVisitors(rs.getInt("cache_visitors"));
        referrerShop.setCacheVisits(rs.getInt("cache_visits"));
        referrerShop.setCachePages(rs.getInt("cache_pages"));
        referrerShop.setCacheRegistrations(rs.getInt("cache_registrations"));
        referrerShop.setCacheOrders(rs.getInt("cache_orders"));
        referrerShop.setCacheSales(rs.getBigDecimal("cache_sales"));
        referrerShop.setCacheRegRate(rs.getBigDecimal("cache_reg_rate"));
        referrerShop.setCacheOrderRate(rs.getBigDecimal("cache_order_rate"));
        return referrerShop;
    }

}

