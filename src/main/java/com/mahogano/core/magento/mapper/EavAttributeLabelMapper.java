package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.EavAttributeLabel;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EavAttributeLabelMapper implements RowMapper<EavAttributeLabel> {

    @Override
    public EavAttributeLabel mapRow(ResultSet rs, int i) throws SQLException {
        EavAttributeLabel eavAttributeLabel = new EavAttributeLabel();
        eavAttributeLabel.setAttributeLabelId(rs.getInt("attribute_label_id"));
        eavAttributeLabel.setAttributeId(rs.getInt("attribute_id"));
        eavAttributeLabel.setStoreId(rs.getInt("store_id"));
        eavAttributeLabel.setValue(rs.getString("value"));
        return eavAttributeLabel;
    }

}

