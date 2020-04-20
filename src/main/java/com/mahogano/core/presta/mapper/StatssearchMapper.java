package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Statssearch;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StatssearchMapper implements RowMapper<Statssearch> {

    @Override
    public Statssearch mapRow(ResultSet rs, int i) throws SQLException {
        Statssearch statssearch = new Statssearch();
        statssearch.setIdStatssearch(rs.getInt("id_statssearch"));
        statssearch.setIdShop(rs.getInt("id_shop"));
        statssearch.setIdShopGroup(rs.getInt("id_shop_group"));
        statssearch.setKeywords(rs.getString("keywords"));
        statssearch.setResults(rs.getInt("results"));
        statssearch.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        return statssearch;
    }

}

