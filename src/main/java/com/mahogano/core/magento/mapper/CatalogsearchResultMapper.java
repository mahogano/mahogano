package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogsearchResult;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogsearchResultMapper implements RowMapper<CatalogsearchResult> {

    @Override
    public CatalogsearchResult mapRow(ResultSet rs, int i) throws SQLException {
        CatalogsearchResult catalogsearchResult = new CatalogsearchResult();
        catalogsearchResult.setQueryId(rs.getInt("query_id"));
        catalogsearchResult.setProductId(rs.getInt("product_id"));
        catalogsearchResult.setRelevance(rs.getBigDecimal("relevance"));
        return catalogsearchResult;
    }

}

