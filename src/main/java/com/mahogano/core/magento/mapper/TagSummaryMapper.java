package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.TagSummary;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TagSummaryMapper implements RowMapper<TagSummary> {

    @Override
    public TagSummary mapRow(ResultSet rs, int i) throws SQLException {
        TagSummary tagSummary = new TagSummary();
        tagSummary.setTagId(rs.getInt("tag_id"));
        tagSummary.setStoreId(rs.getInt("store_id"));
        tagSummary.setCustomers(rs.getInt("customers"));
        tagSummary.setProducts(rs.getInt("products"));
        tagSummary.setUses(rs.getInt("uses"));
        tagSummary.setHistoricalUses(rs.getInt("historical_uses"));
        tagSummary.setPopularity(rs.getInt("popularity"));
        tagSummary.setBasePopularity(rs.getInt("base_popularity"));
        return tagSummary;
    }

}

