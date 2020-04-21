package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.OrderInvoice;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderInvoiceMapper implements RowMapper<OrderInvoice> {

    @Override
    public OrderInvoice mapRow(ResultSet rs, int i) throws SQLException {
        OrderInvoice orderInvoice = new OrderInvoice();
        orderInvoice.setIdOrderInvoice(rs.getInt("id_order_invoice"));
        orderInvoice.setIdOrder(rs.getInt("id_order"));
        orderInvoice.setNumber(rs.getInt("number"));
        orderInvoice.setDeliveryNumber(rs.getInt("delivery_number"));
        orderInvoice.setDeliveryDate(rs.getTimestamp("delivery_date") != null ? rs.getTimestamp("delivery_date").toLocalDateTime() : null);
        orderInvoice.setTotalDiscountTaxExcl(rs.getBigDecimal("total_discount_tax_excl"));
        orderInvoice.setTotalDiscountTaxIncl(rs.getBigDecimal("total_discount_tax_incl"));
        orderInvoice.setTotalPaidTaxExcl(rs.getBigDecimal("total_paid_tax_excl"));
        orderInvoice.setTotalPaidTaxIncl(rs.getBigDecimal("total_paid_tax_incl"));
        orderInvoice.setTotalProducts(rs.getBigDecimal("total_products"));
        orderInvoice.setTotalProductsWt(rs.getBigDecimal("total_products_wt"));
        orderInvoice.setTotalShippingTaxExcl(rs.getBigDecimal("total_shipping_tax_excl"));
        orderInvoice.setTotalShippingTaxIncl(rs.getBigDecimal("total_shipping_tax_incl"));
        orderInvoice.setShippingTaxComputationMethod(rs.getInt("shipping_tax_computation_method"));
        orderInvoice.setTotalWrappingTaxExcl(rs.getBigDecimal("total_wrapping_tax_excl"));
        orderInvoice.setTotalWrappingTaxIncl(rs.getBigDecimal("total_wrapping_tax_incl"));
        orderInvoice.setShopAddress(rs.getString("shop_address"));
        orderInvoice.setNote(rs.getString("note"));
        orderInvoice.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        return orderInvoice;
    }

}

