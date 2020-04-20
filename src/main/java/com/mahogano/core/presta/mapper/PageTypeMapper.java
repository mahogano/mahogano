package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.PageType;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PageTypeMapper implements RowMapper<PageType> {

    @Override
    public PageType mapRow(ResultSet rs, int i) throws SQLException {
        PageType pageType = new PageType();
        pageType.setIdPageType(rs.getInt("id_page_type"));
        pageType.setName(rs.getString("name"));
        return pageType;
    }

}

