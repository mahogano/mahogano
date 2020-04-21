package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.StoreLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StoreLangMapper implements RowMapper<StoreLang> {

    @Override
    public StoreLang mapRow(ResultSet rs, int i) throws SQLException {
        StoreLang storeLang = new StoreLang();
        storeLang.setIdStore(rs.getInt("id_store"));
        storeLang.setIdLang(rs.getInt("id_lang"));
        storeLang.setName(rs.getString("name"));
        storeLang.setAddress1(rs.getString("address1"));
        storeLang.setAddress2(rs.getString("address2"));
        storeLang.setHours(rs.getString("hours"));
        storeLang.setNote(rs.getString("note"));
        return storeLang;
    }

}

