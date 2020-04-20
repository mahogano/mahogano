package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Address;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddressMapper implements RowMapper<Address> {

    @Override
    public Address mapRow(ResultSet rs, int i) throws SQLException {
        Address address = new Address();
        address.setIdAddress(rs.getInt("id_address"));
        address.setIdCountry(rs.getInt("id_country"));
        address.setIdState(rs.getInt("id_state"));
        address.setIdCustomer(rs.getInt("id_customer"));
        address.setIdManufacturer(rs.getInt("id_manufacturer"));
        address.setIdSupplier(rs.getInt("id_supplier"));
        address.setIdWarehouse(rs.getInt("id_warehouse"));
        address.setAlias(rs.getString("alias"));
        address.setCompany(rs.getString("company"));
        address.setLastname(rs.getString("lastname"));
        address.setFirstname(rs.getString("firstname"));
        address.setAddress1(rs.getString("address1"));
        address.setAddress2(rs.getString("address2"));
        address.setPostcode(rs.getString("postcode"));
        address.setCity(rs.getString("city"));
        address.setOther(rs.getString("other"));
        address.setPhone(rs.getString("phone"));
        address.setPhoneMobile(rs.getString("phone_mobile"));
        address.setVatNumber(rs.getString("vat_number"));
        address.setDni(rs.getString("dni"));
        address.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        address.setDateUpd(rs.getTimestamp("date_upd").toLocalDateTime());
        address.setActive(rs.getInt("active"));
        address.setDeleted(rs.getInt("deleted"));
        return address;
    }

}

