package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.WidgetInstancePageLayout;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WidgetInstancePageLayoutMapper implements RowMapper<WidgetInstancePageLayout> {

    @Override
    public WidgetInstancePageLayout mapRow(ResultSet rs, int i) throws SQLException {
        WidgetInstancePageLayout widgetInstancePageLayout = new WidgetInstancePageLayout();
        widgetInstancePageLayout.setPageId(rs.getInt("page_id"));
        widgetInstancePageLayout.setLayoutUpdateId(rs.getInt("layout_update_id"));
        return widgetInstancePageLayout;
    }

}

