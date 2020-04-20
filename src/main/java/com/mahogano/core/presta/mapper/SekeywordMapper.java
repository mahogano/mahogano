package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Sekeyword;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SekeywordMapper implements RowMapper<Sekeyword> {

    @Override
    public Sekeyword mapRow(ResultSet rs, int i) throws SQLException {
        Sekeyword sekeyword = new Sekeyword();
        sekeyword.setIdSekeyword(rs.getInt("id_sekeyword"));
        sekeyword.setIdShop(rs.getInt("id_shop"));
        sekeyword.setIdShopGroup(rs.getInt("id_shop_group"));
        sekeyword.setKeyword(rs.getString("keyword"));
        sekeyword.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        return sekeyword;
    }

}

