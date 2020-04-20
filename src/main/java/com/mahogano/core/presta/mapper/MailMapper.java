package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Mail;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MailMapper implements RowMapper<Mail> {

    @Override
    public Mail mapRow(ResultSet rs, int i) throws SQLException {
        Mail mail = new Mail();
        mail.setIdMail(rs.getInt("id_mail"));
        mail.setRecipient(rs.getString("recipient"));
        mail.setTemplate(rs.getString("template"));
        mail.setSubject(rs.getString("subject"));
        mail.setIdLang(rs.getInt("id_lang"));
        mail.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        return mail;
    }

}

