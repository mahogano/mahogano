package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesFlatOrderStatusHistory;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesFlatOrderStatusHistoryMapper implements RowMapper<SalesFlatOrderStatusHistory> {

    @Override
    public SalesFlatOrderStatusHistory mapRow(ResultSet rs, int i) throws SQLException {
        SalesFlatOrderStatusHistory salesFlatOrderStatusHistory = new SalesFlatOrderStatusHistory();
        salesFlatOrderStatusHistory.setEntityId(rs.getInt("entity_id"));
        salesFlatOrderStatusHistory.setParentId(rs.getInt("parent_id"));
        salesFlatOrderStatusHistory.setIsCustomerNotified(rs.getInt("is_customer_notified"));
        salesFlatOrderStatusHistory.setIsVisibleOnFront(rs.getInt("is_visible_on_front"));
        salesFlatOrderStatusHistory.setComment(rs.getString("comment"));
        salesFlatOrderStatusHistory.setStatus(rs.getString("status"));
        salesFlatOrderStatusHistory.setCreatedAt(rs.getTimestamp("created_at") != null ? rs.getTimestamp("created_at").toLocalDateTime() : null);
        salesFlatOrderStatusHistory.setEntityName(rs.getString("entity_name"));
        return salesFlatOrderStatusHistory;
    }

}

