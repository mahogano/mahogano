package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.LinkBlockShop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LinkBlockShopMapper implements RowMapper<LinkBlockShop> {

    @Override
    public LinkBlockShop mapRow(ResultSet rs, int i) throws SQLException {
        LinkBlockShop linkBlockShop = new LinkBlockShop();
        linkBlockShop.setIdLinkBlock(rs.getInt("id_link_block"));
        linkBlockShop.setIdShop(rs.getInt("id_shop"));
        return linkBlockShop;
    }

}

