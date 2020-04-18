package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogruleProduct;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogruleProductMapper implements RowMapper<CatalogruleProduct> {

    @Override
    public CatalogruleProduct mapRow(ResultSet rs, int i) throws SQLException {
        CatalogruleProduct catalogruleProduct = new CatalogruleProduct();
        catalogruleProduct.setRuleProductId(rs.getInt("rule_product_id"));
        catalogruleProduct.setRuleId(rs.getInt("rule_id"));
        catalogruleProduct.setFromTime(rs.getInt("from_time"));
        catalogruleProduct.setToTime(rs.getInt("to_time"));
        catalogruleProduct.setCustomerGroupId(rs.getInt("customer_group_id"));
        catalogruleProduct.setProductId(rs.getInt("product_id"));
        catalogruleProduct.setActionOperator(rs.getString("action_operator"));
        catalogruleProduct.setActionAmount(rs.getBigDecimal("action_amount"));
        catalogruleProduct.setActionStop(rs.getInt("action_stop"));
        catalogruleProduct.setSortOrder(rs.getInt("sort_order"));
        catalogruleProduct.setWebsiteId(rs.getInt("website_id"));
        catalogruleProduct.setSubSimpleAction(rs.getString("sub_simple_action"));
        catalogruleProduct.setSubDiscountAmount(rs.getBigDecimal("sub_discount_amount"));
        return catalogruleProduct;
    }

}

