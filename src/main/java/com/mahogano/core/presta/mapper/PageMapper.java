package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Page;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PageMapper implements RowMapper<Page> {

    @Override
    public Page mapRow(ResultSet rs, int i) throws SQLException {
        Page page = new Page();
        page.setIdPage(rs.getInt("id_page"));
        page.setIdPageType(rs.getInt("id_page_type"));
        page.setIdObject(rs.getInt("id_object"));
        return page;
    }

}

