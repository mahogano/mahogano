package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.State;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StateMapper implements RowMapper<State> {

    @Override
    public State mapRow(ResultSet rs, int i) throws SQLException {
        State state = new State();
        state.setIdState(rs.getInt("id_state"));
        state.setIdCountry(rs.getInt("id_country"));
        state.setIdZone(rs.getInt("id_zone"));
        state.setName(rs.getString("name"));
        state.setIsoCode(rs.getString("iso_code"));
        state.setTaxBehavior(rs.getInt("tax_behavior"));
        state.setActive(rs.getInt("active"));
        return state;
    }

}

