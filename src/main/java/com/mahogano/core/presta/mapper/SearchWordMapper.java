package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.SearchWord;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchWordMapper implements RowMapper<SearchWord> {

    @Override
    public SearchWord mapRow(ResultSet rs, int i) throws SQLException {
        SearchWord searchWord = new SearchWord();
        searchWord.setIdWord(rs.getInt("id_word"));
        searchWord.setIdShop(rs.getInt("id_shop"));
        searchWord.setIdLang(rs.getInt("id_lang"));
        searchWord.setWord(rs.getString("word"));
        return searchWord;
    }

}

