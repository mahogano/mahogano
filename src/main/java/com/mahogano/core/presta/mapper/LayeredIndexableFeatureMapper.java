package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.LayeredIndexableFeature;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LayeredIndexableFeatureMapper implements RowMapper<LayeredIndexableFeature> {

    @Override
    public LayeredIndexableFeature mapRow(ResultSet rs, int i) throws SQLException {
        LayeredIndexableFeature layeredIndexableFeature = new LayeredIndexableFeature();
        layeredIndexableFeature.setIdFeature(rs.getInt("id_feature"));
        layeredIndexableFeature.setIndexable(rs.getInt("indexable"));
        return layeredIndexableFeature;
    }

}

