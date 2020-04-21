package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Gender;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GenderMapper implements RowMapper<Gender> {

    @Override
    public Gender mapRow(ResultSet rs, int i) throws SQLException {
        Gender gender = new Gender();
        gender.setIdGender(rs.getInt("id_gender"));
        gender.setType(rs.getInt("type"));
        return gender;
    }

}

