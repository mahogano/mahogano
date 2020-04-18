package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CoreFlag;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CoreFlagMapper implements RowMapper<CoreFlag> {

    @Override
    public CoreFlag mapRow(ResultSet rs, int i) throws SQLException {
        CoreFlag coreFlag = new CoreFlag();
        coreFlag.setFlagId(rs.getInt("flag_id"));
        coreFlag.setFlagCode(rs.getString("flag_code"));
        coreFlag.setState(rs.getInt("state"));
        coreFlag.setFlagData(rs.getString("flag_data"));
        coreFlag.setLastUpdate(rs.getTimestamp("last_update").toLocalDateTime());
        return coreFlag;
    }

}

