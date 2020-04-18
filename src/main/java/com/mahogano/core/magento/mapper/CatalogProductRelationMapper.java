package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductRelation;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductRelationMapper implements RowMapper<CatalogProductRelation> {

    @Override
    public CatalogProductRelation mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductRelation catalogProductRelation = new CatalogProductRelation();
        catalogProductRelation.setParentId(rs.getInt("parent_id"));
        catalogProductRelation.setChildId(rs.getInt("child_id"));
        return catalogProductRelation;
    }

}

