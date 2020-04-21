package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Configuration;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConfigurationMapper implements RowMapper<Configuration> {

    @Override
    public Configuration mapRow(ResultSet rs, int i) throws SQLException {
        Configuration configuration = new Configuration();
        configuration.setIdConfiguration(rs.getInt("id_configuration"));
        configuration.setIdShopGroup(rs.getInt("id_shop_group"));
        configuration.setIdShop(rs.getInt("id_shop"));
        configuration.setName(rs.getString("name"));
        configuration.setValue(rs.getString("value"));
        configuration.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        configuration.setDateUpd(rs.getTimestamp("date_upd").toLocalDateTime());
        return configuration;
    }

}

