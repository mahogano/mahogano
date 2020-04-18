package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesruleLabel;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesruleLabelMapper implements RowMapper<SalesruleLabel> {

    @Override
    public SalesruleLabel mapRow(ResultSet rs, int i) throws SQLException {
        SalesruleLabel salesruleLabel = new SalesruleLabel();
        salesruleLabel.setLabelId(rs.getInt("label_id"));
        salesruleLabel.setRuleId(rs.getInt("rule_id"));
        salesruleLabel.setStoreId(rs.getInt("store_id"));
        salesruleLabel.setLabel(rs.getString("label"));
        return salesruleLabel;
    }

}

