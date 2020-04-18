package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesRecurringProfile;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesRecurringProfileMapper implements RowMapper<SalesRecurringProfile> {

    @Override
    public SalesRecurringProfile mapRow(ResultSet rs, int i) throws SQLException {
        SalesRecurringProfile salesRecurringProfile = new SalesRecurringProfile();
        salesRecurringProfile.setProfileId(rs.getInt("profile_id"));
        salesRecurringProfile.setState(rs.getString("state"));
        salesRecurringProfile.setCustomerId(rs.getInt("customer_id"));
        salesRecurringProfile.setStoreId(rs.getInt("store_id"));
        salesRecurringProfile.setMethodCode(rs.getString("method_code"));
        salesRecurringProfile.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        salesRecurringProfile.setUpdatedAt(rs.getTimestamp("updated_at") != null ? rs.getTimestamp("updated_at").toLocalDateTime() : null);
        salesRecurringProfile.setReferenceId(rs.getString("reference_id"));
        salesRecurringProfile.setSubscriberName(rs.getString("subscriber_name"));
        salesRecurringProfile.setStartDatetime(rs.getTimestamp("start_datetime").toLocalDateTime());
        salesRecurringProfile.setInternalReferenceId(rs.getString("internal_reference_id"));
        salesRecurringProfile.setScheduleDescription(rs.getString("schedule_description"));
        salesRecurringProfile.setSuspensionThreshold(rs.getInt("suspension_threshold"));
        salesRecurringProfile.setBillFailedLater(rs.getInt("bill_failed_later"));
        salesRecurringProfile.setPeriodUnit(rs.getString("period_unit"));
        salesRecurringProfile.setPeriodFrequency(rs.getInt("period_frequency"));
        salesRecurringProfile.setPeriodMaxCycles(rs.getInt("period_max_cycles"));
        salesRecurringProfile.setBillingAmount(rs.getBigDecimal("billing_amount"));
        salesRecurringProfile.setTrialPeriodUnit(rs.getString("trial_period_unit"));
        salesRecurringProfile.setTrialPeriodFrequency(rs.getInt("trial_period_frequency"));
        salesRecurringProfile.setTrialPeriodMaxCycles(rs.getInt("trial_period_max_cycles"));
        salesRecurringProfile.setTrialBillingAmount(rs.getString("trial_billing_amount"));
        salesRecurringProfile.setCurrencyCode(rs.getString("currency_code"));
        salesRecurringProfile.setShippingAmount(rs.getBigDecimal("shipping_amount"));
        salesRecurringProfile.setTaxAmount(rs.getBigDecimal("tax_amount"));
        salesRecurringProfile.setInitAmount(rs.getBigDecimal("init_amount"));
        salesRecurringProfile.setInitMayFail(rs.getInt("init_may_fail"));
        salesRecurringProfile.setOrderInfo(rs.getString("order_info"));
        salesRecurringProfile.setOrderItemInfo(rs.getString("order_item_info"));
        salesRecurringProfile.setBillingAddressInfo(rs.getString("billing_address_info"));
        salesRecurringProfile.setShippingAddressInfo(rs.getString("shipping_address_info"));
        salesRecurringProfile.setProfileVendorInfo(rs.getString("profile_vendor_info"));
        salesRecurringProfile.setAdditionalInfo(rs.getString("additional_info"));
        return salesRecurringProfile;
    }

}

