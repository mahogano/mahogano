package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CmsRoleLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CmsRoleLangMapper implements RowMapper<CmsRoleLang> {

    @Override
    public CmsRoleLang mapRow(ResultSet rs, int i) throws SQLException {
        CmsRoleLang cmsRoleLang = new CmsRoleLang();
        cmsRoleLang.setIdCmsRole(rs.getInt("id_cms_role"));
        cmsRoleLang.setIdLang(rs.getInt("id_lang"));
        cmsRoleLang.setIdShop(rs.getInt("id_shop"));
        cmsRoleLang.setName(rs.getString("name"));
        return cmsRoleLang;
    }

}

