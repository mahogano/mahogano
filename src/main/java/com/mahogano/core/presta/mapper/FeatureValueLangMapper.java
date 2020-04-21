package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.FeatureValueLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FeatureValueLangMapper implements RowMapper<FeatureValueLang> {

    @Override
    public FeatureValueLang mapRow(ResultSet rs, int i) throws SQLException {
        FeatureValueLang featureValueLang = new FeatureValueLang();
        featureValueLang.setIdFeatureValue(rs.getInt("id_feature_value"));
        featureValueLang.setIdLang(rs.getInt("id_lang"));
        featureValueLang.setValue(rs.getString("value"));
        return featureValueLang;
    }

}

