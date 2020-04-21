package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ProductDownload;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDownloadMapper implements RowMapper<ProductDownload> {

    @Override
    public ProductDownload mapRow(ResultSet rs, int i) throws SQLException {
        ProductDownload productDownload = new ProductDownload();
        productDownload.setIdProductDownload(rs.getInt("id_product_download"));
        productDownload.setIdProduct(rs.getInt("id_product"));
        productDownload.setDisplayFilename(rs.getString("display_filename"));
        productDownload.setFilename(rs.getString("filename"));
        productDownload.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        productDownload.setDateExpiration(rs.getTimestamp("date_expiration") != null ? rs.getTimestamp("date_expiration").toLocalDateTime() : null);
        productDownload.setNbDaysAccessible(rs.getInt("nb_days_accessible"));
        productDownload.setNbDownloadable(rs.getInt("nb_downloadable"));
        productDownload.setActive(rs.getInt("active"));
        productDownload.setIsShareable(rs.getInt("is_shareable"));
        return productDownload;
    }

}

