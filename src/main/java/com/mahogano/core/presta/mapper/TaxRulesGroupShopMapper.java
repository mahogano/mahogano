package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.TaxRulesGroupShop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaxRulesGroupShopMapper implements RowMapper<TaxRulesGroupShop> {

    @Override
    public TaxRulesGroupShop mapRow(ResultSet rs, int i) throws SQLException {
        TaxRulesGroupShop taxRulesGroupShop = new TaxRulesGroupShop();
        taxRulesGroupShop.setIdTaxRulesGroup(rs.getInt("id_tax_rules_group"));
        taxRulesGroupShop.setIdShop(rs.getInt("id_shop"));
        return taxRulesGroupShop;
    }

}

