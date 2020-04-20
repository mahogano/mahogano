package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Orders;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrdersMapper implements RowMapper<Orders> {

    @Override
    public Orders mapRow(ResultSet rs, int i) throws SQLException {
        Orders orders = new Orders();
        orders.setIdOrder(rs.getInt("id_order"));
        orders.setReference(rs.getString("reference"));
        orders.setIdShopGroup(rs.getInt("id_shop_group"));
        orders.setIdShop(rs.getInt("id_shop"));
        orders.setIdCarrier(rs.getInt("id_carrier"));
        orders.setIdLang(rs.getInt("id_lang"));
        orders.setIdCustomer(rs.getInt("id_customer"));
        orders.setIdCart(rs.getInt("id_cart"));
        orders.setIdCurrency(rs.getInt("id_currency"));
        orders.setIdAddressDelivery(rs.getInt("id_address_delivery"));
        orders.setIdAddressInvoice(rs.getInt("id_address_invoice"));
        orders.setCurrentState(rs.getInt("current_state"));
        orders.setSecureKey(rs.getString("secure_key"));
        orders.setPayment(rs.getString("payment"));
        orders.setConversionRate(rs.getBigDecimal("conversion_rate"));
        orders.setModule(rs.getString("module"));
        orders.setRecyclable(rs.getInt("recyclable"));
        orders.setGift(rs.getInt("gift"));
        orders.setGiftMessage(rs.getString("gift_message"));
        orders.setMobileTheme(rs.getInt("mobile_theme"));
        orders.setShippingNumber(rs.getString("shipping_number"));
        orders.setTotalDiscounts(rs.getBigDecimal("total_discounts"));
        orders.setTotalDiscountsTaxIncl(rs.getBigDecimal("total_discounts_tax_incl"));
        orders.setTotalDiscountsTaxExcl(rs.getBigDecimal("total_discounts_tax_excl"));
        orders.setTotalPaid(rs.getBigDecimal("total_paid"));
        orders.setTotalPaidTaxIncl(rs.getBigDecimal("total_paid_tax_incl"));
        orders.setTotalPaidTaxExcl(rs.getBigDecimal("total_paid_tax_excl"));
        orders.setTotalPaidReal(rs.getBigDecimal("total_paid_real"));
        orders.setTotalProducts(rs.getBigDecimal("total_products"));
        orders.setTotalProductsWt(rs.getBigDecimal("total_products_wt"));
        orders.setTotalShipping(rs.getBigDecimal("total_shipping"));
        orders.setTotalShippingTaxIncl(rs.getBigDecimal("total_shipping_tax_incl"));
        orders.setTotalShippingTaxExcl(rs.getBigDecimal("total_shipping_tax_excl"));
        orders.setCarrierTaxRate(rs.getBigDecimal("carrier_tax_rate"));
        orders.setTotalWrapping(rs.getBigDecimal("total_wrapping"));
        orders.setTotalWrappingTaxIncl(rs.getBigDecimal("total_wrapping_tax_incl"));
        orders.setTotalWrappingTaxExcl(rs.getBigDecimal("total_wrapping_tax_excl"));
        orders.setRoundMode(rs.getInt("round_mode"));
        orders.setRoundType(rs.getInt("round_type"));
        orders.setInvoiceNumber(rs.getInt("invoice_number"));
        orders.setDeliveryNumber(rs.getInt("delivery_number"));
        orders.setInvoiceDate(rs.getTimestamp("invoice_date").toLocalDateTime());
        orders.setDeliveryDate(rs.getTimestamp("delivery_date").toLocalDateTime());
        orders.setValid(rs.getInt("valid"));
        orders.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        orders.setDateUpd(rs.getTimestamp("date_upd").toLocalDateTime());
        return orders;
    }

}

