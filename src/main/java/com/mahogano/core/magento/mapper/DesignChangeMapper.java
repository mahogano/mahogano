package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.DesignChange;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DesignChangeMapper implements RowMapper<DesignChange> {

    @Override
    public DesignChange mapRow(ResultSet rs, int i) throws SQLException {
        DesignChange designChange = new DesignChange();
        designChange.setDesignChangeId(rs.getInt("design_change_id"));
        designChange.setStoreId(rs.getInt("store_id"));
        designChange.setDesign(rs.getString("design"));
        designChange.setDateFrom(rs.getTimestamp("date_from") != null ? rs.getTimestamp("date_from").toLocalDateTime() : null);
        designChange.setDateTo(rs.getTimestamp("date_to") != null ? rs.getTimestamp("date_to").toLocalDateTime() : null);
        return designChange;
    }

}

