package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.WebserviceAccount;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WebserviceAccountMapper implements RowMapper<WebserviceAccount> {

    @Override
    public WebserviceAccount mapRow(ResultSet rs, int i) throws SQLException {
        WebserviceAccount webserviceAccount = new WebserviceAccount();
        webserviceAccount.setIdWebserviceAccount(rs.getInt("id_webservice_account"));
        webserviceAccount.setKey(rs.getString("key"));
        webserviceAccount.setDescription(rs.getString("description"));
        webserviceAccount.setClassName(rs.getString("class_name"));
        webserviceAccount.setIsModule(rs.getInt("is_module"));
        webserviceAccount.setModuleName(rs.getString("module_name"));
        webserviceAccount.setActive(rs.getInt("active"));
        return webserviceAccount;
    }

}

