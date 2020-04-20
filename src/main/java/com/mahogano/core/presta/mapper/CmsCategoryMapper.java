package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CmsCategory;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CmsCategoryMapper implements RowMapper<CmsCategory> {

    @Override
    public CmsCategory mapRow(ResultSet rs, int i) throws SQLException {
        CmsCategory cmsCategory = new CmsCategory();
        cmsCategory.setIdCmsCategory(rs.getInt("id_cms_category"));
        cmsCategory.setIdParent(rs.getInt("id_parent"));
        cmsCategory.setLevelDepth(rs.getInt("level_depth"));
        cmsCategory.setActive(rs.getInt("active"));
        cmsCategory.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        cmsCategory.setDateUpd(rs.getTimestamp("date_upd").toLocalDateTime());
        cmsCategory.setPosition(rs.getInt("position"));
        return cmsCategory;
    }

}

