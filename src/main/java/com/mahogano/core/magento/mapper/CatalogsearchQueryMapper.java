package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogsearchQuery;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogsearchQueryMapper implements RowMapper<CatalogsearchQuery> {

    @Override
    public CatalogsearchQuery mapRow(ResultSet rs, int i) throws SQLException {
        CatalogsearchQuery catalogsearchQuery = new CatalogsearchQuery();
        catalogsearchQuery.setQueryId(rs.getInt("query_id"));
        catalogsearchQuery.setQueryText(rs.getString("query_text"));
        catalogsearchQuery.setNumResults(rs.getInt("num_results"));
        catalogsearchQuery.setPopularity(rs.getInt("popularity"));
        catalogsearchQuery.setRedirect(rs.getString("redirect"));
        catalogsearchQuery.setSynonymFor(rs.getString("synonym_for"));
        catalogsearchQuery.setStoreId(rs.getInt("store_id"));
        catalogsearchQuery.setDisplayInTerms(rs.getInt("display_in_terms"));
        catalogsearchQuery.setIsActive(rs.getInt("is_active"));
        catalogsearchQuery.setIsProcessed(rs.getInt("is_processed"));
        catalogsearchQuery.setUpdatedAt(rs.getTimestamp("updated_at").toLocalDateTime());
        return catalogsearchQuery;
    }

}

