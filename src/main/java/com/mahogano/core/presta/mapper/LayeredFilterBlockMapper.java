package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.LayeredFilterBlock;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LayeredFilterBlockMapper implements RowMapper<LayeredFilterBlock> {

    @Override
    public LayeredFilterBlock mapRow(ResultSet rs, int i) throws SQLException {
        LayeredFilterBlock layeredFilterBlock = new LayeredFilterBlock();
        layeredFilterBlock.setHash(rs.getString("hash"));
        layeredFilterBlock.setData(rs.getString("data"));
        return layeredFilterBlock;
    }

}

