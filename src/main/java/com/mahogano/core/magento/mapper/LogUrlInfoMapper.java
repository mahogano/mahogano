package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.LogUrlInfo;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LogUrlInfoMapper implements RowMapper<LogUrlInfo> {

    @Override
    public LogUrlInfo mapRow(ResultSet rs, int i) throws SQLException {
        LogUrlInfo logUrlInfo = new LogUrlInfo();
        logUrlInfo.setUrlId(rs.getLong("url_id"));
        logUrlInfo.setUrl(rs.getString("url"));
        logUrlInfo.setReferer(rs.getString("referer"));
        return logUrlInfo;
    }

}

