package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.DownloadableLinkPurchasedItem;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DownloadableLinkPurchasedItemMapper implements RowMapper<DownloadableLinkPurchasedItem> {

    @Override
    public DownloadableLinkPurchasedItem mapRow(ResultSet rs, int i) throws SQLException {
        DownloadableLinkPurchasedItem downloadableLinkPurchasedItem = new DownloadableLinkPurchasedItem();
        downloadableLinkPurchasedItem.setItemId(rs.getInt("item_id"));
        downloadableLinkPurchasedItem.setPurchasedId(rs.getInt("purchased_id"));
        downloadableLinkPurchasedItem.setOrderItemId(rs.getInt("order_item_id"));
        downloadableLinkPurchasedItem.setProductId(rs.getInt("product_id"));
        downloadableLinkPurchasedItem.setLinkHash(rs.getString("link_hash"));
        downloadableLinkPurchasedItem.setNumberOfDownloadsBought(rs.getInt("number_of_downloads_bought"));
        downloadableLinkPurchasedItem.setNumberOfDownloadsUsed(rs.getInt("number_of_downloads_used"));
        downloadableLinkPurchasedItem.setLinkId(rs.getInt("link_id"));
        downloadableLinkPurchasedItem.setLinkTitle(rs.getString("link_title"));
        downloadableLinkPurchasedItem.setIsShareable(rs.getInt("is_shareable"));
        downloadableLinkPurchasedItem.setLinkUrl(rs.getString("link_url"));
        downloadableLinkPurchasedItem.setLinkFile(rs.getString("link_file"));
        downloadableLinkPurchasedItem.setLinkType(rs.getString("link_type"));
        downloadableLinkPurchasedItem.setStatus(rs.getString("status"));
        downloadableLinkPurchasedItem.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        downloadableLinkPurchasedItem.setUpdatedAt(rs.getTimestamp("updated_at").toLocalDateTime());
        return downloadableLinkPurchasedItem;
    }

}

