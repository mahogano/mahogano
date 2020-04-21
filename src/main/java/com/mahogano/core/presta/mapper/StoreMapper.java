package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Store;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StoreMapper implements RowMapper<Store> {

    @Override
    public Store mapRow(ResultSet rs, int i) throws SQLException {
        Store store = new Store();
        store.setIdStore(rs.getInt("id_store"));
        store.setIdCountry(rs.getInt("id_country"));
        store.setIdState(rs.getInt("id_state"));
        store.setCity(rs.getString("city"));
        store.setPostcode(rs.getString("postcode"));
        store.setLatitude(rs.getBigDecimal("latitude"));
        store.setLongitude(rs.getBigDecimal("longitude"));
        store.setPhone(rs.getString("phone"));
        store.setFax(rs.getString("fax"));
        store.setEmail(rs.getString("email"));
        store.setActive(rs.getInt("active"));
        store.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        store.setDateUpd(rs.getTimestamp("date_upd").toLocalDateTime());
        return store;
    }

}

