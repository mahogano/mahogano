package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CataloginventoryStockStatusTmp;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CataloginventoryStockStatusTmpMapper implements RowMapper<CataloginventoryStockStatusTmp> {

    @Override
    public CataloginventoryStockStatusTmp mapRow(ResultSet rs, int i) throws SQLException {
        CataloginventoryStockStatusTmp cataloginventoryStockStatusTmp = new CataloginventoryStockStatusTmp();
        cataloginventoryStockStatusTmp.setProductId(rs.getInt("product_id"));
        cataloginventoryStockStatusTmp.setWebsiteId(rs.getInt("website_id"));
        cataloginventoryStockStatusTmp.setStockId(rs.getInt("stock_id"));
        cataloginventoryStockStatusTmp.setQty(rs.getBigDecimal("qty"));
        cataloginventoryStockStatusTmp.setStockStatus(rs.getInt("stock_status"));
        return cataloginventoryStockStatusTmp;
    }

}

