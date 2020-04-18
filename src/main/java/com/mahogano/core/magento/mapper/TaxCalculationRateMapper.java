package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.TaxCalculationRate;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaxCalculationRateMapper implements RowMapper<TaxCalculationRate> {

    @Override
    public TaxCalculationRate mapRow(ResultSet rs, int i) throws SQLException {
        TaxCalculationRate taxCalculationRate = new TaxCalculationRate();
        taxCalculationRate.setTaxCalculationRateId(rs.getInt("tax_calculation_rate_id"));
        taxCalculationRate.setTaxCountryId(rs.getString("tax_country_id"));
        taxCalculationRate.setTaxRegionId(rs.getInt("tax_region_id"));
        taxCalculationRate.setTaxPostcode(rs.getString("tax_postcode"));
        taxCalculationRate.setCode(rs.getString("code"));
        taxCalculationRate.setRate(rs.getBigDecimal("rate"));
        taxCalculationRate.setZipIsRange(rs.getInt("zip_is_range"));
        taxCalculationRate.setZipFrom(rs.getInt("zip_from"));
        taxCalculationRate.setZipTo(rs.getInt("zip_to"));
        return taxCalculationRate;
    }

}

