package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CataloginventoryStockStatusIdx;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CataloginventoryStockStatusIdxMapper implements RowMapper<CataloginventoryStockStatusIdx> {

    @Override
    public CataloginventoryStockStatusIdx mapRow(ResultSet rs, int i) throws SQLException {
        CataloginventoryStockStatusIdx cataloginventoryStockStatusIdx = new CataloginventoryStockStatusIdx();
        cataloginventoryStockStatusIdx.setProductId(rs.getInt("product_id"));
        cataloginventoryStockStatusIdx.setWebsiteId(rs.getInt("website_id"));
        cataloginventoryStockStatusIdx.setStockId(rs.getInt("stock_id"));
        cataloginventoryStockStatusIdx.setQty(rs.getBigDecimal("qty"));
        cataloginventoryStockStatusIdx.setStockStatus(rs.getInt("stock_status"));
        return cataloginventoryStockStatusIdx;
    }

}

