package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.ProductAlertStock;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductAlertStockMapper implements RowMapper<ProductAlertStock> {

    @Override
    public ProductAlertStock mapRow(ResultSet rs, int i) throws SQLException {
        ProductAlertStock productAlertStock = new ProductAlertStock();
        productAlertStock.setAlertStockId(rs.getInt("alert_stock_id"));
        productAlertStock.setCustomerId(rs.getInt("customer_id"));
        productAlertStock.setProductId(rs.getInt("product_id"));
        productAlertStock.setWebsiteId(rs.getInt("website_id"));
        productAlertStock.setAddDate(rs.getTimestamp("add_date").toLocalDateTime());
        productAlertStock.setSendDate(rs.getTimestamp("send_date") != null ? rs.getTimestamp("send_date").toLocalDateTime() : null);
        productAlertStock.setSendCount(rs.getInt("send_count"));
        productAlertStock.setStatus(rs.getInt("status"));
        return productAlertStock;
    }

}

