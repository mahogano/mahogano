package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.StockMvtReasonLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StockMvtReasonLangMapper implements RowMapper<StockMvtReasonLang> {

    @Override
    public StockMvtReasonLang mapRow(ResultSet rs, int i) throws SQLException {
        StockMvtReasonLang stockMvtReasonLang = new StockMvtReasonLang();
        stockMvtReasonLang.setIdStockMvtReason(rs.getInt("id_stock_mvt_reason"));
        stockMvtReasonLang.setIdLang(rs.getInt("id_lang"));
        stockMvtReasonLang.setName(rs.getString("name"));
        return stockMvtReasonLang;
    }

}

