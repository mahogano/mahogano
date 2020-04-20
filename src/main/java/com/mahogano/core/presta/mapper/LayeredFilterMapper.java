package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.LayeredFilter;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LayeredFilterMapper implements RowMapper<LayeredFilter> {

    @Override
    public LayeredFilter mapRow(ResultSet rs, int i) throws SQLException {
        LayeredFilter layeredFilter = new LayeredFilter();
        layeredFilter.setIdLayeredFilter(rs.getInt("id_layered_filter"));
        layeredFilter.setName(rs.getString("name"));
        layeredFilter.setFilters(rs.getString("filters"));
        layeredFilter.setNCategories(rs.getInt("n_categories"));
        layeredFilter.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        return layeredFilter;
    }

}

