package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.HookModuleExceptions;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HookModuleExceptionsMapper implements RowMapper<HookModuleExceptions> {

    @Override
    public HookModuleExceptions mapRow(ResultSet rs, int i) throws SQLException {
        HookModuleExceptions hookModuleExceptions = new HookModuleExceptions();
        hookModuleExceptions.setIdHookModuleExceptions(rs.getInt("id_hook_module_exceptions"));
        hookModuleExceptions.setIdShop(rs.getInt("id_shop"));
        hookModuleExceptions.setIdModule(rs.getInt("id_module"));
        hookModuleExceptions.setIdHook(rs.getInt("id_hook"));
        hookModuleExceptions.setFileName(rs.getString("file_name"));
        return hookModuleExceptions;
    }

}

