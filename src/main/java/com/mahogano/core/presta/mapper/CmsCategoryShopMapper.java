package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CmsCategoryShop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CmsCategoryShopMapper implements RowMapper<CmsCategoryShop> {

    @Override
    public CmsCategoryShop mapRow(ResultSet rs, int i) throws SQLException {
        CmsCategoryShop cmsCategoryShop = new CmsCategoryShop();
        cmsCategoryShop.setIdCmsCategory(rs.getInt("id_cms_category"));
        cmsCategoryShop.setIdShop(rs.getInt("id_shop"));
        return cmsCategoryShop;
    }

}

