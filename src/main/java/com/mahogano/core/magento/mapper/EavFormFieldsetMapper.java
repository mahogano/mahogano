package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.EavFormFieldset;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EavFormFieldsetMapper implements RowMapper<EavFormFieldset> {

    @Override
    public EavFormFieldset mapRow(ResultSet rs, int i) throws SQLException {
        EavFormFieldset eavFormFieldset = new EavFormFieldset();
        eavFormFieldset.setFieldsetId(rs.getInt("fieldset_id"));
        eavFormFieldset.setTypeId(rs.getInt("type_id"));
        eavFormFieldset.setCode(rs.getString("code"));
        eavFormFieldset.setSortOrder(rs.getInt("sort_order"));
        return eavFormFieldset;
    }

}

