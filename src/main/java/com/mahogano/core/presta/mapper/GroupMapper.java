package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Group;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GroupMapper implements RowMapper<Group> {

    @Override
    public Group mapRow(ResultSet rs, int i) throws SQLException {
        Group group = new Group();
        group.setIdGroup(rs.getInt("id_group"));
        group.setReduction(rs.getBigDecimal("reduction"));
        group.setPriceDisplayMethod(rs.getInt("price_display_method"));
        group.setShowPrices(rs.getInt("show_prices"));
        group.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        group.setDateUpd(rs.getTimestamp("date_upd").toLocalDateTime());
        return group;
    }

}

