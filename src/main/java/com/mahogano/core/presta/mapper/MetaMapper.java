package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Meta;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MetaMapper implements RowMapper<Meta> {

    @Override
    public Meta mapRow(ResultSet rs, int i) throws SQLException {
        Meta meta = new Meta();
        meta.setIdMeta(rs.getInt("id_meta"));
        meta.setPage(rs.getString("page"));
        meta.setConfigurable(rs.getInt("configurable"));
        return meta;
    }

}

