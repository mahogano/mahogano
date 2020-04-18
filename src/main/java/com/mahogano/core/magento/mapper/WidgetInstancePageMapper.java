package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.WidgetInstancePage;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WidgetInstancePageMapper implements RowMapper<WidgetInstancePage> {

    @Override
    public WidgetInstancePage mapRow(ResultSet rs, int i) throws SQLException {
        WidgetInstancePage widgetInstancePage = new WidgetInstancePage();
        widgetInstancePage.setPageId(rs.getInt("page_id"));
        widgetInstancePage.setInstanceId(rs.getInt("instance_id"));
        widgetInstancePage.setPageGroup(rs.getString("page_group"));
        widgetInstancePage.setLayoutHandle(rs.getString("layout_handle"));
        widgetInstancePage.setBlockReference(rs.getString("block_reference"));
        widgetInstancePage.setPageFor(rs.getString("page_for"));
        widgetInstancePage.setEntities(rs.getString("entities"));
        widgetInstancePage.setPageTemplate(rs.getString("page_template"));
        return widgetInstancePage;
    }

}

