package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.SearchIndex;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchIndexMapper implements RowMapper<SearchIndex> {

    @Override
    public SearchIndex mapRow(ResultSet rs, int i) throws SQLException {
        SearchIndex searchIndex = new SearchIndex();
        searchIndex.setIdProduct(rs.getInt("id_product"));
        searchIndex.setIdWord(rs.getInt("id_word"));
        searchIndex.setWeight(rs.getInt("weight"));
        return searchIndex;
    }

}

