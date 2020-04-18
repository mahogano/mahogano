package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesFlatShipmentGrid;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesFlatShipmentGridMapper implements RowMapper<SalesFlatShipmentGrid> {

    @Override
    public SalesFlatShipmentGrid mapRow(ResultSet rs, int i) throws SQLException {
        SalesFlatShipmentGrid salesFlatShipmentGrid = new SalesFlatShipmentGrid();
        salesFlatShipmentGrid.setEntityId(rs.getInt("entity_id"));
        salesFlatShipmentGrid.setStoreId(rs.getInt("store_id"));
        salesFlatShipmentGrid.setTotalQty(rs.getBigDecimal("total_qty"));
        salesFlatShipmentGrid.setOrderId(rs.getInt("order_id"));
        salesFlatShipmentGrid.setShipmentStatus(rs.getInt("shipment_status"));
        salesFlatShipmentGrid.setIncrementId(rs.getString("increment_id"));
        salesFlatShipmentGrid.setOrderIncrementId(rs.getString("order_increment_id"));
        salesFlatShipmentGrid.setCreatedAt(rs.getTimestamp("created_at") != null ? rs.getTimestamp("created_at").toLocalDateTime() : null);
        salesFlatShipmentGrid.setOrderCreatedAt(rs.getTimestamp("order_created_at") != null ? rs.getTimestamp("order_created_at").toLocalDateTime() : null);
        salesFlatShipmentGrid.setShippingName(rs.getString("shipping_name"));
        return salesFlatShipmentGrid;
    }

}

