package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.SupplyOrder;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SupplyOrderMapper implements RowMapper<SupplyOrder> {

    @Override
    public SupplyOrder mapRow(ResultSet rs, int i) throws SQLException {
        SupplyOrder supplyOrder = new SupplyOrder();
        supplyOrder.setIdSupplyOrder(rs.getInt("id_supply_order"));
        supplyOrder.setIdSupplier(rs.getInt("id_supplier"));
        supplyOrder.setSupplierName(rs.getString("supplier_name"));
        supplyOrder.setIdLang(rs.getInt("id_lang"));
        supplyOrder.setIdWarehouse(rs.getInt("id_warehouse"));
        supplyOrder.setIdSupplyOrderState(rs.getInt("id_supply_order_state"));
        supplyOrder.setIdCurrency(rs.getInt("id_currency"));
        supplyOrder.setIdRefCurrency(rs.getInt("id_ref_currency"));
        supplyOrder.setReference(rs.getString("reference"));
        supplyOrder.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        supplyOrder.setDateUpd(rs.getTimestamp("date_upd").toLocalDateTime());
        supplyOrder.setDateDeliveryExpected(rs.getTimestamp("date_delivery_expected") != null ? rs.getTimestamp("date_delivery_expected").toLocalDateTime() : null);
        supplyOrder.setTotalTe(rs.getBigDecimal("total_te"));
        supplyOrder.setTotalWithDiscountTe(rs.getBigDecimal("total_with_discount_te"));
        supplyOrder.setTotalTax(rs.getBigDecimal("total_tax"));
        supplyOrder.setTotalTi(rs.getBigDecimal("total_ti"));
        supplyOrder.setDiscountRate(rs.getBigDecimal("discount_rate"));
        supplyOrder.setDiscountValueTe(rs.getBigDecimal("discount_value_te"));
        supplyOrder.setIsTemplate(rs.getInt("is_template"));
        return supplyOrder;
    }

}

