package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.ProductAlertPrice;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductAlertPriceMapper implements RowMapper<ProductAlertPrice> {

    @Override
    public ProductAlertPrice mapRow(ResultSet rs, int i) throws SQLException {
        ProductAlertPrice productAlertPrice = new ProductAlertPrice();
        productAlertPrice.setAlertPriceId(rs.getInt("alert_price_id"));
        productAlertPrice.setCustomerId(rs.getInt("customer_id"));
        productAlertPrice.setProductId(rs.getInt("product_id"));
        productAlertPrice.setPrice(rs.getBigDecimal("price"));
        productAlertPrice.setWebsiteId(rs.getInt("website_id"));
        productAlertPrice.setAddDate(rs.getTimestamp("add_date").toLocalDateTime());
        productAlertPrice.setLastSendDate(rs.getTimestamp("last_send_date") != null ? rs.getTimestamp("last_send_date").toLocalDateTime() : null);
        productAlertPrice.setSendCount(rs.getInt("send_count"));
        productAlertPrice.setStatus(rs.getInt("status"));
        return productAlertPrice;
    }

}

