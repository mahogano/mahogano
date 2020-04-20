package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.MetaLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MetaLangMapper implements RowMapper<MetaLang> {

    @Override
    public MetaLang mapRow(ResultSet rs, int i) throws SQLException {
        MetaLang metaLang = new MetaLang();
        metaLang.setIdMeta(rs.getInt("id_meta"));
        metaLang.setIdShop(rs.getInt("id_shop"));
        metaLang.setIdLang(rs.getInt("id_lang"));
        metaLang.setTitle(rs.getString("title"));
        metaLang.setDescription(rs.getString("description"));
        metaLang.setKeywords(rs.getString("keywords"));
        metaLang.setUrlRewrite(rs.getString("url_rewrite"));
        return metaLang;
    }

}

