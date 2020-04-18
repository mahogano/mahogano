package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.TaxClass;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaxClassMapper implements RowMapper<TaxClass> {

    @Override
    public TaxClass mapRow(ResultSet rs, int i) throws SQLException {
        TaxClass taxClass = new TaxClass();
        taxClass.setClassId(rs.getInt("class_id"));
        taxClass.setClassName(rs.getString("class_name"));
        taxClass.setClassType(rs.getString("class_type"));
        return taxClass;
    }

}

