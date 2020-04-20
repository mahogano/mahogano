package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.OrderSlipDetail;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderSlipDetailMapper implements RowMapper<OrderSlipDetail> {

    @Override
    public OrderSlipDetail mapRow(ResultSet rs, int i) throws SQLException {
        OrderSlipDetail orderSlipDetail = new OrderSlipDetail();
        orderSlipDetail.setIdOrderSlip(rs.getInt("id_order_slip"));
        orderSlipDetail.setIdOrderDetail(rs.getInt("id_order_detail"));
        orderSlipDetail.setProductQuantity(rs.getInt("product_quantity"));
        orderSlipDetail.setUnitPriceTaxExcl(rs.getBigDecimal("unit_price_tax_excl"));
        orderSlipDetail.setUnitPriceTaxIncl(rs.getBigDecimal("unit_price_tax_incl"));
        orderSlipDetail.setTotalPriceTaxExcl(rs.getBigDecimal("total_price_tax_excl"));
        orderSlipDetail.setTotalPriceTaxIncl(rs.getBigDecimal("total_price_tax_incl"));
        orderSlipDetail.setAmountTaxExcl(rs.getBigDecimal("amount_tax_excl"));
        orderSlipDetail.setAmountTaxIncl(rs.getBigDecimal("amount_tax_incl"));
        return orderSlipDetail;
    }

}

