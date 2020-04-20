package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.QuickAccess;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QuickAccessMapper implements RowMapper<QuickAccess> {

    @Override
    public QuickAccess mapRow(ResultSet rs, int i) throws SQLException {
        QuickAccess quickAccess = new QuickAccess();
        quickAccess.setIdQuickAccess(rs.getInt("id_quick_access"));
        quickAccess.setNewWindow(rs.getInt("new_window"));
        quickAccess.setLink(rs.getString("link"));
        return quickAccess;
    }

}

