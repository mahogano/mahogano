package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.EavEntityType;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EavEntityTypeMapper implements RowMapper<EavEntityType> {

    @Override
    public EavEntityType mapRow(ResultSet rs, int i) throws SQLException {
        EavEntityType eavEntityType = new EavEntityType();
        eavEntityType.setEntityTypeId(rs.getInt("entity_type_id"));
        eavEntityType.setEntityTypeCode(rs.getString("entity_type_code"));
        eavEntityType.setEntityModel(rs.getString("entity_model"));
        eavEntityType.setAttributeModel(rs.getString("attribute_model"));
        eavEntityType.setEntityTable(rs.getString("entity_table"));
        eavEntityType.setValueTablePrefix(rs.getString("value_table_prefix"));
        eavEntityType.setEntityIdField(rs.getString("entity_id_field"));
        eavEntityType.setIsDataSharing(rs.getInt("is_data_sharing"));
        eavEntityType.setDataSharingKey(rs.getString("data_sharing_key"));
        eavEntityType.setDefaultAttributeSetId(rs.getInt("default_attribute_set_id"));
        eavEntityType.setIncrementModel(rs.getString("increment_model"));
        eavEntityType.setIncrementPerStore(rs.getInt("increment_per_store"));
        eavEntityType.setIncrementPadLength(rs.getInt("increment_pad_length"));
        eavEntityType.setIncrementPadChar(rs.getString("increment_pad_char"));
        eavEntityType.setAdditionalAttributeTable(rs.getString("additional_attribute_table"));
        eavEntityType.setEntityAttributeCollection(rs.getString("entity_attribute_collection"));
        return eavEntityType;
    }

}

