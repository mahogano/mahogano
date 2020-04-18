package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogruleAffectedProduct;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogruleAffectedProductMapper implements RowMapper<CatalogruleAffectedProduct> {

    @Override
    public CatalogruleAffectedProduct mapRow(ResultSet rs, int i) throws SQLException {
        CatalogruleAffectedProduct catalogruleAffectedProduct = new CatalogruleAffectedProduct();
        catalogruleAffectedProduct.setProductId(rs.getInt("product_id"));
        return catalogruleAffectedProduct;
    }

}

