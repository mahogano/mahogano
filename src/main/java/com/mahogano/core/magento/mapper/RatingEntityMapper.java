package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.RatingEntity;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RatingEntityMapper implements RowMapper<RatingEntity> {

    @Override
    public RatingEntity mapRow(ResultSet rs, int i) throws SQLException {
        RatingEntity ratingEntity = new RatingEntity();
        ratingEntity.setEntityId(rs.getInt("entity_id"));
        ratingEntity.setEntityCode(rs.getString("entity_code"));
        return ratingEntity;
    }

}

