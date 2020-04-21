package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.SmartyCache;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SmartyCacheMapper implements RowMapper<SmartyCache> {

    @Override
    public SmartyCache mapRow(ResultSet rs, int i) throws SQLException {
        SmartyCache smartyCache = new SmartyCache();
        smartyCache.setIdSmartyCache(rs.getString("id_smarty_cache"));
        smartyCache.setName(rs.getString("name"));
        smartyCache.setCacheId(rs.getString("cache_id"));
        smartyCache.setModified(rs.getTimestamp("modified").toLocalDateTime());
        smartyCache.setContent(rs.getString("content"));
        return smartyCache;
    }

}

