package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Emailsubscription;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmailsubscriptionMapper implements RowMapper<Emailsubscription> {

    @Override
    public Emailsubscription mapRow(ResultSet rs, int i) throws SQLException {
        Emailsubscription emailsubscription = new Emailsubscription();
        emailsubscription.setId(rs.getInt("id"));
        emailsubscription.setIdShop(rs.getInt("id_shop"));
        emailsubscription.setIdShopGroup(rs.getInt("id_shop_group"));
        emailsubscription.setEmail(rs.getString("email"));
        emailsubscription.setNewsletterDateAdd(rs.getTimestamp("newsletter_date_add") != null ? rs.getTimestamp("newsletter_date_add").toLocalDateTime() : null);
        emailsubscription.setIpRegistrationNewsletter(rs.getString("ip_registration_newsletter"));
        emailsubscription.setHttpReferer(rs.getString("http_referer"));
        emailsubscription.setActive(rs.getInt("active"));
        return emailsubscription;
    }

}

