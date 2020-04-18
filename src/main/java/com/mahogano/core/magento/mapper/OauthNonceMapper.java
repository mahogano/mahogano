package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.OauthNonce;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OauthNonceMapper implements RowMapper<OauthNonce> {

    @Override
    public OauthNonce mapRow(ResultSet rs, int i) throws SQLException {
        OauthNonce oauthNonce = new OauthNonce();
        oauthNonce.setNonce(rs.getString("nonce"));
        oauthNonce.setTimestamp(rs.getInt("timestamp"));
        return oauthNonce;
    }

}

