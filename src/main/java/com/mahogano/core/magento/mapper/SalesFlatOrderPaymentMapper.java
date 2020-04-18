package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesFlatOrderPayment;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesFlatOrderPaymentMapper implements RowMapper<SalesFlatOrderPayment> {

    @Override
    public SalesFlatOrderPayment mapRow(ResultSet rs, int i) throws SQLException {
        SalesFlatOrderPayment salesFlatOrderPayment = new SalesFlatOrderPayment();
        salesFlatOrderPayment.setEntityId(rs.getInt("entity_id"));
        salesFlatOrderPayment.setParentId(rs.getInt("parent_id"));
        salesFlatOrderPayment.setBaseShippingCaptured(rs.getBigDecimal("base_shipping_captured"));
        salesFlatOrderPayment.setShippingCaptured(rs.getBigDecimal("shipping_captured"));
        salesFlatOrderPayment.setAmountRefunded(rs.getBigDecimal("amount_refunded"));
        salesFlatOrderPayment.setBaseAmountPaid(rs.getBigDecimal("base_amount_paid"));
        salesFlatOrderPayment.setAmountCanceled(rs.getBigDecimal("amount_canceled"));
        salesFlatOrderPayment.setBaseAmountAuthorized(rs.getBigDecimal("base_amount_authorized"));
        salesFlatOrderPayment.setBaseAmountPaidOnline(rs.getBigDecimal("base_amount_paid_online"));
        salesFlatOrderPayment.setBaseAmountRefundedOnline(rs.getBigDecimal("base_amount_refunded_online"));
        salesFlatOrderPayment.setBaseShippingAmount(rs.getBigDecimal("base_shipping_amount"));
        salesFlatOrderPayment.setShippingAmount(rs.getBigDecimal("shipping_amount"));
        salesFlatOrderPayment.setAmountPaid(rs.getBigDecimal("amount_paid"));
        salesFlatOrderPayment.setAmountAuthorized(rs.getBigDecimal("amount_authorized"));
        salesFlatOrderPayment.setBaseAmountOrdered(rs.getBigDecimal("base_amount_ordered"));
        salesFlatOrderPayment.setBaseShippingRefunded(rs.getBigDecimal("base_shipping_refunded"));
        salesFlatOrderPayment.setShippingRefunded(rs.getBigDecimal("shipping_refunded"));
        salesFlatOrderPayment.setBaseAmountRefunded(rs.getBigDecimal("base_amount_refunded"));
        salesFlatOrderPayment.setAmountOrdered(rs.getBigDecimal("amount_ordered"));
        salesFlatOrderPayment.setBaseAmountCanceled(rs.getBigDecimal("base_amount_canceled"));
        salesFlatOrderPayment.setQuotePaymentId(rs.getInt("quote_payment_id"));
        salesFlatOrderPayment.setAdditionalData(rs.getString("additional_data"));
        salesFlatOrderPayment.setCcExpMonth(rs.getString("cc_exp_month"));
        salesFlatOrderPayment.setCcSsStartYear(rs.getString("cc_ss_start_year"));
        salesFlatOrderPayment.setEcheckBankName(rs.getString("echeck_bank_name"));
        salesFlatOrderPayment.setMethod(rs.getString("method"));
        salesFlatOrderPayment.setCcDebugRequestBody(rs.getString("cc_debug_request_body"));
        salesFlatOrderPayment.setCcSecureVerify(rs.getString("cc_secure_verify"));
        salesFlatOrderPayment.setProtectionEligibility(rs.getString("protection_eligibility"));
        salesFlatOrderPayment.setCcApproval(rs.getString("cc_approval"));
        salesFlatOrderPayment.setCcLast4(rs.getString("cc_last4"));
        salesFlatOrderPayment.setCcStatusDescription(rs.getString("cc_status_description"));
        salesFlatOrderPayment.setEcheckType(rs.getString("echeck_type"));
        salesFlatOrderPayment.setCcDebugResponseSerialized(rs.getString("cc_debug_response_serialized"));
        salesFlatOrderPayment.setCcSsStartMonth(rs.getString("cc_ss_start_month"));
        salesFlatOrderPayment.setEcheckAccountType(rs.getString("echeck_account_type"));
        salesFlatOrderPayment.setLastTransId(rs.getString("last_trans_id"));
        salesFlatOrderPayment.setCcCidStatus(rs.getString("cc_cid_status"));
        salesFlatOrderPayment.setCcOwner(rs.getString("cc_owner"));
        salesFlatOrderPayment.setCcType(rs.getString("cc_type"));
        salesFlatOrderPayment.setPoNumber(rs.getString("po_number"));
        salesFlatOrderPayment.setCcExpYear(rs.getString("cc_exp_year"));
        salesFlatOrderPayment.setCcStatus(rs.getString("cc_status"));
        salesFlatOrderPayment.setEcheckRoutingNumber(rs.getString("echeck_routing_number"));
        salesFlatOrderPayment.setAccountStatus(rs.getString("account_status"));
        salesFlatOrderPayment.setAnetTransMethod(rs.getString("anet_trans_method"));
        salesFlatOrderPayment.setCcDebugResponseBody(rs.getString("cc_debug_response_body"));
        salesFlatOrderPayment.setCcSsIssue(rs.getString("cc_ss_issue"));
        salesFlatOrderPayment.setEcheckAccountName(rs.getString("echeck_account_name"));
        salesFlatOrderPayment.setCcAvsStatus(rs.getString("cc_avs_status"));
        salesFlatOrderPayment.setCcNumberEnc(rs.getString("cc_number_enc"));
        salesFlatOrderPayment.setCcTransId(rs.getString("cc_trans_id"));
        salesFlatOrderPayment.setPayboxRequestNumber(rs.getString("paybox_request_number"));
        salesFlatOrderPayment.setAddressStatus(rs.getString("address_status"));
        salesFlatOrderPayment.setAdditionalInformation(rs.getString("additional_information"));
        return salesFlatOrderPayment;
    }

}

