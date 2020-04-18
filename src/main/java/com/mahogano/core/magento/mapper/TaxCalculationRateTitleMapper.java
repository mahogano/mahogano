package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.TaxCalculationRateTitle;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaxCalculationRateTitleMapper implements RowMapper<TaxCalculationRateTitle> {

    @Override
    public TaxCalculationRateTitle mapRow(ResultSet rs, int i) throws SQLException {
        TaxCalculationRateTitle taxCalculationRateTitle = new TaxCalculationRateTitle();
        taxCalculationRateTitle.setTaxCalculationRateTitleId(rs.getInt("tax_calculation_rate_title_id"));
        taxCalculationRateTitle.setTaxCalculationRateId(rs.getInt("tax_calculation_rate_id"));
        taxCalculationRateTitle.setStoreId(rs.getInt("store_id"));
        taxCalculationRateTitle.setValue(rs.getString("value"));
        return taxCalculationRateTitle;
    }

}

