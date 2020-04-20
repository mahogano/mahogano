package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.LayeredIndexableFeatureLangValue;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LayeredIndexableFeatureLangValueMapper implements RowMapper<LayeredIndexableFeatureLangValue> {

    @Override
    public LayeredIndexableFeatureLangValue mapRow(ResultSet rs, int i) throws SQLException {
        LayeredIndexableFeatureLangValue layeredIndexableFeatureLangValue = new LayeredIndexableFeatureLangValue();
        layeredIndexableFeatureLangValue.setIdFeature(rs.getInt("id_feature"));
        layeredIndexableFeatureLangValue.setIdLang(rs.getInt("id_lang"));
        layeredIndexableFeatureLangValue.setUrlName(rs.getString("url_name"));
        layeredIndexableFeatureLangValue.setMetaTitle(rs.getString("meta_title"));
        return layeredIndexableFeatureLangValue;
    }

}

