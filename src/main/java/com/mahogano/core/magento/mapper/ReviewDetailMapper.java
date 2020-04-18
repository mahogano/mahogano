package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.ReviewDetail;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReviewDetailMapper implements RowMapper<ReviewDetail> {

    @Override
    public ReviewDetail mapRow(ResultSet rs, int i) throws SQLException {
        ReviewDetail reviewDetail = new ReviewDetail();
        reviewDetail.setDetailId(rs.getLong("detail_id"));
        reviewDetail.setReviewId(rs.getLong("review_id"));
        reviewDetail.setStoreId(rs.getInt("store_id"));
        reviewDetail.setTitle(rs.getString("title"));
        reviewDetail.setDetail(rs.getString("detail"));
        reviewDetail.setNickname(rs.getString("nickname"));
        reviewDetail.setCustomerId(rs.getInt("customer_id"));
        return reviewDetail;
    }

}

