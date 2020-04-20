package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.PageViewed;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PageViewedMapper implements RowMapper<PageViewed> {

    @Override
    public PageViewed mapRow(ResultSet rs, int i) throws SQLException {
        PageViewed pageViewed = new PageViewed();
        pageViewed.setIdPage(rs.getInt("id_page"));
        pageViewed.setIdShopGroup(rs.getInt("id_shop_group"));
        pageViewed.setIdShop(rs.getInt("id_shop"));
        pageViewed.setIdDateRange(rs.getInt("id_date_range"));
        pageViewed.setCounter(rs.getInt("counter"));
        return pageViewed;
    }

}

