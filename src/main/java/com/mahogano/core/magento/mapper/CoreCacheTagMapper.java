package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CoreCacheTag;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CoreCacheTagMapper implements RowMapper<CoreCacheTag> {

    @Override
    public CoreCacheTag mapRow(ResultSet rs, int i) throws SQLException {
        CoreCacheTag coreCacheTag = new CoreCacheTag();
        coreCacheTag.setTag(rs.getString("tag"));
        coreCacheTag.setCacheId(rs.getString("cache_id"));
        return coreCacheTag;
    }

}

