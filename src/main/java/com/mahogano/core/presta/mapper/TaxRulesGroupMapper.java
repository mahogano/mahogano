package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.TaxRulesGroup;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaxRulesGroupMapper implements RowMapper<TaxRulesGroup> {

    @Override
    public TaxRulesGroup mapRow(ResultSet rs, int i) throws SQLException {
        TaxRulesGroup taxRulesGroup = new TaxRulesGroup();
        taxRulesGroup.setIdTaxRulesGroup(rs.getInt("id_tax_rules_group"));
        taxRulesGroup.setName(rs.getString("name"));
        taxRulesGroup.setActive(rs.getInt("active"));
        taxRulesGroup.setDeleted(rs.getInt("deleted"));
        taxRulesGroup.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        taxRulesGroup.setDateUpd(rs.getTimestamp("date_upd").toLocalDateTime());
        return taxRulesGroup;
    }

}

