package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.LinkBlockLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LinkBlockLangMapper implements RowMapper<LinkBlockLang> {

    @Override
    public LinkBlockLang mapRow(ResultSet rs, int i) throws SQLException {
        LinkBlockLang linkBlockLang = new LinkBlockLang();
        linkBlockLang.setIdLinkBlock(rs.getInt("id_link_block"));
        linkBlockLang.setIdLang(rs.getInt("id_lang"));
        linkBlockLang.setName(rs.getString("name"));
        linkBlockLang.setCustomContent(rs.getString("custom_content"));
        return linkBlockLang;
    }

}

