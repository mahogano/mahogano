package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.EavAttributeOption;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EavAttributeOptionMapper implements RowMapper<EavAttributeOption> {

    @Override
    public EavAttributeOption mapRow(ResultSet rs, int i) throws SQLException {
        EavAttributeOption eavAttributeOption = new EavAttributeOption();
        eavAttributeOption.setOptionId(rs.getInt("option_id"));
        eavAttributeOption.setAttributeId(rs.getInt("attribute_id"));
        eavAttributeOption.setSortOrder(rs.getInt("sort_order"));
        return eavAttributeOption;
    }

}

