package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.LayeredPriceIndex;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LayeredPriceIndexMapper implements RowMapper<LayeredPriceIndex> {

    @Override
    public LayeredPriceIndex mapRow(ResultSet rs, int i) throws SQLException {
        LayeredPriceIndex layeredPriceIndex = new LayeredPriceIndex();
        layeredPriceIndex.setIdProduct(rs.getInt("id_product"));
        layeredPriceIndex.setIdCurrency(rs.getInt("id_currency"));
        layeredPriceIndex.setIdShop(rs.getInt("id_shop"));
        layeredPriceIndex.setPriceMin(rs.getBigDecimal("price_min"));
        layeredPriceIndex.setPriceMax(rs.getBigDecimal("price_max"));
        layeredPriceIndex.setIdCountry(rs.getInt("id_country"));
        return layeredPriceIndex;
    }

}

