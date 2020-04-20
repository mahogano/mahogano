package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.GroupLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GroupLangMapper implements RowMapper<GroupLang> {

    @Override
    public GroupLang mapRow(ResultSet rs, int i) throws SQLException {
        GroupLang groupLang = new GroupLang();
        groupLang.setIdGroup(rs.getInt("id_group"));
        groupLang.setIdLang(rs.getInt("id_lang"));
        groupLang.setName(rs.getString("name"));
        return groupLang;
    }

}

