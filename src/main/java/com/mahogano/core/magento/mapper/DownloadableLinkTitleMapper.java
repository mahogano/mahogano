package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.DownloadableLinkTitle;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DownloadableLinkTitleMapper implements RowMapper<DownloadableLinkTitle> {

    @Override
    public DownloadableLinkTitle mapRow(ResultSet rs, int i) throws SQLException {
        DownloadableLinkTitle downloadableLinkTitle = new DownloadableLinkTitle();
        downloadableLinkTitle.setTitleId(rs.getInt("title_id"));
        downloadableLinkTitle.setLinkId(rs.getInt("link_id"));
        downloadableLinkTitle.setStoreId(rs.getInt("store_id"));
        downloadableLinkTitle.setTitle(rs.getString("title"));
        return downloadableLinkTitle;
    }

}

