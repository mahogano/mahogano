package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.DownloadableSampleTitle;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DownloadableSampleTitleMapper implements RowMapper<DownloadableSampleTitle> {

    @Override
    public DownloadableSampleTitle mapRow(ResultSet rs, int i) throws SQLException {
        DownloadableSampleTitle downloadableSampleTitle = new DownloadableSampleTitle();
        downloadableSampleTitle.setTitleId(rs.getInt("title_id"));
        downloadableSampleTitle.setSampleId(rs.getInt("sample_id"));
        downloadableSampleTitle.setStoreId(rs.getInt("store_id"));
        downloadableSampleTitle.setTitle(rs.getString("title"));
        return downloadableSampleTitle;
    }

}

