package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ConfigurationKpi;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConfigurationKpiMapper implements RowMapper<ConfigurationKpi> {

    @Override
    public ConfigurationKpi mapRow(ResultSet rs, int i) throws SQLException {
        ConfigurationKpi configurationKpi = new ConfigurationKpi();
        configurationKpi.setIdConfigurationKpi(rs.getInt("id_configuration_kpi"));
        configurationKpi.setIdShopGroup(rs.getInt("id_shop_group"));
        configurationKpi.setIdShop(rs.getInt("id_shop"));
        configurationKpi.setName(rs.getString("name"));
        configurationKpi.setValue(rs.getString("value"));
        configurationKpi.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        configurationKpi.setDateUpd(rs.getTimestamp("date_upd").toLocalDateTime());
        return configurationKpi;
    }

}

