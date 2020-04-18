package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.PaypalSettlementReportRow;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PaypalSettlementReportRowMapper implements RowMapper<PaypalSettlementReportRow> {

    @Override
    public PaypalSettlementReportRow mapRow(ResultSet rs, int i) throws SQLException {
        PaypalSettlementReportRow paypalSettlementReportRow = new PaypalSettlementReportRow();
        paypalSettlementReportRow.setRowId(rs.getInt("row_id"));
        paypalSettlementReportRow.setReportId(rs.getInt("report_id"));
        paypalSettlementReportRow.setTransactionId(rs.getString("transaction_id"));
        paypalSettlementReportRow.setInvoiceId(rs.getString("invoice_id"));
        paypalSettlementReportRow.setPaypalReferenceId(rs.getString("paypal_reference_id"));
        paypalSettlementReportRow.setPaypalReferenceIdType(rs.getString("paypal_reference_id_type"));
        paypalSettlementReportRow.setTransactionEventCode(rs.getString("transaction_event_code"));
        paypalSettlementReportRow.setTransactionInitiationDate(rs.getTimestamp("transaction_initiation_date") != null ? rs.getTimestamp("transaction_initiation_date").toLocalDateTime() : null);
        paypalSettlementReportRow.setTransactionCompletionDate(rs.getTimestamp("transaction_completion_date") != null ? rs.getTimestamp("transaction_completion_date").toLocalDateTime() : null);
        paypalSettlementReportRow.setTransactionDebitOrCredit(rs.getString("transaction_debit_or_credit"));
        paypalSettlementReportRow.setGrossTransactionAmount(rs.getBigDecimal("gross_transaction_amount"));
        paypalSettlementReportRow.setGrossTransactionCurrency(rs.getString("gross_transaction_currency"));
        paypalSettlementReportRow.setFeeDebitOrCredit(rs.getString("fee_debit_or_credit"));
        paypalSettlementReportRow.setFeeAmount(rs.getBigDecimal("fee_amount"));
        paypalSettlementReportRow.setFeeCurrency(rs.getString("fee_currency"));
        paypalSettlementReportRow.setCustomField(rs.getString("custom_field"));
        paypalSettlementReportRow.setConsumerId(rs.getString("consumer_id"));
        paypalSettlementReportRow.setPaymentTrackingId(rs.getString("payment_tracking_id"));
        paypalSettlementReportRow.setStoreId(rs.getString("store_id"));
        return paypalSettlementReportRow;
    }

}

