package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.DownloadableSample;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DownloadableSampleMapper implements RowMapper<DownloadableSample> {

    @Override
    public DownloadableSample mapRow(ResultSet rs, int i) throws SQLException {
        DownloadableSample downloadableSample = new DownloadableSample();
        downloadableSample.setSampleId(rs.getInt("sample_id"));
        downloadableSample.setProductId(rs.getInt("product_id"));
        downloadableSample.setSampleUrl(rs.getString("sample_url"));
        downloadableSample.setSampleFile(rs.getString("sample_file"));
        downloadableSample.setSampleType(rs.getString("sample_type"));
        downloadableSample.setSortOrder(rs.getInt("sort_order"));
        return downloadableSample;
    }

}

