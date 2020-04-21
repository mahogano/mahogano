package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ConditionAdvice;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConditionAdviceMapper implements RowMapper<ConditionAdvice> {

    @Override
    public ConditionAdvice mapRow(ResultSet rs, int i) throws SQLException {
        ConditionAdvice conditionAdvice = new ConditionAdvice();
        conditionAdvice.setIdCondition(rs.getInt("id_condition"));
        conditionAdvice.setIdAdvice(rs.getInt("id_advice"));
        conditionAdvice.setDisplay(rs.getInt("display"));
        return conditionAdvice;
    }

}

