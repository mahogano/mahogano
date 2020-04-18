package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.ReviewStatus;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReviewStatusMapper implements RowMapper<ReviewStatus> {

    @Override
    public ReviewStatus mapRow(ResultSet rs, int i) throws SQLException {
        ReviewStatus reviewStatus = new ReviewStatus();
        reviewStatus.setStatusId(rs.getInt("status_id"));
        reviewStatus.setStatusCode(rs.getString("status_code"));
        return reviewStatus;
    }

}

