package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesOrderTaxItem;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesOrderTaxItemMapper implements RowMapper<SalesOrderTaxItem> {

    @Override
    public SalesOrderTaxItem mapRow(ResultSet rs, int i) throws SQLException {
        SalesOrderTaxItem salesOrderTaxItem = new SalesOrderTaxItem();
        salesOrderTaxItem.setTaxItemId(rs.getInt("tax_item_id"));
        salesOrderTaxItem.setTaxId(rs.getInt("tax_id"));
        salesOrderTaxItem.setItemId(rs.getInt("item_id"));
        salesOrderTaxItem.setTaxPercent(rs.getBigDecimal("tax_percent"));
        return salesOrderTaxItem;
    }

}

