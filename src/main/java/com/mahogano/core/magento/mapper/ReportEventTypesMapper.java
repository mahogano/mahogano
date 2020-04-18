package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.ReportEventTypes;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReportEventTypesMapper implements RowMapper<ReportEventTypes> {

    @Override
    public ReportEventTypes mapRow(ResultSet rs, int i) throws SQLException {
        ReportEventTypes reportEventTypes = new ReportEventTypes();
        reportEventTypes.setEventTypeId(rs.getInt("event_type_id"));
        reportEventTypes.setEventName(rs.getString("event_name"));
        reportEventTypes.setCustomerLogin(rs.getInt("customer_login"));
        return reportEventTypes;
    }

}

