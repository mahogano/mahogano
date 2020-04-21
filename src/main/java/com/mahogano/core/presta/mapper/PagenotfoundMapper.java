package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Pagenotfound;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PagenotfoundMapper implements RowMapper<Pagenotfound> {

    @Override
    public Pagenotfound mapRow(ResultSet rs, int i) throws SQLException {
        Pagenotfound pagenotfound = new Pagenotfound();
        pagenotfound.setIdPagenotfound(rs.getInt("id_pagenotfound"));
        pagenotfound.setIdShop(rs.getInt("id_shop"));
        pagenotfound.setIdShopGroup(rs.getInt("id_shop_group"));
        pagenotfound.setRequestUri(rs.getString("request_uri"));
        pagenotfound.setHttpReferer(rs.getString("http_referer"));
        pagenotfound.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        return pagenotfound;
    }

}

