package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.HookAlias;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HookAliasMapper implements RowMapper<HookAlias> {

    @Override
    public HookAlias mapRow(ResultSet rs, int i) throws SQLException {
        HookAlias hookAlias = new HookAlias();
        hookAlias.setIdHookAlias(rs.getInt("id_hook_alias"));
        hookAlias.setAlias(rs.getString("alias"));
        hookAlias.setName(rs.getString("name"));
        return hookAlias;
    }

}

