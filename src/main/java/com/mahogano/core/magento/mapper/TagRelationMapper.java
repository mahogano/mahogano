package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.TagRelation;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TagRelationMapper implements RowMapper<TagRelation> {

    @Override
    public TagRelation mapRow(ResultSet rs, int i) throws SQLException {
        TagRelation tagRelation = new TagRelation();
        tagRelation.setTagRelationId(rs.getInt("tag_relation_id"));
        tagRelation.setTagId(rs.getInt("tag_id"));
        tagRelation.setCustomerId(rs.getInt("customer_id"));
        tagRelation.setProductId(rs.getInt("product_id"));
        tagRelation.setStoreId(rs.getInt("store_id"));
        tagRelation.setActive(rs.getInt("active"));
        tagRelation.setCreatedAt(rs.getTimestamp("created_at") != null ? rs.getTimestamp("created_at").toLocalDateTime() : null);
        return tagRelation;
    }

}

