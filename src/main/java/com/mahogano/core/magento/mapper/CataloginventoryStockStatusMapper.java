package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CataloginventoryStockStatus;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CataloginventoryStockStatusMapper implements RowMapper<CataloginventoryStockStatus> {

    @Override
    public CataloginventoryStockStatus mapRow(ResultSet rs, int i) throws SQLException {
        CataloginventoryStockStatus cataloginventoryStockStatus = new CataloginventoryStockStatus();
        cataloginventoryStockStatus.setProductId(rs.getInt("product_id"));
        cataloginventoryStockStatus.setWebsiteId(rs.getInt("website_id"));
        cataloginventoryStockStatus.setStockId(rs.getInt("stock_id"));
        cataloginventoryStockStatus.setQty(rs.getBigDecimal("qty"));
        cataloginventoryStockStatus.setStockStatus(rs.getInt("stock_status"));
        return cataloginventoryStockStatus;
    }

}

