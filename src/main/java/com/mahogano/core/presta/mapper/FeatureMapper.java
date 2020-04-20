package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Feature;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FeatureMapper implements RowMapper<Feature> {

    @Override
    public Feature mapRow(ResultSet rs, int i) throws SQLException {
        Feature feature = new Feature();
        feature.setIdFeature(rs.getInt("id_feature"));
        feature.setPosition(rs.getInt("position"));
        return feature;
    }

}

