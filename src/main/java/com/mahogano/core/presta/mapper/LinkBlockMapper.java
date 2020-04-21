package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.LinkBlock;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LinkBlockMapper implements RowMapper<LinkBlock> {

    @Override
    public LinkBlock mapRow(ResultSet rs, int i) throws SQLException {
        LinkBlock linkBlock = new LinkBlock();
        linkBlock.setIdLinkBlock(rs.getInt("id_link_block"));
        linkBlock.setIdHook(rs.getInt("id_hook"));
        linkBlock.setPosition(rs.getInt("position"));
        linkBlock.setContent(rs.getString("content"));
        return linkBlock;
    }

}

