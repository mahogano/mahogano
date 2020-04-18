package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CaptchaLog;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CaptchaLogMapper implements RowMapper<CaptchaLog> {

    @Override
    public CaptchaLog mapRow(ResultSet rs, int i) throws SQLException {
        CaptchaLog captchaLog = new CaptchaLog();
        captchaLog.setType(rs.getString("type"));
        captchaLog.setValue(rs.getString("value"));
        captchaLog.setCount(rs.getInt("count"));
        captchaLog.setUpdatedAt(rs.getTimestamp("updated_at") != null ? rs.getTimestamp("updated_at").toLocalDateTime() : null);
        return captchaLog;
    }

}

