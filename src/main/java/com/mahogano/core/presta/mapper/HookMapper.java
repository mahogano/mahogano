package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Hook;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HookMapper implements RowMapper<Hook> {

    @Override
    public Hook mapRow(ResultSet rs, int i) throws SQLException {
        Hook hook = new Hook();
        hook.setIdHook(rs.getInt("id_hook"));
        hook.setName(rs.getString("name"));
        hook.setTitle(rs.getString("title"));
        hook.setDescription(rs.getString("description"));
        hook.setPosition(rs.getInt("position"));
        return hook;
    }

}

