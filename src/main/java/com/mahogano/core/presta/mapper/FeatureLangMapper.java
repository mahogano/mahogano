package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.FeatureLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FeatureLangMapper implements RowMapper<FeatureLang> {

    @Override
    public FeatureLang mapRow(ResultSet rs, int i) throws SQLException {
        FeatureLang featureLang = new FeatureLang();
        featureLang.setIdFeature(rs.getInt("id_feature"));
        featureLang.setIdLang(rs.getInt("id_lang"));
        featureLang.setName(rs.getString("name"));
        return featureLang;
    }

}

