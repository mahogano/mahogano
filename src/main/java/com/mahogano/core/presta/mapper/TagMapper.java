package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Tag;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TagMapper implements RowMapper<Tag> {

    @Override
    public Tag mapRow(ResultSet rs, int i) throws SQLException {
        Tag tag = new Tag();
        tag.setIdTag(rs.getInt("id_tag"));
        tag.setIdLang(rs.getInt("id_lang"));
        tag.setName(rs.getString("name"));
        return tag;
    }

}

