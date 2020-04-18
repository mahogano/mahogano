package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.DownloadableLink;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DownloadableLinkMapper implements RowMapper<DownloadableLink> {

    @Override
    public DownloadableLink mapRow(ResultSet rs, int i) throws SQLException {
        DownloadableLink downloadableLink = new DownloadableLink();
        downloadableLink.setLinkId(rs.getInt("link_id"));
        downloadableLink.setProductId(rs.getInt("product_id"));
        downloadableLink.setSortOrder(rs.getInt("sort_order"));
        downloadableLink.setNumberOfDownloads(rs.getInt("number_of_downloads"));
        downloadableLink.setIsShareable(rs.getInt("is_shareable"));
        downloadableLink.setLinkUrl(rs.getString("link_url"));
        downloadableLink.setLinkFile(rs.getString("link_file"));
        downloadableLink.setLinkType(rs.getString("link_type"));
        downloadableLink.setSampleUrl(rs.getString("sample_url"));
        downloadableLink.setSampleFile(rs.getString("sample_file"));
        downloadableLink.setSampleType(rs.getString("sample_type"));
        return downloadableLink;
    }

}

