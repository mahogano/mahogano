package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.WidgetInstance;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WidgetInstanceMapper implements RowMapper<WidgetInstance> {

    @Override
    public WidgetInstance mapRow(ResultSet rs, int i) throws SQLException {
        WidgetInstance widgetInstance = new WidgetInstance();
        widgetInstance.setInstanceId(rs.getInt("instance_id"));
        widgetInstance.setInstanceType(rs.getString("instance_type"));
        widgetInstance.setPackageTheme(rs.getString("package_theme"));
        widgetInstance.setTitle(rs.getString("title"));
        widgetInstance.setStoreIds(rs.getString("store_ids"));
        widgetInstance.setWidgetParameters(rs.getString("widget_parameters"));
        widgetInstance.setSortOrder(rs.getInt("sort_order"));
        return widgetInstance;
    }

}

