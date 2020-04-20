package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.WebserviceAccountShop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WebserviceAccountShopMapper implements RowMapper<WebserviceAccountShop> {

    @Override
    public WebserviceAccountShop mapRow(ResultSet rs, int i) throws SQLException {
        WebserviceAccountShop webserviceAccountShop = new WebserviceAccountShop();
        webserviceAccountShop.setIdWebserviceAccount(rs.getInt("id_webservice_account"));
        webserviceAccountShop.setIdShop(rs.getInt("id_shop"));
        return webserviceAccountShop;
    }

}

