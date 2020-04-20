package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.SpecificPriceRuleCondition;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SpecificPriceRuleConditionMapper implements RowMapper<SpecificPriceRuleCondition> {

    @Override
    public SpecificPriceRuleCondition mapRow(ResultSet rs, int i) throws SQLException {
        SpecificPriceRuleCondition specificPriceRuleCondition = new SpecificPriceRuleCondition();
        specificPriceRuleCondition.setIdSpecificPriceRuleCondition(rs.getInt("id_specific_price_rule_condition"));
        specificPriceRuleCondition.setIdSpecificPriceRuleConditionGroup(rs.getInt("id_specific_price_rule_condition_group"));
        specificPriceRuleCondition.setType(rs.getString("type"));
        specificPriceRuleCondition.setValue(rs.getString("value"));
        return specificPriceRuleCondition;
    }

}

