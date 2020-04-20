package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.BadgeLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BadgeLangMapper implements RowMapper<BadgeLang> {

    @Override
    public BadgeLang mapRow(ResultSet rs, int i) throws SQLException {
        BadgeLang badgeLang = new BadgeLang();
        badgeLang.setIdBadge(rs.getInt("id_badge"));
        badgeLang.setIdLang(rs.getInt("id_lang"));
        badgeLang.setName(rs.getString("name"));
        badgeLang.setDescription(rs.getString("description"));
        badgeLang.setGroupName(rs.getString("group_name"));
        return badgeLang;
    }

}

