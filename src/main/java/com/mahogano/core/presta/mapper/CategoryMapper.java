package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Category;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryMapper implements RowMapper<Category> {

    @Override
    public Category mapRow(ResultSet rs, int i) throws SQLException {
        Category category = new Category();
        category.setIdCategory(rs.getInt("id_category"));
        category.setIdParent(rs.getInt("id_parent"));
        category.setIdShopDefault(rs.getInt("id_shop_default"));
        category.setLevelDepth(rs.getInt("level_depth"));
        category.setNleft(rs.getInt("nleft"));
        category.setNright(rs.getInt("nright"));
        category.setActive(rs.getInt("active"));
        category.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        category.setDateUpd(rs.getTimestamp("date_upd").toLocalDateTime());
        category.setPosition(rs.getInt("position"));
        category.setIsRootCategory(rs.getInt("is_root_category"));
        return category;
    }

}

