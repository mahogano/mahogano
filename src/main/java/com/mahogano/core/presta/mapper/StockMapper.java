package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Stock;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StockMapper implements RowMapper<Stock> {

    @Override
    public Stock mapRow(ResultSet rs, int i) throws SQLException {
        Stock stock = new Stock();
        stock.setIdStock(rs.getInt("id_stock"));
        stock.setIdWarehouse(rs.getInt("id_warehouse"));
        stock.setIdProduct(rs.getInt("id_product"));
        stock.setIdProductAttribute(rs.getInt("id_product_attribute"));
        stock.setReference(rs.getString("reference"));
        stock.setEan13(rs.getString("ean13"));
        stock.setIsbn(rs.getString("isbn"));
        stock.setUpc(rs.getString("upc"));
        stock.setPhysicalQuantity(rs.getInt("physical_quantity"));
        stock.setUsableQuantity(rs.getInt("usable_quantity"));
        stock.setPriceTe(rs.getBigDecimal("price_te"));
        return stock;
    }

}

