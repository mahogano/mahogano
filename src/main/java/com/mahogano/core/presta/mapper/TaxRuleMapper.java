package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.TaxRule;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaxRuleMapper implements RowMapper<TaxRule> {

    @Override
    public TaxRule mapRow(ResultSet rs, int i) throws SQLException {
        TaxRule taxRule = new TaxRule();
        taxRule.setIdTaxRule(rs.getInt("id_tax_rule"));
        taxRule.setIdTaxRulesGroup(rs.getInt("id_tax_rules_group"));
        taxRule.setIdCountry(rs.getInt("id_country"));
        taxRule.setIdState(rs.getInt("id_state"));
        taxRule.setZipcodeFrom(rs.getString("zipcode_from"));
        taxRule.setZipcodeTo(rs.getString("zipcode_to"));
        taxRule.setIdTax(rs.getInt("id_tax"));
        taxRule.setBehavior(rs.getInt("behavior"));
        taxRule.setDescription(rs.getString("description"));
        return taxRule;
    }

}

