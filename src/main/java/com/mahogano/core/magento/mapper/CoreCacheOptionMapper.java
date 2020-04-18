package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CoreCacheOption;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CoreCacheOptionMapper implements RowMapper<CoreCacheOption> {

    @Override
    public CoreCacheOption mapRow(ResultSet rs, int i) throws SQLException {
        CoreCacheOption coreCacheOption = new CoreCacheOption();
        coreCacheOption.setCode(rs.getString("code"));
        coreCacheOption.setValue(rs.getInt("value"));
        return coreCacheOption;
    }

}

