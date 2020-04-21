package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.PsgdprLog;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PsgdprLogMapper implements RowMapper<PsgdprLog> {

    @Override
    public PsgdprLog mapRow(ResultSet rs, int i) throws SQLException {
        PsgdprLog psgdprLog = new PsgdprLog();
        psgdprLog.setIdGdprLog(rs.getInt("id_gdpr_log"));
        psgdprLog.setIdCustomer(rs.getInt("id_customer"));
        psgdprLog.setIdGuest(rs.getInt("id_guest"));
        psgdprLog.setClientName(rs.getString("client_name"));
        psgdprLog.setIdModule(rs.getInt("id_module"));
        psgdprLog.setRequestType(rs.getInt("request_type"));
        psgdprLog.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        psgdprLog.setDateUpd(rs.getTimestamp("date_upd").toLocalDateTime());
        return psgdprLog;
    }

}

