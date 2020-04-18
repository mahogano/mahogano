package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesFlatQuoteShippingRate;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesFlatQuoteShippingRateMapper implements RowMapper<SalesFlatQuoteShippingRate> {

    @Override
    public SalesFlatQuoteShippingRate mapRow(ResultSet rs, int i) throws SQLException {
        SalesFlatQuoteShippingRate salesFlatQuoteShippingRate = new SalesFlatQuoteShippingRate();
        salesFlatQuoteShippingRate.setRateId(rs.getInt("rate_id"));
        salesFlatQuoteShippingRate.setAddressId(rs.getInt("address_id"));
        salesFlatQuoteShippingRate.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        salesFlatQuoteShippingRate.setUpdatedAt(rs.getTimestamp("updated_at").toLocalDateTime());
        salesFlatQuoteShippingRate.setCarrier(rs.getString("carrier"));
        salesFlatQuoteShippingRate.setCarrierTitle(rs.getString("carrier_title"));
        salesFlatQuoteShippingRate.setCode(rs.getString("code"));
        salesFlatQuoteShippingRate.setMethod(rs.getString("method"));
        salesFlatQuoteShippingRate.setMethodDescription(rs.getString("method_description"));
        salesFlatQuoteShippingRate.setPrice(rs.getBigDecimal("price"));
        salesFlatQuoteShippingRate.setErrorMessage(rs.getString("error_message"));
        salesFlatQuoteShippingRate.setMethodTitle(rs.getString("method_title"));
        return salesFlatQuoteShippingRate;
    }

}

