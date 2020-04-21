package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.PsgdprConsent;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PsgdprConsentMapper implements RowMapper<PsgdprConsent> {

    @Override
    public PsgdprConsent mapRow(ResultSet rs, int i) throws SQLException {
        PsgdprConsent psgdprConsent = new PsgdprConsent();
        psgdprConsent.setIdGdprConsent(rs.getInt("id_gdpr_consent"));
        psgdprConsent.setIdModule(rs.getInt("id_module"));
        psgdprConsent.setActive(rs.getInt("active"));
        psgdprConsent.setError(rs.getInt("error"));
        psgdprConsent.setErrorMessage(rs.getString("error_message"));
        psgdprConsent.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        psgdprConsent.setDateUpd(rs.getTimestamp("date_upd").toLocalDateTime());
        return psgdprConsent;
    }

}

