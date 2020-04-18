package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.Widget;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WidgetMapper implements RowMapper<Widget> {

    @Override
    public Widget mapRow(ResultSet rs, int i) throws SQLException {
        Widget widget = new Widget();
        widget.setWidgetId(rs.getInt("widget_id"));
        widget.setWidgetCode(rs.getString("widget_code"));
        widget.setWidgetType(rs.getString("widget_type"));
        widget.setParameters(rs.getString("parameters"));
        return widget;
    }

}

