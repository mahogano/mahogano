package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Contact;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ContactMapper implements RowMapper<Contact> {

    @Override
    public Contact mapRow(ResultSet rs, int i) throws SQLException {
        Contact contact = new Contact();
        contact.setIdContact(rs.getInt("id_contact"));
        contact.setEmail(rs.getString("email"));
        contact.setCustomerService(rs.getInt("customer_service"));
        contact.setPosition(rs.getInt("position"));
        return contact;
    }

}

