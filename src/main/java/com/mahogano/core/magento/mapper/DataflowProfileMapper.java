package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.DataflowProfile;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataflowProfileMapper implements RowMapper<DataflowProfile> {

    @Override
    public DataflowProfile mapRow(ResultSet rs, int i) throws SQLException {
        DataflowProfile dataflowProfile = new DataflowProfile();
        dataflowProfile.setProfileId(rs.getInt("profile_id"));
        dataflowProfile.setName(rs.getString("name"));
        dataflowProfile.setCreatedAt(rs.getTimestamp("created_at") != null ? rs.getTimestamp("created_at").toLocalDateTime() : null);
        dataflowProfile.setUpdatedAt(rs.getTimestamp("updated_at") != null ? rs.getTimestamp("updated_at").toLocalDateTime() : null);
        dataflowProfile.setActionsXml(rs.getString("actions_xml"));
        dataflowProfile.setGuiData(rs.getString("gui_data"));
        dataflowProfile.setDirection(rs.getString("direction"));
        dataflowProfile.setEntityType(rs.getString("entity_type"));
        dataflowProfile.setStoreId(rs.getInt("store_id"));
        dataflowProfile.setDataTransfer(rs.getString("data_transfer"));
        return dataflowProfile;
    }

}

