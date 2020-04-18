package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.ReviewEntity;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReviewEntityMapper implements RowMapper<ReviewEntity> {

    @Override
    public ReviewEntity mapRow(ResultSet rs, int i) throws SQLException {
        ReviewEntity reviewEntity = new ReviewEntity();
        reviewEntity.setEntityId(rs.getInt("entity_id"));
        reviewEntity.setEntityCode(rs.getString("entity_code"));
        return reviewEntity;
    }

}

