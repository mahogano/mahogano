package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.SpecificPriceRule;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SpecificPriceRuleMapper implements RowMapper<SpecificPriceRule> {

    @Override
    public SpecificPriceRule mapRow(ResultSet rs, int i) throws SQLException {
        SpecificPriceRule specificPriceRule = new SpecificPriceRule();
        specificPriceRule.setIdSpecificPriceRule(rs.getInt("id_specific_price_rule"));
        specificPriceRule.setName(rs.getString("name"));
        specificPriceRule.setIdShop(rs.getInt("id_shop"));
        specificPriceRule.setIdCurrency(rs.getInt("id_currency"));
        specificPriceRule.setIdCountry(rs.getInt("id_country"));
        specificPriceRule.setIdGroup(rs.getInt("id_group"));
        specificPriceRule.setFromQuantity(rs.getInt("from_quantity"));
        specificPriceRule.setPrice(rs.getBigDecimal("price"));
        specificPriceRule.setReduction(rs.getBigDecimal("reduction"));
        specificPriceRule.setReductionTax(rs.getInt("reduction_tax"));
        specificPriceRule.setReductionType(rs.getString("reduction_type"));
        specificPriceRule.setFrom(rs.getTimestamp("from").toLocalDateTime());
        specificPriceRule.setTo(rs.getTimestamp("to").toLocalDateTime());
        return specificPriceRule;
    }

}

