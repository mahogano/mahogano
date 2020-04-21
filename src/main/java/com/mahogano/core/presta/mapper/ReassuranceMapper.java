package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Reassurance;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReassuranceMapper implements RowMapper<Reassurance> {

    @Override
    public Reassurance mapRow(ResultSet rs, int i) throws SQLException {
        Reassurance reassurance = new Reassurance();
        reassurance.setIdReassurance(rs.getInt("id_reassurance"));
        reassurance.setIdShop(rs.getInt("id_shop"));
        reassurance.setFileName(rs.getString("file_name"));
        return reassurance;
    }

}

