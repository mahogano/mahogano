package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.LayeredIndexableFeatureValueLangValue;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LayeredIndexableFeatureValueLangValueMapper implements RowMapper<LayeredIndexableFeatureValueLangValue> {

    @Override
    public LayeredIndexableFeatureValueLangValue mapRow(ResultSet rs, int i) throws SQLException {
        LayeredIndexableFeatureValueLangValue layeredIndexableFeatureValueLangValue = new LayeredIndexableFeatureValueLangValue();
        layeredIndexableFeatureValueLangValue.setIdFeatureValue(rs.getInt("id_feature_value"));
        layeredIndexableFeatureValueLangValue.setIdLang(rs.getInt("id_lang"));
        layeredIndexableFeatureValueLangValue.setUrlName(rs.getString("url_name"));
        layeredIndexableFeatureValueLangValue.setMetaTitle(rs.getString("meta_title"));
        return layeredIndexableFeatureValueLangValue;
    }

}

