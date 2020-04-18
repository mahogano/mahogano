package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductEntityText;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductEntityTextMapper implements RowMapper<CatalogProductEntityText> {

    @Override
    public CatalogProductEntityText mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductEntityText catalogProductEntityText = new CatalogProductEntityText();
        catalogProductEntityText.setValueId(rs.getInt("value_id"));
        catalogProductEntityText.setEntityTypeId(rs.getInt("entity_type_id"));
        catalogProductEntityText.setAttributeId(rs.getInt("attribute_id"));
        catalogProductEntityText.setStoreId(rs.getInt("store_id"));
        catalogProductEntityText.setEntityId(rs.getInt("entity_id"));
        catalogProductEntityText.setValue(rs.getString("value"));
        return catalogProductEntityText;
    }

}

