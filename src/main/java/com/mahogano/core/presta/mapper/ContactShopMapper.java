package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ContactShop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ContactShopMapper implements RowMapper<ContactShop> {

    @Override
    public ContactShop mapRow(ResultSet rs, int i) throws SQLException {
        ContactShop contactShop = new ContactShop();
        contactShop.setIdContact(rs.getInt("id_contact"));
        contactShop.setIdShop(rs.getInt("id_shop"));
        return contactShop;
    }

}

