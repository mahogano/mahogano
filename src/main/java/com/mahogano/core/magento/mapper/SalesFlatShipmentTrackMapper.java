package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesFlatShipmentTrack;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesFlatShipmentTrackMapper implements RowMapper<SalesFlatShipmentTrack> {

    @Override
    public SalesFlatShipmentTrack mapRow(ResultSet rs, int i) throws SQLException {
        SalesFlatShipmentTrack salesFlatShipmentTrack = new SalesFlatShipmentTrack();
        salesFlatShipmentTrack.setEntityId(rs.getInt("entity_id"));
        salesFlatShipmentTrack.setParentId(rs.getInt("parent_id"));
        salesFlatShipmentTrack.setWeight(rs.getBigDecimal("weight"));
        salesFlatShipmentTrack.setQty(rs.getBigDecimal("qty"));
        salesFlatShipmentTrack.setOrderId(rs.getInt("order_id"));
        salesFlatShipmentTrack.setTrackNumber(rs.getString("track_number"));
        salesFlatShipmentTrack.setDescription(rs.getString("description"));
        salesFlatShipmentTrack.setTitle(rs.getString("title"));
        salesFlatShipmentTrack.setCarrierCode(rs.getString("carrier_code"));
        salesFlatShipmentTrack.setCreatedAt(rs.getTimestamp("created_at") != null ? rs.getTimestamp("created_at").toLocalDateTime() : null);
        salesFlatShipmentTrack.setUpdatedAt(rs.getTimestamp("updated_at") != null ? rs.getTimestamp("updated_at").toLocalDateTime() : null);
        return salesFlatShipmentTrack;
    }

}

