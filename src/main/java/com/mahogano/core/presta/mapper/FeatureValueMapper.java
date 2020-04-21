package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.FeatureValue;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FeatureValueMapper implements RowMapper<FeatureValue> {

    @Override
    public FeatureValue mapRow(ResultSet rs, int i) throws SQLException {
        FeatureValue featureValue = new FeatureValue();
        featureValue.setIdFeatureValue(rs.getInt("id_feature_value"));
        featureValue.setIdFeature(rs.getInt("id_feature"));
        featureValue.setCustom(rs.getInt("custom"));
        return featureValue;
    }

}

