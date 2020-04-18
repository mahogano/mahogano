package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductLinkType;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductLinkTypeMapper implements RowMapper<CatalogProductLinkType> {

    @Override
    public CatalogProductLinkType mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductLinkType catalogProductLinkType = new CatalogProductLinkType();
        catalogProductLinkType.setLinkTypeId(rs.getInt("link_type_id"));
        catalogProductLinkType.setCode(rs.getString("code"));
        return catalogProductLinkType;
    }

}

