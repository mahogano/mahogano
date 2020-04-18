package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesFlatCreditmemoComment;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesFlatCreditmemoCommentMapper implements RowMapper<SalesFlatCreditmemoComment> {

    @Override
    public SalesFlatCreditmemoComment mapRow(ResultSet rs, int i) throws SQLException {
        SalesFlatCreditmemoComment salesFlatCreditmemoComment = new SalesFlatCreditmemoComment();
        salesFlatCreditmemoComment.setEntityId(rs.getInt("entity_id"));
        salesFlatCreditmemoComment.setParentId(rs.getInt("parent_id"));
        salesFlatCreditmemoComment.setIsCustomerNotified(rs.getInt("is_customer_notified"));
        salesFlatCreditmemoComment.setIsVisibleOnFront(rs.getInt("is_visible_on_front"));
        salesFlatCreditmemoComment.setComment(rs.getString("comment"));
        salesFlatCreditmemoComment.setCreatedAt(rs.getTimestamp("created_at") != null ? rs.getTimestamp("created_at").toLocalDateTime() : null);
        return salesFlatCreditmemoComment;
    }

}

