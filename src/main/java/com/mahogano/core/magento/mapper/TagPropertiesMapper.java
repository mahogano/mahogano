package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.TagProperties;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TagPropertiesMapper implements RowMapper<TagProperties> {

    @Override
    public TagProperties mapRow(ResultSet rs, int i) throws SQLException {
        TagProperties tagProperties = new TagProperties();
        tagProperties.setTagId(rs.getInt("tag_id"));
        tagProperties.setStoreId(rs.getInt("store_id"));
        tagProperties.setBasePopularity(rs.getInt("base_popularity"));
        return tagProperties;
    }

}

