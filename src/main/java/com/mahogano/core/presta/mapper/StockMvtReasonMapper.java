package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.StockMvtReason;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StockMvtReasonMapper implements RowMapper<StockMvtReason> {

    @Override
    public StockMvtReason mapRow(ResultSet rs, int i) throws SQLException {
        StockMvtReason stockMvtReason = new StockMvtReason();
        stockMvtReason.setIdStockMvtReason(rs.getInt("id_stock_mvt_reason"));
        stockMvtReason.setSign(rs.getInt("sign"));
        stockMvtReason.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        stockMvtReason.setDateUpd(rs.getTimestamp("date_upd").toLocalDateTime());
        stockMvtReason.setDeleted(rs.getInt("deleted"));
        return stockMvtReason;
    }

}

