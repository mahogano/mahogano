package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.WeeeDiscount;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WeeeDiscountMapper implements RowMapper<WeeeDiscount> {

    @Override
    public WeeeDiscount mapRow(ResultSet rs, int i) throws SQLException {
        WeeeDiscount weeeDiscount = new WeeeDiscount();
        weeeDiscount.setEntityId(rs.getInt("entity_id"));
        weeeDiscount.setWebsiteId(rs.getInt("website_id"));
        weeeDiscount.setCustomerGroupId(rs.getInt("customer_group_id"));
        weeeDiscount.setValue(rs.getBigDecimal("value"));
        return weeeDiscount;
    }

}

