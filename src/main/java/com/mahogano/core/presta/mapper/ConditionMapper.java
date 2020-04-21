package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Condition;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConditionMapper implements RowMapper<Condition> {

    @Override
    public Condition mapRow(ResultSet rs, int i) throws SQLException {
        Condition condition = new Condition();
        condition.setIdCondition(rs.getInt("id_condition"));
        condition.setIdPsCondition(rs.getInt("id_ps_condition"));
        condition.setType(rs.getString("type"));
        condition.setRequest(rs.getString("request"));
        condition.setOperator(rs.getString("operator"));
        condition.setValue(rs.getString("value"));
        condition.setResult(rs.getString("result"));
        condition.setCalculationType(rs.getString("calculation_type"));
        condition.setCalculationDetail(rs.getString("calculation_detail"));
        condition.setValidated(rs.getInt("validated"));
        condition.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        condition.setDateUpd(rs.getTimestamp("date_upd").toLocalDateTime());
        return condition;
    }

}

