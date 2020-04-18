package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductOption;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductOptionMapper implements RowMapper<CatalogProductOption> {

    @Override
    public CatalogProductOption mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductOption catalogProductOption = new CatalogProductOption();
        catalogProductOption.setOptionId(rs.getInt("option_id"));
        catalogProductOption.setProductId(rs.getInt("product_id"));
        catalogProductOption.setType(rs.getString("type"));
        catalogProductOption.setIsRequire(rs.getInt("is_require"));
        catalogProductOption.setSku(rs.getString("sku"));
        catalogProductOption.setMaxCharacters(rs.getInt("max_characters"));
        catalogProductOption.setFileExtension(rs.getString("file_extension"));
        catalogProductOption.setImageSizeX(rs.getInt("image_size_x"));
        catalogProductOption.setImageSizeY(rs.getInt("image_size_y"));
        catalogProductOption.setSortOrder(rs.getInt("sort_order"));
        return catalogProductOption;
    }

}

