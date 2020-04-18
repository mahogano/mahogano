package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CmsPage;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CmsPageMapper implements RowMapper<CmsPage> {

    @Override
    public CmsPage mapRow(ResultSet rs, int i) throws SQLException {
        CmsPage cmsPage = new CmsPage();
        cmsPage.setPageId(rs.getInt("page_id"));
        cmsPage.setTitle(rs.getString("title"));
        cmsPage.setRootTemplate(rs.getString("root_template"));
        cmsPage.setMetaKeywords(rs.getString("meta_keywords"));
        cmsPage.setMetaDescription(rs.getString("meta_description"));
        cmsPage.setIdentifier(rs.getString("identifier"));
        cmsPage.setContentHeading(rs.getString("content_heading"));
        cmsPage.setContent(rs.getString("content"));
        cmsPage.setCreationTime(rs.getTimestamp("creation_time") != null ? rs.getTimestamp("creation_time").toLocalDateTime() : null);
        cmsPage.setUpdateTime(rs.getTimestamp("update_time") != null ? rs.getTimestamp("update_time").toLocalDateTime() : null);
        cmsPage.setIsActive(rs.getInt("is_active"));
        cmsPage.setSortOrder(rs.getInt("sort_order"));
        cmsPage.setLayoutUpdateXml(rs.getString("layout_update_xml"));
        cmsPage.setCustomTheme(rs.getString("custom_theme"));
        cmsPage.setCustomRootTemplate(rs.getString("custom_root_template"));
        cmsPage.setCustomLayoutUpdateXml(rs.getString("custom_layout_update_xml"));
        cmsPage.setCustomThemeFrom(rs.getTimestamp("custom_theme_from") != null ? rs.getTimestamp("custom_theme_from").toLocalDateTime() : null);
        cmsPage.setCustomThemeTo(rs.getTimestamp("custom_theme_to") != null ? rs.getTimestamp("custom_theme_to").toLocalDateTime() : null);
        return cmsPage;
    }

}

