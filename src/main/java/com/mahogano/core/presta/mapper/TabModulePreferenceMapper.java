package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.TabModulePreference;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TabModulePreferenceMapper implements RowMapper<TabModulePreference> {

    @Override
    public TabModulePreference mapRow(ResultSet rs, int i) throws SQLException {
        TabModulePreference tabModulePreference = new TabModulePreference();
        tabModulePreference.setIdTabModulePreference(rs.getInt("id_tab_module_preference"));
        tabModulePreference.setIdEmployee(rs.getInt("id_employee"));
        tabModulePreference.setIdTab(rs.getInt("id_tab"));
        tabModulePreference.setModule(rs.getString("module"));
        return tabModulePreference;
    }

}

