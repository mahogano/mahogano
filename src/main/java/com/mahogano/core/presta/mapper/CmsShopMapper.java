package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CmsShop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CmsShopMapper implements RowMapper<CmsShop> {

    @Override
    public CmsShop mapRow(ResultSet rs, int i) throws SQLException {
        CmsShop cmsShop = new CmsShop();
        cmsShop.setIdCms(rs.getInt("id_cms"));
        cmsShop.setIdShop(rs.getInt("id_shop"));
        return cmsShop;
    }

}

