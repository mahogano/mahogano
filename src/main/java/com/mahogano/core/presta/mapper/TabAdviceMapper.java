package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.TabAdvice;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TabAdviceMapper implements RowMapper<TabAdvice> {

    @Override
    public TabAdvice mapRow(ResultSet rs, int i) throws SQLException {
        TabAdvice tabAdvice = new TabAdvice();
        tabAdvice.setIdTab(rs.getInt("id_tab"));
        tabAdvice.setIdAdvice(rs.getInt("id_advice"));
        return tabAdvice;
    }

}

