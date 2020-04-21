package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.FeatureProduct;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FeatureProductMapper implements RowMapper<FeatureProduct> {

    @Override
    public FeatureProduct mapRow(ResultSet rs, int i) throws SQLException {
        FeatureProduct featureProduct = new FeatureProduct();
        featureProduct.setIdFeature(rs.getInt("id_feature"));
        featureProduct.setIdProduct(rs.getInt("id_product"));
        featureProduct.setIdFeatureValue(rs.getInt("id_feature_value"));
        return featureProduct;
    }

}

