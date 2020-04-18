package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesFlatShipmentComment;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesFlatShipmentCommentMapper implements RowMapper<SalesFlatShipmentComment> {

    @Override
    public SalesFlatShipmentComment mapRow(ResultSet rs, int i) throws SQLException {
        SalesFlatShipmentComment salesFlatShipmentComment = new SalesFlatShipmentComment();
        salesFlatShipmentComment.setEntityId(rs.getInt("entity_id"));
        salesFlatShipmentComment.setParentId(rs.getInt("parent_id"));
        salesFlatShipmentComment.setIsCustomerNotified(rs.getInt("is_customer_notified"));
        salesFlatShipmentComment.setIsVisibleOnFront(rs.getInt("is_visible_on_front"));
        salesFlatShipmentComment.setComment(rs.getString("comment"));
        salesFlatShipmentComment.setCreatedAt(rs.getTimestamp("created_at") != null ? rs.getTimestamp("created_at").toLocalDateTime() : null);
        return salesFlatShipmentComment;
    }

}

