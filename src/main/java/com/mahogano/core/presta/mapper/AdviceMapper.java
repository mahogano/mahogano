package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Advice;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdviceMapper implements RowMapper<Advice> {

    @Override
    public Advice mapRow(ResultSet rs, int i) throws SQLException {
        Advice advice = new Advice();
        advice.setIdAdvice(rs.getInt("id_advice"));
        advice.setIdPsAdvice(rs.getInt("id_ps_advice"));
        advice.setIdTab(rs.getInt("id_tab"));
        advice.setIdsTab(rs.getString("ids_tab"));
        advice.setValidated(rs.getInt("validated"));
        advice.setHide(rs.getInt("hide"));
        advice.setLocation(rs.getString("location"));
        advice.setSelector(rs.getString("selector"));
        advice.setStartDay(rs.getInt("start_day"));
        advice.setStopDay(rs.getInt("stop_day"));
        advice.setWeight(rs.getInt("weight"));
        return advice;
    }

}

