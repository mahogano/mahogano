package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Cms;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CmsMapper implements RowMapper<Cms> {

    @Override
    public Cms mapRow(ResultSet rs, int i) throws SQLException {
        Cms cms = new Cms();
        cms.setIdCms(rs.getInt("id_cms"));
        cms.setIdCmsCategory(rs.getInt("id_cms_category"));
        cms.setPosition(rs.getInt("position"));
        cms.setActive(rs.getInt("active"));
        cms.setIndexation(rs.getInt("indexation"));
        return cms;
    }

}

