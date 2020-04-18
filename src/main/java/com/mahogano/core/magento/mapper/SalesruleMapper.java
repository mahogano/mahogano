package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.Salesrule;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesruleMapper implements RowMapper<Salesrule> {

    @Override
    public Salesrule mapRow(ResultSet rs, int i) throws SQLException {
        Salesrule salesrule = new Salesrule();
        salesrule.setRuleId(rs.getInt("rule_id"));
        salesrule.setName(rs.getString("name"));
        salesrule.setDescription(rs.getString("description"));
        salesrule.setFromDate(rs.getTimestamp("from_date") != null ? rs.getTimestamp("from_date").toLocalDateTime() : null);
        salesrule.setToDate(rs.getTimestamp("to_date") != null ? rs.getTimestamp("to_date").toLocalDateTime() : null);
        salesrule.setUsesPerCustomer(rs.getInt("uses_per_customer"));
        salesrule.setIsActive(rs.getInt("is_active"));
        salesrule.setConditionsSerialized(rs.getString("conditions_serialized"));
        salesrule.setActionsSerialized(rs.getString("actions_serialized"));
        salesrule.setStopRulesProcessing(rs.getInt("stop_rules_processing"));
        salesrule.setIsAdvanced(rs.getInt("is_advanced"));
        salesrule.setProductIds(rs.getString("product_ids"));
        salesrule.setSortOrder(rs.getInt("sort_order"));
        salesrule.setSimpleAction(rs.getString("simple_action"));
        salesrule.setDiscountAmount(rs.getBigDecimal("discount_amount"));
        salesrule.setDiscountQty(rs.getBigDecimal("discount_qty"));
        salesrule.setDiscountStep(rs.getInt("discount_step"));
        salesrule.setSimpleFreeShipping(rs.getInt("simple_free_shipping"));
        salesrule.setApplyToShipping(rs.getInt("apply_to_shipping"));
        salesrule.setTimesUsed(rs.getInt("times_used"));
        salesrule.setIsRss(rs.getInt("is_rss"));
        salesrule.setCouponType(rs.getInt("coupon_type"));
        salesrule.setUseAutoGeneration(rs.getInt("use_auto_generation"));
        salesrule.setUsesPerCoupon(rs.getInt("uses_per_coupon"));
        return salesrule;
    }

}

