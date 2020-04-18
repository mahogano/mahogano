package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesOrderTax;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesOrderTaxMapper implements RowMapper<SalesOrderTax> {

    @Override
    public SalesOrderTax mapRow(ResultSet rs, int i) throws SQLException {
        SalesOrderTax salesOrderTax = new SalesOrderTax();
        salesOrderTax.setTaxId(rs.getInt("tax_id"));
        salesOrderTax.setOrderId(rs.getInt("order_id"));
        salesOrderTax.setCode(rs.getString("code"));
        salesOrderTax.setTitle(rs.getString("title"));
        salesOrderTax.setPercent(rs.getBigDecimal("percent"));
        salesOrderTax.setAmount(rs.getBigDecimal("amount"));
        salesOrderTax.setPriority(rs.getInt("priority"));
        salesOrderTax.setPosition(rs.getInt("position"));
        salesOrderTax.setBaseAmount(rs.getBigDecimal("base_amount"));
        salesOrderTax.setProcess(rs.getInt("process"));
        salesOrderTax.setBaseRealAmount(rs.getBigDecimal("base_real_amount"));
        salesOrderTax.setHidden(rs.getInt("hidden"));
        return salesOrderTax;
    }

}

