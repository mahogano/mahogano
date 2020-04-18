package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.DownloadableLinkPurchased;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DownloadableLinkPurchasedMapper implements RowMapper<DownloadableLinkPurchased> {

    @Override
    public DownloadableLinkPurchased mapRow(ResultSet rs, int i) throws SQLException {
        DownloadableLinkPurchased downloadableLinkPurchased = new DownloadableLinkPurchased();
        downloadableLinkPurchased.setPurchasedId(rs.getInt("purchased_id"));
        downloadableLinkPurchased.setOrderId(rs.getInt("order_id"));
        downloadableLinkPurchased.setOrderIncrementId(rs.getString("order_increment_id"));
        downloadableLinkPurchased.setOrderItemId(rs.getInt("order_item_id"));
        downloadableLinkPurchased.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        downloadableLinkPurchased.setUpdatedAt(rs.getTimestamp("updated_at").toLocalDateTime());
        downloadableLinkPurchased.setCustomerId(rs.getInt("customer_id"));
        downloadableLinkPurchased.setProductName(rs.getString("product_name"));
        downloadableLinkPurchased.setProductSku(rs.getString("product_sku"));
        downloadableLinkPurchased.setLinkSectionTitle(rs.getString("link_section_title"));
        return downloadableLinkPurchased;
    }

}

