package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.TagCount;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TagCountMapper implements RowMapper<TagCount> {

    @Override
    public TagCount mapRow(ResultSet rs, int i) throws SQLException {
        TagCount tagCount = new TagCount();
        tagCount.setIdGroup(rs.getInt("id_group"));
        tagCount.setIdTag(rs.getInt("id_tag"));
        tagCount.setIdLang(rs.getInt("id_lang"));
        tagCount.setIdShop(rs.getInt("id_shop"));
        tagCount.setCounter(rs.getInt("counter"));
        return tagCount;
    }

}

