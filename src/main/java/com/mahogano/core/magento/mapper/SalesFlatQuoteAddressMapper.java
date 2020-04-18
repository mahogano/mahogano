package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesFlatQuoteAddress;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesFlatQuoteAddressMapper implements RowMapper<SalesFlatQuoteAddress> {

    @Override
    public SalesFlatQuoteAddress mapRow(ResultSet rs, int i) throws SQLException {
        SalesFlatQuoteAddress salesFlatQuoteAddress = new SalesFlatQuoteAddress();
        salesFlatQuoteAddress.setAddressId(rs.getInt("address_id"));
        salesFlatQuoteAddress.setQuoteId(rs.getInt("quote_id"));
        salesFlatQuoteAddress.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        salesFlatQuoteAddress.setUpdatedAt(rs.getTimestamp("updated_at").toLocalDateTime());
        salesFlatQuoteAddress.setCustomerId(rs.getInt("customer_id"));
        salesFlatQuoteAddress.setSaveInAddressBook(rs.getInt("save_in_address_book"));
        salesFlatQuoteAddress.setCustomerAddressId(rs.getInt("customer_address_id"));
        salesFlatQuoteAddress.setAddressType(rs.getString("address_type"));
        salesFlatQuoteAddress.setEmail(rs.getString("email"));
        salesFlatQuoteAddress.setPrefix(rs.getString("prefix"));
        salesFlatQuoteAddress.setFirstname(rs.getString("firstname"));
        salesFlatQuoteAddress.setMiddlename(rs.getString("middlename"));
        salesFlatQuoteAddress.setLastname(rs.getString("lastname"));
        salesFlatQuoteAddress.setSuffix(rs.getString("suffix"));
        salesFlatQuoteAddress.setCompany(rs.getString("company"));
        salesFlatQuoteAddress.setStreet(rs.getString("street"));
        salesFlatQuoteAddress.setCity(rs.getString("city"));
        salesFlatQuoteAddress.setRegion(rs.getString("region"));
        salesFlatQuoteAddress.setRegionId(rs.getInt("region_id"));
        salesFlatQuoteAddress.setPostcode(rs.getString("postcode"));
        salesFlatQuoteAddress.setCountryId(rs.getString("country_id"));
        salesFlatQuoteAddress.setTelephone(rs.getString("telephone"));
        salesFlatQuoteAddress.setFax(rs.getString("fax"));
        salesFlatQuoteAddress.setSameAsBilling(rs.getInt("same_as_billing"));
        salesFlatQuoteAddress.setFreeShipping(rs.getInt("free_shipping"));
        salesFlatQuoteAddress.setCollectShippingRates(rs.getInt("collect_shipping_rates"));
        salesFlatQuoteAddress.setShippingMethod(rs.getString("shipping_method"));
        salesFlatQuoteAddress.setShippingDescription(rs.getString("shipping_description"));
        salesFlatQuoteAddress.setWeight(rs.getBigDecimal("weight"));
        salesFlatQuoteAddress.setSubtotal(rs.getBigDecimal("subtotal"));
        salesFlatQuoteAddress.setBaseSubtotal(rs.getBigDecimal("base_subtotal"));
        salesFlatQuoteAddress.setSubtotalWithDiscount(rs.getBigDecimal("subtotal_with_discount"));
        salesFlatQuoteAddress.setBaseSubtotalWithDiscount(rs.getBigDecimal("base_subtotal_with_discount"));
        salesFlatQuoteAddress.setTaxAmount(rs.getBigDecimal("tax_amount"));
        salesFlatQuoteAddress.setBaseTaxAmount(rs.getBigDecimal("base_tax_amount"));
        salesFlatQuoteAddress.setShippingAmount(rs.getBigDecimal("shipping_amount"));
        salesFlatQuoteAddress.setBaseShippingAmount(rs.getBigDecimal("base_shipping_amount"));
        salesFlatQuoteAddress.setShippingTaxAmount(rs.getBigDecimal("shipping_tax_amount"));
        salesFlatQuoteAddress.setBaseShippingTaxAmount(rs.getBigDecimal("base_shipping_tax_amount"));
        salesFlatQuoteAddress.setDiscountAmount(rs.getBigDecimal("discount_amount"));
        salesFlatQuoteAddress.setBaseDiscountAmount(rs.getBigDecimal("base_discount_amount"));
        salesFlatQuoteAddress.setGrandTotal(rs.getBigDecimal("grand_total"));
        salesFlatQuoteAddress.setBaseGrandTotal(rs.getBigDecimal("base_grand_total"));
        salesFlatQuoteAddress.setCustomerNotes(rs.getString("customer_notes"));
        salesFlatQuoteAddress.setAppliedTaxes(rs.getString("applied_taxes"));
        salesFlatQuoteAddress.setDiscountDescription(rs.getString("discount_description"));
        salesFlatQuoteAddress.setShippingDiscountAmount(rs.getBigDecimal("shipping_discount_amount"));
        salesFlatQuoteAddress.setBaseShippingDiscountAmount(rs.getBigDecimal("base_shipping_discount_amount"));
        salesFlatQuoteAddress.setSubtotalInclTax(rs.getBigDecimal("subtotal_incl_tax"));
        salesFlatQuoteAddress.setBaseSubtotalTotalInclTax(rs.getBigDecimal("base_subtotal_total_incl_tax"));
        salesFlatQuoteAddress.setHiddenTaxAmount(rs.getBigDecimal("hidden_tax_amount"));
        salesFlatQuoteAddress.setBaseHiddenTaxAmount(rs.getBigDecimal("base_hidden_tax_amount"));
        salesFlatQuoteAddress.setShippingHiddenTaxAmount(rs.getBigDecimal("shipping_hidden_tax_amount"));
        salesFlatQuoteAddress.setBaseShippingHiddenTaxAmnt(rs.getBigDecimal("base_shipping_hidden_tax_amnt"));
        salesFlatQuoteAddress.setShippingInclTax(rs.getBigDecimal("shipping_incl_tax"));
        salesFlatQuoteAddress.setBaseShippingInclTax(rs.getBigDecimal("base_shipping_incl_tax"));
        salesFlatQuoteAddress.setVatId(rs.getString("vat_id"));
        salesFlatQuoteAddress.setVatIsValid(rs.getInt("vat_is_valid"));
        salesFlatQuoteAddress.setVatRequestId(rs.getString("vat_request_id"));
        salesFlatQuoteAddress.setVatRequestDate(rs.getString("vat_request_date"));
        salesFlatQuoteAddress.setVatRequestSuccess(rs.getInt("vat_request_success"));
        salesFlatQuoteAddress.setGiftMessageId(rs.getInt("gift_message_id"));
        return salesFlatQuoteAddress;
    }

}

