package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CmsRole;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CmsRoleMapper implements RowMapper<CmsRole> {

    @Override
    public CmsRole mapRow(ResultSet rs, int i) throws SQLException {
        CmsRole cmsRole = new CmsRole();
        cmsRole.setIdCmsRole(rs.getInt("id_cms_role"));
        cmsRole.setName(rs.getString("name"));
        cmsRole.setIdCms(rs.getInt("id_cms"));
        return cmsRole;
    }

}

