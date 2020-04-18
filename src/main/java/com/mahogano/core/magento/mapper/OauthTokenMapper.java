package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.OauthToken;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OauthTokenMapper implements RowMapper<OauthToken> {

    @Override
    public OauthToken mapRow(ResultSet rs, int i) throws SQLException {
        OauthToken oauthToken = new OauthToken();
        oauthToken.setEntityId(rs.getInt("entity_id"));
        oauthToken.setConsumerId(rs.getInt("consumer_id"));
        oauthToken.setAdminId(rs.getInt("admin_id"));
        oauthToken.setCustomerId(rs.getInt("customer_id"));
        oauthToken.setType(rs.getString("type"));
        oauthToken.setToken(rs.getString("token"));
        oauthToken.setSecret(rs.getString("secret"));
        oauthToken.setVerifier(rs.getString("verifier"));
        oauthToken.setCallbackUrl(rs.getString("callback_url"));
        oauthToken.setRevoked(rs.getInt("revoked"));
        oauthToken.setAuthorized(rs.getInt("authorized"));
        oauthToken.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        return oauthToken;
    }

}

