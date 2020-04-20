package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.SearchEngine;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchEngineMapper implements RowMapper<SearchEngine> {

    @Override
    public SearchEngine mapRow(ResultSet rs, int i) throws SQLException {
        SearchEngine searchEngine = new SearchEngine();
        searchEngine.setIdSearchEngine(rs.getInt("id_search_engine"));
        searchEngine.setServer(rs.getString("server"));
        searchEngine.setGetvar(rs.getString("getvar"));
        return searchEngine;
    }

}

