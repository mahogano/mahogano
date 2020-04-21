package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ProductGroupReductionCache;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductGroupReductionCacheMapper implements RowMapper<ProductGroupReductionCache> {

    @Override
    public ProductGroupReductionCache mapRow(ResultSet rs, int i) throws SQLException {
        ProductGroupReductionCache productGroupReductionCache = new ProductGroupReductionCache();
        productGroupReductionCache.setIdProduct(rs.getInt("id_product"));
        productGroupReductionCache.setIdGroup(rs.getInt("id_group"));
        productGroupReductionCache.setReduction(rs.getBigDecimal("reduction"));
        return productGroupReductionCache;
    }

}

