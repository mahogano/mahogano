package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesFlatShipmentItem;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesFlatShipmentItemMapper implements RowMapper<SalesFlatShipmentItem> {

    @Override
    public SalesFlatShipmentItem mapRow(ResultSet rs, int i) throws SQLException {
        SalesFlatShipmentItem salesFlatShipmentItem = new SalesFlatShipmentItem();
        salesFlatShipmentItem.setEntityId(rs.getInt("entity_id"));
        salesFlatShipmentItem.setParentId(rs.getInt("parent_id"));
        salesFlatShipmentItem.setRowTotal(rs.getBigDecimal("row_total"));
        salesFlatShipmentItem.setPrice(rs.getBigDecimal("price"));
        salesFlatShipmentItem.setWeight(rs.getBigDecimal("weight"));
        salesFlatShipmentItem.setQty(rs.getBigDecimal("qty"));
        salesFlatShipmentItem.setProductId(rs.getInt("product_id"));
        salesFlatShipmentItem.setOrderItemId(rs.getInt("order_item_id"));
        salesFlatShipmentItem.setAdditionalData(rs.getString("additional_data"));
        salesFlatShipmentItem.setDescription(rs.getString("description"));
        salesFlatShipmentItem.setName(rs.getString("name"));
        salesFlatShipmentItem.setSku(rs.getString("sku"));
        return salesFlatShipmentItem;
    }

}

