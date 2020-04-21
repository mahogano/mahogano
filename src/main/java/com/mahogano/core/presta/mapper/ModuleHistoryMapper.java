package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ModuleHistory;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ModuleHistoryMapper implements RowMapper<ModuleHistory> {

    @Override
    public ModuleHistory mapRow(ResultSet rs, int i) throws SQLException {
        ModuleHistory moduleHistory = new ModuleHistory();
        moduleHistory.setId(rs.getInt("id"));
        moduleHistory.setIdEmployee(rs.getInt("id_employee"));
        moduleHistory.setIdModule(rs.getInt("id_module"));
        moduleHistory.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        moduleHistory.setDateUpd(rs.getTimestamp("date_upd").toLocalDateTime());
        return moduleHistory;
    }

}

