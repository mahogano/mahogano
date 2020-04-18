package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CoreCache;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CoreCacheMapper implements RowMapper<CoreCache> {

    @Override
    public CoreCache mapRow(ResultSet rs, int i) throws SQLException {
        CoreCache coreCache = new CoreCache();
        coreCache.setId(rs.getString("id"));
        coreCache.setData(rs.getBytes("data"));
        coreCache.setCreateTime(rs.getInt("create_time"));
        coreCache.setUpdateTime(rs.getInt("update_time"));
        coreCache.setExpireTime(rs.getInt("expire_time"));
        return coreCache;
    }

}

