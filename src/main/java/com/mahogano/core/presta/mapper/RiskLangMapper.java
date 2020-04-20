package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.RiskLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RiskLangMapper implements RowMapper<RiskLang> {

    @Override
    public RiskLang mapRow(ResultSet rs, int i) throws SQLException {
        RiskLang riskLang = new RiskLang();
        riskLang.setIdRisk(rs.getInt("id_risk"));
        riskLang.setIdLang(rs.getInt("id_lang"));
        riskLang.setName(rs.getString("name"));
        return riskLang;
    }

}

