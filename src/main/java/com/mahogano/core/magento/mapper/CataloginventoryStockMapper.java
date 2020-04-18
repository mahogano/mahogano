package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CataloginventoryStock;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CataloginventoryStockMapper implements RowMapper<CataloginventoryStock> {

    @Override
    public CataloginventoryStock mapRow(ResultSet rs, int i) throws SQLException {
        CataloginventoryStock cataloginventoryStock = new CataloginventoryStock();
        cataloginventoryStock.setStockId(rs.getInt("stock_id"));
        cataloginventoryStock.setStockName(rs.getString("stock_name"));
        return cataloginventoryStock;
    }

}

