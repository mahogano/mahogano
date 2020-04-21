package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.WebBrowser;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WebBrowserMapper implements RowMapper<WebBrowser> {

    @Override
    public WebBrowser mapRow(ResultSet rs, int i) throws SQLException {
        WebBrowser webBrowser = new WebBrowser();
        webBrowser.setIdWebBrowser(rs.getInt("id_web_browser"));
        webBrowser.setName(rs.getString("name"));
        return webBrowser;
    }

}

