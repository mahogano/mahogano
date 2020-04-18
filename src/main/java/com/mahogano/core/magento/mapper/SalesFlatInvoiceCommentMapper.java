package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesFlatInvoiceComment;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesFlatInvoiceCommentMapper implements RowMapper<SalesFlatInvoiceComment> {

    @Override
    public SalesFlatInvoiceComment mapRow(ResultSet rs, int i) throws SQLException {
        SalesFlatInvoiceComment salesFlatInvoiceComment = new SalesFlatInvoiceComment();
        salesFlatInvoiceComment.setEntityId(rs.getInt("entity_id"));
        salesFlatInvoiceComment.setParentId(rs.getInt("parent_id"));
        salesFlatInvoiceComment.setIsCustomerNotified(rs.getInt("is_customer_notified"));
        salesFlatInvoiceComment.setIsVisibleOnFront(rs.getInt("is_visible_on_front"));
        salesFlatInvoiceComment.setComment(rs.getString("comment"));
        salesFlatInvoiceComment.setCreatedAt(rs.getTimestamp("created_at") != null ? rs.getTimestamp("created_at").toLocalDateTime() : null);
        return salesFlatInvoiceComment;
    }

}

