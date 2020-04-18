package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.EavAttribute;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EavAttributeMapper implements RowMapper<EavAttribute> {

    @Override
    public EavAttribute mapRow(ResultSet rs, int i) throws SQLException {
        EavAttribute eavAttribute = new EavAttribute();
        eavAttribute.setAttributeId(rs.getInt("attribute_id"));
        eavAttribute.setEntityTypeId(rs.getInt("entity_type_id"));
        eavAttribute.setAttributeCode(rs.getString("attribute_code"));
        eavAttribute.setAttributeModel(rs.getString("attribute_model"));
        eavAttribute.setBackendModel(rs.getString("backend_model"));
        eavAttribute.setBackendType(rs.getString("backend_type"));
        eavAttribute.setBackendTable(rs.getString("backend_table"));
        eavAttribute.setFrontendModel(rs.getString("frontend_model"));
        eavAttribute.setFrontendInput(rs.getString("frontend_input"));
        eavAttribute.setFrontendLabel(rs.getString("frontend_label"));
        eavAttribute.setFrontendClass(rs.getString("frontend_class"));
        eavAttribute.setSourceModel(rs.getString("source_model"));
        eavAttribute.setIsRequired(rs.getInt("is_required"));
        eavAttribute.setIsUserDefined(rs.getInt("is_user_defined"));
        eavAttribute.setDefaultValue(rs.getString("default_value"));
        eavAttribute.setIsUnique(rs.getInt("is_unique"));
        eavAttribute.setNote(rs.getString("note"));
        return eavAttribute;
    }

}

