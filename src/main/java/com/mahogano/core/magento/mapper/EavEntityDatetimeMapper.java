package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.EavEntityDatetime;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EavEntityDatetimeMapper implements RowMapper<EavEntityDatetime> {

    @Override
    public EavEntityDatetime mapRow(ResultSet rs, int i) throws SQLException {
        EavEntityDatetime eavEntityDatetime = new EavEntityDatetime();
        eavEntityDatetime.setValueId(rs.getInt("value_id"));
        eavEntityDatetime.setEntityTypeId(rs.getInt("entity_type_id"));
        eavEntityDatetime.setAttributeId(rs.getInt("attribute_id"));
        eavEntityDatetime.setStoreId(rs.getInt("store_id"));
        eavEntityDatetime.setEntityId(rs.getInt("entity_id"));
        eavEntityDatetime.setValue(rs.getTimestamp("value").toLocalDateTime());
        return eavEntityDatetime;
    }

}

