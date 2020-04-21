package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CmsCategoryLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CmsCategoryLangMapper implements RowMapper<CmsCategoryLang> {

    @Override
    public CmsCategoryLang mapRow(ResultSet rs, int i) throws SQLException {
        CmsCategoryLang cmsCategoryLang = new CmsCategoryLang();
        cmsCategoryLang.setIdCmsCategory(rs.getInt("id_cms_category"));
        cmsCategoryLang.setIdLang(rs.getInt("id_lang"));
        cmsCategoryLang.setIdShop(rs.getInt("id_shop"));
        cmsCategoryLang.setName(rs.getString("name"));
        cmsCategoryLang.setDescription(rs.getString("description"));
        cmsCategoryLang.setLinkRewrite(rs.getString("link_rewrite"));
        cmsCategoryLang.setMetaTitle(rs.getString("meta_title"));
        cmsCategoryLang.setMetaKeywords(rs.getString("meta_keywords"));
        cmsCategoryLang.setMetaDescription(rs.getString("meta_description"));
        return cmsCategoryLang;
    }

}

