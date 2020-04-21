package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Pack;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PackMapper implements RowMapper<Pack> {

    @Override
    public Pack mapRow(ResultSet rs, int i) throws SQLException {
        Pack pack = new Pack();
        pack.setIdProductPack(rs.getInt("id_product_pack"));
        pack.setIdProductItem(rs.getInt("id_product_item"));
        pack.setIdProductAttributeItem(rs.getInt("id_product_attribute_item"));
        pack.setQuantity(rs.getInt("quantity"));
        return pack;
    }

}

