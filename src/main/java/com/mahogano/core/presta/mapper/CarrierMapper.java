package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Carrier;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarrierMapper implements RowMapper<Carrier> {

    @Override
    public Carrier mapRow(ResultSet rs, int i) throws SQLException {
        Carrier carrier = new Carrier();
        carrier.setIdCarrier(rs.getInt("id_carrier"));
        carrier.setIdReference(rs.getInt("id_reference"));
        carrier.setIdTaxRulesGroup(rs.getInt("id_tax_rules_group"));
        carrier.setName(rs.getString("name"));
        carrier.setUrl(rs.getString("url"));
        carrier.setActive(rs.getInt("active"));
        carrier.setDeleted(rs.getInt("deleted"));
        carrier.setShippingHandling(rs.getInt("shipping_handling"));
        carrier.setRangeBehavior(rs.getInt("range_behavior"));
        carrier.setIsModule(rs.getInt("is_module"));
        carrier.setIsFree(rs.getInt("is_free"));
        carrier.setShippingExternal(rs.getInt("shipping_external"));
        carrier.setNeedRange(rs.getInt("need_range"));
        carrier.setExternalModuleName(rs.getString("external_module_name"));
        carrier.setShippingMethod(rs.getInt("shipping_method"));
        carrier.setPosition(rs.getInt("position"));
        carrier.setMaxWidth(rs.getInt("max_width"));
        carrier.setMaxHeight(rs.getInt("max_height"));
        carrier.setMaxDepth(rs.getInt("max_depth"));
        carrier.setMaxWeight(rs.getBigDecimal("max_weight"));
        carrier.setGrade(rs.getInt("grade"));
        return carrier;
    }

}

