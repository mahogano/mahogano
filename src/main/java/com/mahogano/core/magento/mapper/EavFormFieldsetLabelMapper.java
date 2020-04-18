package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.EavFormFieldsetLabel;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EavFormFieldsetLabelMapper implements RowMapper<EavFormFieldsetLabel> {

    @Override
    public EavFormFieldsetLabel mapRow(ResultSet rs, int i) throws SQLException {
        EavFormFieldsetLabel eavFormFieldsetLabel = new EavFormFieldsetLabel();
        eavFormFieldsetLabel.setFieldsetId(rs.getInt("fieldset_id"));
        eavFormFieldsetLabel.setStoreId(rs.getInt("store_id"));
        eavFormFieldsetLabel.setLabel(rs.getString("label"));
        return eavFormFieldsetLabel;
    }

}

