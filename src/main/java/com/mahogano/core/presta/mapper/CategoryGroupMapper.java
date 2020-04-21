package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CategoryGroup;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryGroupMapper implements RowMapper<CategoryGroup> {

    @Override
    public CategoryGroup mapRow(ResultSet rs, int i) throws SQLException {
        CategoryGroup categoryGroup = new CategoryGroup();
        categoryGroup.setIdCategory(rs.getInt("id_category"));
        categoryGroup.setIdGroup(rs.getInt("id_group"));
        return categoryGroup;
    }

}

