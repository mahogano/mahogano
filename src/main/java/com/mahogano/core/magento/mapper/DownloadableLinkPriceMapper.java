package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.DownloadableLinkPrice;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DownloadableLinkPriceMapper implements RowMapper<DownloadableLinkPrice> {

    @Override
    public DownloadableLinkPrice mapRow(ResultSet rs, int i) throws SQLException {
        DownloadableLinkPrice downloadableLinkPrice = new DownloadableLinkPrice();
        downloadableLinkPrice.setPriceId(rs.getInt("price_id"));
        downloadableLinkPrice.setLinkId(rs.getInt("link_id"));
        downloadableLinkPrice.setWebsiteId(rs.getInt("website_id"));
        downloadableLinkPrice.setPrice(rs.getBigDecimal("price"));
        return downloadableLinkPrice;
    }

}

