package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.SpecificPriceRuleConditionGroup;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SpecificPriceRuleConditionGroupMapper implements RowMapper<SpecificPriceRuleConditionGroup> {

    @Override
    public SpecificPriceRuleConditionGroup mapRow(ResultSet rs, int i) throws SQLException {
        SpecificPriceRuleConditionGroup specificPriceRuleConditionGroup = new SpecificPriceRuleConditionGroup();
        specificPriceRuleConditionGroup.setIdSpecificPriceRuleConditionGroup(rs.getInt("id_specific_price_rule_condition_group"));
        specificPriceRuleConditionGroup.setIdSpecificPriceRule(rs.getInt("id_specific_price_rule"));
        return specificPriceRuleConditionGroup;
    }

}

