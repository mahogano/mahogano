package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.ShippingTablerate;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShippingTablerateMapper implements RowMapper<ShippingTablerate> {

    @Override
    public ShippingTablerate mapRow(ResultSet rs, int i) throws SQLException {
        ShippingTablerate shippingTablerate = new ShippingTablerate();
        shippingTablerate.setPk(rs.getInt("pk"));
        shippingTablerate.setWebsiteId(rs.getInt("website_id"));
        shippingTablerate.setDestCountryId(rs.getString("dest_country_id"));
        shippingTablerate.setDestRegionId(rs.getInt("dest_region_id"));
        shippingTablerate.setDestZip(rs.getString("dest_zip"));
        shippingTablerate.setConditionName(rs.getString("condition_name"));
        shippingTablerate.setConditionValue(rs.getBigDecimal("condition_value"));
        shippingTablerate.setPrice(rs.getBigDecimal("price"));
        shippingTablerate.setCost(rs.getBigDecimal("cost"));
        return shippingTablerate;
    }

}

