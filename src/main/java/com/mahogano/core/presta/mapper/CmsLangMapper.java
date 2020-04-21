package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CmsLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CmsLangMapper implements RowMapper<CmsLang> {

    @Override
    public CmsLang mapRow(ResultSet rs, int i) throws SQLException {
        CmsLang cmsLang = new CmsLang();
        cmsLang.setIdCms(rs.getInt("id_cms"));
        cmsLang.setIdLang(rs.getInt("id_lang"));
        cmsLang.setIdShop(rs.getInt("id_shop"));
        cmsLang.setMetaTitle(rs.getString("meta_title"));
        cmsLang.setHeadSeoTitle(rs.getString("head_seo_title"));
        cmsLang.setMetaDescription(rs.getString("meta_description"));
        cmsLang.setMetaKeywords(rs.getString("meta_keywords"));
        cmsLang.setContent(rs.getString("content"));
        cmsLang.setLinkRewrite(rs.getString("link_rewrite"));
        return cmsLang;
    }

}

