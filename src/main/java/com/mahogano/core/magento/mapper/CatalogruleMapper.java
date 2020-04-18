package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.Catalogrule;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogruleMapper implements RowMapper<Catalogrule> {

    @Override
    public Catalogrule mapRow(ResultSet rs, int i) throws SQLException {
        Catalogrule catalogrule = new Catalogrule();
        catalogrule.setRuleId(rs.getInt("rule_id"));
        catalogrule.setName(rs.getString("name"));
        catalogrule.setDescription(rs.getString("description"));
        catalogrule.setFromDate(rs.getTimestamp("from_date") != null ? rs.getTimestamp("from_date").toLocalDateTime() : null);
        catalogrule.setToDate(rs.getTimestamp("to_date") != null ? rs.getTimestamp("to_date").toLocalDateTime() : null);
        catalogrule.setIsActive(rs.getInt("is_active"));
        catalogrule.setConditionsSerialized(rs.getString("conditions_serialized"));
        catalogrule.setActionsSerialized(rs.getString("actions_serialized"));
        catalogrule.setStopRulesProcessing(rs.getInt("stop_rules_processing"));
        catalogrule.setSortOrder(rs.getInt("sort_order"));
        catalogrule.setSimpleAction(rs.getString("simple_action"));
        catalogrule.setDiscountAmount(rs.getBigDecimal("discount_amount"));
        catalogrule.setSubIsEnable(rs.getInt("sub_is_enable"));
        catalogrule.setSubSimpleAction(rs.getString("sub_simple_action"));
        catalogrule.setSubDiscountAmount(rs.getBigDecimal("sub_discount_amount"));
        return catalogrule;
    }

}

