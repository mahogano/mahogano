package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CarrierTaxRulesGroupShop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarrierTaxRulesGroupShopMapper implements RowMapper<CarrierTaxRulesGroupShop> {

    @Override
    public CarrierTaxRulesGroupShop mapRow(ResultSet rs, int i) throws SQLException {
        CarrierTaxRulesGroupShop carrierTaxRulesGroupShop = new CarrierTaxRulesGroupShop();
        carrierTaxRulesGroupShop.setIdCarrier(rs.getInt("id_carrier"));
        carrierTaxRulesGroupShop.setIdTaxRulesGroup(rs.getInt("id_tax_rules_group"));
        carrierTaxRulesGroupShop.setIdShop(rs.getInt("id_shop"));
        return carrierTaxRulesGroupShop;
    }

}

