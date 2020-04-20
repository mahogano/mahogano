package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.SmartyLazyCache;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SmartyLazyCacheMapper implements RowMapper<SmartyLazyCache> {

    @Override
    public SmartyLazyCache mapRow(ResultSet rs, int i) throws SQLException {
        SmartyLazyCache smartyLazyCache = new SmartyLazyCache();
        smartyLazyCache.setTemplateHash(rs.getString("template_hash"));
        smartyLazyCache.setCacheId(rs.getString("cache_id"));
        smartyLazyCache.setCompileId(rs.getString("compile_id"));
        smartyLazyCache.setFilepath(rs.getString("filepath"));
        smartyLazyCache.setLastUpdate(rs.getTimestamp("last_update").toLocalDateTime());
        return smartyLazyCache;
    }

}

