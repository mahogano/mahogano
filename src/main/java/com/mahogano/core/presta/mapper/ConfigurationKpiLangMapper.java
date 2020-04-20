package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ConfigurationKpiLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConfigurationKpiLangMapper implements RowMapper<ConfigurationKpiLang> {

    @Override
    public ConfigurationKpiLang mapRow(ResultSet rs, int i) throws SQLException {
        ConfigurationKpiLang configurationKpiLang = new ConfigurationKpiLang();
        configurationKpiLang.setIdConfigurationKpi(rs.getInt("id_configuration_kpi"));
        configurationKpiLang.setIdLang(rs.getInt("id_lang"));
        configurationKpiLang.setValue(rs.getString("value"));
        configurationKpiLang.setDateUpd(rs.getTimestamp("date_upd") != null ? rs.getTimestamp("date_upd").toLocalDateTime() : null);
        return configurationKpiLang;
    }

}

