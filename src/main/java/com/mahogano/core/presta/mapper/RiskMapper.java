package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Risk;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RiskMapper implements RowMapper<Risk> {

    @Override
    public Risk mapRow(ResultSet rs, int i) throws SQLException {
        Risk risk = new Risk();
        risk.setIdRisk(rs.getInt("id_risk"));
        risk.setPercent(rs.getInt("percent"));
        risk.setColor(rs.getString("color"));
        return risk;
    }

}

