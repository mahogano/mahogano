package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.PsgdprConsentLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PsgdprConsentLangMapper implements RowMapper<PsgdprConsentLang> {

    @Override
    public PsgdprConsentLang mapRow(ResultSet rs, int i) throws SQLException {
        PsgdprConsentLang psgdprConsentLang = new PsgdprConsentLang();
        psgdprConsentLang.setIdGdprConsent(rs.getInt("id_gdpr_consent"));
        psgdprConsentLang.setIdLang(rs.getInt("id_lang"));
        psgdprConsentLang.setMessage(rs.getString("message"));
        psgdprConsentLang.setIdShop(rs.getInt("id_shop"));
        return psgdprConsentLang;
    }

}

