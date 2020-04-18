package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.TaxCalculation;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaxCalculationMapper implements RowMapper<TaxCalculation> {

    @Override
    public TaxCalculation mapRow(ResultSet rs, int i) throws SQLException {
        TaxCalculation taxCalculation = new TaxCalculation();
        taxCalculation.setTaxCalculationId(rs.getInt("tax_calculation_id"));
        taxCalculation.setTaxCalculationRateId(rs.getInt("tax_calculation_rate_id"));
        taxCalculation.setTaxCalculationRuleId(rs.getInt("tax_calculation_rule_id"));
        taxCalculation.setCustomerTaxClassId(rs.getInt("customer_tax_class_id"));
        taxCalculation.setProductTaxClassId(rs.getInt("product_tax_class_id"));
        return taxCalculation;
    }

}

