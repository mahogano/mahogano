package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Alias;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AliasMapper implements RowMapper<Alias> {

    @Override
    public Alias mapRow(ResultSet rs, int i) throws SQLException {
        Alias alias = new Alias();
        alias.setIdAlias(rs.getInt("id_alias"));
        alias.setAlias(rs.getString("alias"));
        alias.setSearch(rs.getString("search"));
        alias.setActive(rs.getInt("active"));
        return alias;
    }

}

