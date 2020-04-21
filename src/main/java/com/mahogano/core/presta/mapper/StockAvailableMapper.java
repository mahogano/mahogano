package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.StockAvailable;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StockAvailableMapper implements RowMapper<StockAvailable> {

    @Override
    public StockAvailable mapRow(ResultSet rs, int i) throws SQLException {
        StockAvailable stockAvailable = new StockAvailable();
        stockAvailable.setIdStockAvailable(rs.getInt("id_stock_available"));
        stockAvailable.setIdProduct(rs.getInt("id_product"));
        stockAvailable.setIdProductAttribute(rs.getInt("id_product_attribute"));
        stockAvailable.setIdShop(rs.getInt("id_shop"));
        stockAvailable.setIdShopGroup(rs.getInt("id_shop_group"));
        stockAvailable.setQuantity(rs.getInt("quantity"));
        stockAvailable.setPhysicalQuantity(rs.getInt("physical_quantity"));
        stockAvailable.setReservedQuantity(rs.getInt("reserved_quantity"));
        stockAvailable.setDependsOnStock(rs.getInt("depends_on_stock"));
        stockAvailable.setOutOfStock(rs.getInt("out_of_stock"));
        stockAvailable.setLocation(rs.getString("location"));
        return stockAvailable;
    }

}

