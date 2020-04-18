package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesFlatQuoteItemOption;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesFlatQuoteItemOptionMapper implements RowMapper<SalesFlatQuoteItemOption> {

    @Override
    public SalesFlatQuoteItemOption mapRow(ResultSet rs, int i) throws SQLException {
        SalesFlatQuoteItemOption salesFlatQuoteItemOption = new SalesFlatQuoteItemOption();
        salesFlatQuoteItemOption.setOptionId(rs.getInt("option_id"));
        salesFlatQuoteItemOption.setItemId(rs.getInt("item_id"));
        salesFlatQuoteItemOption.setProductId(rs.getInt("product_id"));
        salesFlatQuoteItemOption.setCode(rs.getString("code"));
        salesFlatQuoteItemOption.setValue(rs.getString("value"));
        return salesFlatQuoteItemOption;
    }

}

