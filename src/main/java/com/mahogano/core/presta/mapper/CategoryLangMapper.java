package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CategoryLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryLangMapper implements RowMapper<CategoryLang> {

    @Override
    public CategoryLang mapRow(ResultSet rs, int i) throws SQLException {
        CategoryLang categoryLang = new CategoryLang();
        categoryLang.setIdCategory(rs.getInt("id_category"));
        categoryLang.setIdShop(rs.getInt("id_shop"));
        categoryLang.setIdLang(rs.getInt("id_lang"));
        categoryLang.setName(rs.getString("name"));
        categoryLang.setDescription(rs.getString("description"));
        categoryLang.setLinkRewrite(rs.getString("link_rewrite"));
        categoryLang.setMetaTitle(rs.getString("meta_title"));
        categoryLang.setMetaKeywords(rs.getString("meta_keywords"));
        categoryLang.setMetaDescription(rs.getString("meta_description"));
        return categoryLang;
    }

}

