package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.AdminFilter;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminFilterMapper implements RowMapper<AdminFilter> {

    @Override
    public AdminFilter mapRow(ResultSet rs, int i) throws SQLException {
        AdminFilter adminFilter = new AdminFilter();
        adminFilter.setId(rs.getInt("id"));
        adminFilter.setEmployee(rs.getInt("employee"));
        adminFilter.setShop(rs.getInt("shop"));
        adminFilter.setController(rs.getString("controller"));
        adminFilter.setAction(rs.getString("action"));
        adminFilter.setFilter(rs.getString("filter"));
        adminFilter.setFilterId(rs.getString("filter_id"));
        return adminFilter;
    }

}

