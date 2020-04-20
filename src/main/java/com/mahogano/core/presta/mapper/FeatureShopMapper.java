package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.FeatureShop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FeatureShopMapper implements RowMapper<FeatureShop> {

    @Override
    public FeatureShop mapRow(ResultSet rs, int i) throws SQLException {
        FeatureShop featureShop = new FeatureShop();
        featureShop.setIdFeature(rs.getInt("id_feature"));
        featureShop.setIdShop(rs.getInt("id_shop"));
        return featureShop;
    }

}

