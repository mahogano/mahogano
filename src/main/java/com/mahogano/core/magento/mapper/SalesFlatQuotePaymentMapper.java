package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesFlatQuotePayment;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesFlatQuotePaymentMapper implements RowMapper<SalesFlatQuotePayment> {

    @Override
    public SalesFlatQuotePayment mapRow(ResultSet rs, int i) throws SQLException {
        SalesFlatQuotePayment salesFlatQuotePayment = new SalesFlatQuotePayment();
        salesFlatQuotePayment.setPaymentId(rs.getInt("payment_id"));
        salesFlatQuotePayment.setQuoteId(rs.getInt("quote_id"));
        salesFlatQuotePayment.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        salesFlatQuotePayment.setUpdatedAt(rs.getTimestamp("updated_at").toLocalDateTime());
        salesFlatQuotePayment.setMethod(rs.getString("method"));
        salesFlatQuotePayment.setCcType(rs.getString("cc_type"));
        salesFlatQuotePayment.setCcNumberEnc(rs.getString("cc_number_enc"));
        salesFlatQuotePayment.setCcLast4(rs.getString("cc_last4"));
        salesFlatQuotePayment.setCcCidEnc(rs.getString("cc_cid_enc"));
        salesFlatQuotePayment.setCcOwner(rs.getString("cc_owner"));
        salesFlatQuotePayment.setCcExpMonth(rs.getInt("cc_exp_month"));
        salesFlatQuotePayment.setCcExpYear(rs.getInt("cc_exp_year"));
        salesFlatQuotePayment.setCcSsOwner(rs.getString("cc_ss_owner"));
        salesFlatQuotePayment.setCcSsStartMonth(rs.getInt("cc_ss_start_month"));
        salesFlatQuotePayment.setCcSsStartYear(rs.getInt("cc_ss_start_year"));
        salesFlatQuotePayment.setPoNumber(rs.getString("po_number"));
        salesFlatQuotePayment.setAdditionalData(rs.getString("additional_data"));
        salesFlatQuotePayment.setCcSsIssue(rs.getString("cc_ss_issue"));
        salesFlatQuotePayment.setAdditionalInformation(rs.getString("additional_information"));
        salesFlatQuotePayment.setPaypalPayerId(rs.getString("paypal_payer_id"));
        salesFlatQuotePayment.setPaypalPayerStatus(rs.getString("paypal_payer_status"));
        salesFlatQuotePayment.setPaypalCorrelationId(rs.getString("paypal_correlation_id"));
        return salesFlatQuotePayment;
    }

}

