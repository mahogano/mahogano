package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.LangShop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LangShopMapper implements RowMapper<LangShop> {

    @Override
    public LangShop mapRow(ResultSet rs, int i) throws SQLException {
        LangShop langShop = new LangShop();
        langShop.setIdLang(rs.getInt("id_lang"));
        langShop.setIdShop(rs.getInt("id_shop"));
        return langShop;
    }

}

