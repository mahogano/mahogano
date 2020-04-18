package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CataloginventoryStockItem;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CataloginventoryStockItemMapper implements RowMapper<CataloginventoryStockItem> {

    @Override
    public CataloginventoryStockItem mapRow(ResultSet rs, int i) throws SQLException {
        CataloginventoryStockItem cataloginventoryStockItem = new CataloginventoryStockItem();
        cataloginventoryStockItem.setItemId(rs.getInt("item_id"));
        cataloginventoryStockItem.setProductId(rs.getInt("product_id"));
        cataloginventoryStockItem.setStockId(rs.getInt("stock_id"));
        cataloginventoryStockItem.setQty(rs.getBigDecimal("qty"));
        cataloginventoryStockItem.setMinQty(rs.getBigDecimal("min_qty"));
        cataloginventoryStockItem.setUseConfigMinQty(rs.getInt("use_config_min_qty"));
        cataloginventoryStockItem.setIsQtyDecimal(rs.getInt("is_qty_decimal"));
        cataloginventoryStockItem.setBackorders(rs.getInt("backorders"));
        cataloginventoryStockItem.setUseConfigBackorders(rs.getInt("use_config_backorders"));
        cataloginventoryStockItem.setMinSaleQty(rs.getBigDecimal("min_sale_qty"));
        cataloginventoryStockItem.setUseConfigMinSaleQty(rs.getInt("use_config_min_sale_qty"));
        cataloginventoryStockItem.setMaxSaleQty(rs.getBigDecimal("max_sale_qty"));
        cataloginventoryStockItem.setUseConfigMaxSaleQty(rs.getInt("use_config_max_sale_qty"));
        cataloginventoryStockItem.setIsInStock(rs.getInt("is_in_stock"));
        cataloginventoryStockItem.setLowStockDate(rs.getTimestamp("low_stock_date") != null ? rs.getTimestamp("low_stock_date").toLocalDateTime() : null);
        cataloginventoryStockItem.setNotifyStockQty(rs.getBigDecimal("notify_stock_qty"));
        cataloginventoryStockItem.setUseConfigNotifyStockQty(rs.getInt("use_config_notify_stock_qty"));
        cataloginventoryStockItem.setManageStock(rs.getInt("manage_stock"));
        cataloginventoryStockItem.setUseConfigManageStock(rs.getInt("use_config_manage_stock"));
        cataloginventoryStockItem.setStockStatusChangedAuto(rs.getInt("stock_status_changed_auto"));
        cataloginventoryStockItem.setUseConfigQtyIncrements(rs.getInt("use_config_qty_increments"));
        cataloginventoryStockItem.setQtyIncrements(rs.getBigDecimal("qty_increments"));
        cataloginventoryStockItem.setUseConfigEnableQtyInc(rs.getInt("use_config_enable_qty_inc"));
        cataloginventoryStockItem.setEnableQtyIncrements(rs.getInt("enable_qty_increments"));
        cataloginventoryStockItem.setIsDecimalDivided(rs.getInt("is_decimal_divided"));
        return cataloginventoryStockItem;
    }

}

