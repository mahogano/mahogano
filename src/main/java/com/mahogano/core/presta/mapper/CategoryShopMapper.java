package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CategoryShop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryShopMapper implements RowMapper<CategoryShop> {

    @Override
    public CategoryShop mapRow(ResultSet rs, int i) throws SQLException {
        CategoryShop categoryShop = new CategoryShop();
        categoryShop.setIdCategory(rs.getInt("id_category"));
        categoryShop.setIdShop(rs.getInt("id_shop"));
        categoryShop.setPosition(rs.getInt("position"));
        return categoryShop;
    }

}

