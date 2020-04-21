package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ConfigurationLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConfigurationLangMapper implements RowMapper<ConfigurationLang> {

    @Override
    public ConfigurationLang mapRow(ResultSet rs, int i) throws SQLException {
        ConfigurationLang configurationLang = new ConfigurationLang();
        configurationLang.setIdConfiguration(rs.getInt("id_configuration"));
        configurationLang.setIdLang(rs.getInt("id_lang"));
        configurationLang.setValue(rs.getString("value"));
        configurationLang.setDateUpd(rs.getTimestamp("date_upd") != null ? rs.getTimestamp("date_upd").toLocalDateTime() : null);
        return configurationLang;
    }

}

