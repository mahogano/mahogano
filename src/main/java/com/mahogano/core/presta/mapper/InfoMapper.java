package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Info;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InfoMapper implements RowMapper<Info> {

    @Override
    public Info mapRow(ResultSet rs, int i) throws SQLException {
        Info info = new Info();
        info.setIdInfo(rs.getInt("id_info"));
        return info;
    }

}

