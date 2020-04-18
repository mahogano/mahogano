package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesFlatShipment;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesFlatShipmentMapper implements RowMapper<SalesFlatShipment> {

    @Override
    public SalesFlatShipment mapRow(ResultSet rs, int i) throws SQLException {
        SalesFlatShipment salesFlatShipment = new SalesFlatShipment();
        salesFlatShipment.setEntityId(rs.getInt("entity_id"));
        salesFlatShipment.setStoreId(rs.getInt("store_id"));
        salesFlatShipment.setTotalWeight(rs.getBigDecimal("total_weight"));
        salesFlatShipment.setTotalQty(rs.getBigDecimal("total_qty"));
        salesFlatShipment.setEmailSent(rs.getInt("email_sent"));
        salesFlatShipment.setOrderId(rs.getInt("order_id"));
        salesFlatShipment.setCustomerId(rs.getInt("customer_id"));
        salesFlatShipment.setShippingAddressId(rs.getInt("shipping_address_id"));
        salesFlatShipment.setBillingAddressId(rs.getInt("billing_address_id"));
        salesFlatShipment.setShipmentStatus(rs.getInt("shipment_status"));
        salesFlatShipment.setIncrementId(rs.getString("increment_id"));
        salesFlatShipment.setCreatedAt(rs.getTimestamp("created_at") != null ? rs.getTimestamp("created_at").toLocalDateTime() : null);
        salesFlatShipment.setUpdatedAt(rs.getTimestamp("updated_at") != null ? rs.getTimestamp("updated_at").toLocalDateTime() : null);
        salesFlatShipment.setPackages(rs.getString("packages"));
        salesFlatShipment.setShippingLabel(rs.getBytes("shipping_label"));
        return salesFlatShipment;
    }

}

