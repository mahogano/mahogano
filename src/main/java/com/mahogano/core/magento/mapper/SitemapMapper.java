package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.Sitemap;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SitemapMapper implements RowMapper<Sitemap> {

    @Override
    public Sitemap mapRow(ResultSet rs, int i) throws SQLException {
        Sitemap sitemap = new Sitemap();
        sitemap.setSitemapId(rs.getInt("sitemap_id"));
        sitemap.setSitemapType(rs.getString("sitemap_type"));
        sitemap.setSitemapFilename(rs.getString("sitemap_filename"));
        sitemap.setSitemapPath(rs.getString("sitemap_path"));
        sitemap.setSitemapTime(rs.getTimestamp("sitemap_time") != null ? rs.getTimestamp("sitemap_time").toLocalDateTime() : null);
        sitemap.setStoreId(rs.getInt("store_id"));
        return sitemap;
    }

}

