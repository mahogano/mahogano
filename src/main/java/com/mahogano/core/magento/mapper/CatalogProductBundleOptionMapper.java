package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductBundleOption;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductBundleOptionMapper implements RowMapper<CatalogProductBundleOption> {

    @Override
    public CatalogProductBundleOption mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductBundleOption catalogProductBundleOption = new CatalogProductBundleOption();
        catalogProductBundleOption.setOptionId(rs.getInt("option_id"));
        catalogProductBundleOption.setParentId(rs.getInt("parent_id"));
        catalogProductBundleOption.setRequired(rs.getInt("required"));
        catalogProductBundleOption.setPosition(rs.getInt("position"));
        catalogProductBundleOption.setType(rs.getString("type"));
        return catalogProductBundleOption;
    }

}

