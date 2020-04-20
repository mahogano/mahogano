package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.WebservicePermission;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WebservicePermissionMapper implements RowMapper<WebservicePermission> {

    @Override
    public WebservicePermission mapRow(ResultSet rs, int i) throws SQLException {
        WebservicePermission webservicePermission = new WebservicePermission();
        webservicePermission.setIdWebservicePermission(rs.getInt("id_webservice_permission"));
        webservicePermission.setResource(rs.getString("resource"));
        webservicePermission.setMethod(rs.getString("method"));
        webservicePermission.setIdWebserviceAccount(rs.getInt("id_webservice_account"));
        return webservicePermission;
    }

}

