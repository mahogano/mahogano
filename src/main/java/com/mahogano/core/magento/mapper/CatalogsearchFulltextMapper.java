package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogsearchFulltext;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogsearchFulltextMapper implements RowMapper<CatalogsearchFulltext> {

    @Override
    public CatalogsearchFulltext mapRow(ResultSet rs, int i) throws SQLException {
        CatalogsearchFulltext catalogsearchFulltext = new CatalogsearchFulltext();
        catalogsearchFulltext.setFulltextId(rs.getInt("fulltext_id"));
        catalogsearchFulltext.setProductId(rs.getInt("product_id"));
        catalogsearchFulltext.setStoreId(rs.getInt("store_id"));
        catalogsearchFulltext.setDataIndex(rs.getString("data_index"));
        return catalogsearchFulltext;
    }

}

