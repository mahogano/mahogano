package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Referrer;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReferrerMapper implements RowMapper<Referrer> {

    @Override
    public Referrer mapRow(ResultSet rs, int i) throws SQLException {
        Referrer referrer = new Referrer();
        referrer.setIdReferrer(rs.getInt("id_referrer"));
        referrer.setName(rs.getString("name"));
        referrer.setPasswd(rs.getString("passwd"));
        referrer.setHttpRefererRegexp(rs.getString("http_referer_regexp"));
        referrer.setHttpRefererLike(rs.getString("http_referer_like"));
        referrer.setRequestUriRegexp(rs.getString("request_uri_regexp"));
        referrer.setRequestUriLike(rs.getString("request_uri_like"));
        referrer.setHttpRefererRegexpNot(rs.getString("http_referer_regexp_not"));
        referrer.setHttpRefererLikeNot(rs.getString("http_referer_like_not"));
        referrer.setRequestUriRegexpNot(rs.getString("request_uri_regexp_not"));
        referrer.setRequestUriLikeNot(rs.getString("request_uri_like_not"));
        referrer.setBaseFee(rs.getBigDecimal("base_fee"));
        referrer.setPercentFee(rs.getBigDecimal("percent_fee"));
        referrer.setClickFee(rs.getBigDecimal("click_fee"));
        referrer.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        return referrer;
    }

}

