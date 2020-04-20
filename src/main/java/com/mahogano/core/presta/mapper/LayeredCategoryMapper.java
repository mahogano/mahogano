package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.LayeredCategory;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LayeredCategoryMapper implements RowMapper<LayeredCategory> {

    @Override
    public LayeredCategory mapRow(ResultSet rs, int i) throws SQLException {
        LayeredCategory layeredCategory = new LayeredCategory();
        layeredCategory.setIdLayeredCategory(rs.getInt("id_layered_category"));
        layeredCategory.setIdShop(rs.getInt("id_shop"));
        layeredCategory.setIdCategory(rs.getInt("id_category"));
        layeredCategory.setIdValue(rs.getInt("id_value"));
        layeredCategory.setType(rs.getString("type"));
        layeredCategory.setPosition(rs.getInt("position"));
        layeredCategory.setFilterType(rs.getInt("filter_type"));
        layeredCategory.setFilterShowLimit(rs.getInt("filter_show_limit"));
        return layeredCategory;
    }

}

