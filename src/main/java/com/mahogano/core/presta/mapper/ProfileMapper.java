package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Profile;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProfileMapper implements RowMapper<Profile> {

    @Override
    public Profile mapRow(ResultSet rs, int i) throws SQLException {
        Profile profile = new Profile();
        profile.setIdProfile(rs.getInt("id_profile"));
        return profile;
    }

}

