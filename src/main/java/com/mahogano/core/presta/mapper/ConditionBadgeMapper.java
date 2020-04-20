package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ConditionBadge;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConditionBadgeMapper implements RowMapper<ConditionBadge> {

    @Override
    public ConditionBadge mapRow(ResultSet rs, int i) throws SQLException {
        ConditionBadge conditionBadge = new ConditionBadge();
        conditionBadge.setIdCondition(rs.getInt("id_condition"));
        conditionBadge.setIdBadge(rs.getInt("id_badge"));
        return conditionBadge;
    }

}

