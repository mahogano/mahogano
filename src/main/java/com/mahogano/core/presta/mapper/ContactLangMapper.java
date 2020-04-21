package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ContactLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ContactLangMapper implements RowMapper<ContactLang> {

    @Override
    public ContactLang mapRow(ResultSet rs, int i) throws SQLException {
        ContactLang contactLang = new ContactLang();
        contactLang.setIdContact(rs.getInt("id_contact"));
        contactLang.setIdLang(rs.getInt("id_lang"));
        contactLang.setName(rs.getString("name"));
        contactLang.setDescription(rs.getString("description"));
        return contactLang;
    }

}

