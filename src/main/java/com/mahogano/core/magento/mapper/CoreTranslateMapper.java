package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CoreTranslate;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CoreTranslateMapper implements RowMapper<CoreTranslate> {

    @Override
    public CoreTranslate mapRow(ResultSet rs, int i) throws SQLException {
        CoreTranslate coreTranslate = new CoreTranslate();
        coreTranslate.setKeyId(rs.getInt("key_id"));
        coreTranslate.setString(rs.getString("string"));
        coreTranslate.setStoreId(rs.getInt("store_id"));
        coreTranslate.setTranslate(rs.getString("translate"));
        coreTranslate.setLocale(rs.getString("locale"));
        coreTranslate.setCrcString(rs.getLong("crc_string"));
        return coreTranslate;
    }

}

