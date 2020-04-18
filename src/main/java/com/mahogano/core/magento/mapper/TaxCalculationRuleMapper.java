package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.TaxCalculationRule;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaxCalculationRuleMapper implements RowMapper<TaxCalculationRule> {

    @Override
    public TaxCalculationRule mapRow(ResultSet rs, int i) throws SQLException {
        TaxCalculationRule taxCalculationRule = new TaxCalculationRule();
        taxCalculationRule.setTaxCalculationRuleId(rs.getInt("tax_calculation_rule_id"));
        taxCalculationRule.setCode(rs.getString("code"));
        taxCalculationRule.setPriority(rs.getInt("priority"));
        taxCalculationRule.setPosition(rs.getInt("position"));
        taxCalculationRule.setCalculateSubtotal(rs.getInt("calculate_subtotal"));
        return taxCalculationRule;
    }

}

