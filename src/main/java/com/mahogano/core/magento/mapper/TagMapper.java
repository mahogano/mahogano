package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.Tag;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TagMapper implements RowMapper<Tag> {

    @Override
    public Tag mapRow(ResultSet rs, int i) throws SQLException {
        Tag tag = new Tag();
        tag.setTagId(rs.getInt("tag_id"));
        tag.setName(rs.getString("name"));
        tag.setStatus(rs.getInt("status"));
        tag.setFirstCustomerId(rs.getInt("first_customer_id"));
        tag.setFirstStoreId(rs.getInt("first_store_id"));
        return tag;
    }

}

