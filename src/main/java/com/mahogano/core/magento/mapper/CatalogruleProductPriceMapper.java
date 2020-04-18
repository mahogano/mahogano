package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogruleProductPrice;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogruleProductPriceMapper implements RowMapper<CatalogruleProductPrice> {

    @Override
    public CatalogruleProductPrice mapRow(ResultSet rs, int i) throws SQLException {
        CatalogruleProductPrice catalogruleProductPrice = new CatalogruleProductPrice();
        catalogruleProductPrice.setRuleProductPriceId(rs.getInt("rule_product_price_id"));
        catalogruleProductPrice.setRuleDate(rs.getTimestamp("rule_date").toLocalDateTime());
        catalogruleProductPrice.setCustomerGroupId(rs.getInt("customer_group_id"));
        catalogruleProductPrice.setProductId(rs.getInt("product_id"));
        catalogruleProductPrice.setRulePrice(rs.getBigDecimal("rule_price"));
        catalogruleProductPrice.setWebsiteId(rs.getInt("website_id"));
        catalogruleProductPrice.setLatestStartDate(rs.getTimestamp("latest_start_date") != null ? rs.getTimestamp("latest_start_date").toLocalDateTime() : null);
        catalogruleProductPrice.setEarliestEndDate(rs.getTimestamp("earliest_end_date") != null ? rs.getTimestamp("earliest_end_date").toLocalDateTime() : null);
        return catalogruleProductPrice;
    }

}

