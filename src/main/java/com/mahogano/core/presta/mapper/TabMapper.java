package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Tab;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TabMapper implements RowMapper<Tab> {

    @Override
    public Tab mapRow(ResultSet rs, int i) throws SQLException {
        Tab tab = new Tab();
        tab.setIdTab(rs.getInt("id_tab"));
        tab.setIdParent(rs.getInt("id_parent"));
        tab.setPosition(rs.getInt("position"));
        tab.setModule(rs.getString("module"));
        tab.setClassName(rs.getString("class_name"));
        tab.setActive(rs.getInt("active"));
        tab.setHideHostMode(rs.getInt("hide_host_mode"));
        tab.setIcon(rs.getString("icon"));
        return tab;
    }

}

