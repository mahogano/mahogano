package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.LayeredIndexableAttributeGroupLangValue;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LayeredIndexableAttributeGroupLangValueMapper implements RowMapper<LayeredIndexableAttributeGroupLangValue> {

    @Override
    public LayeredIndexableAttributeGroupLangValue mapRow(ResultSet rs, int i) throws SQLException {
        LayeredIndexableAttributeGroupLangValue layeredIndexableAttributeGroupLangValue = new LayeredIndexableAttributeGroupLangValue();
        layeredIndexableAttributeGroupLangValue.setIdAttributeGroup(rs.getInt("id_attribute_group"));
        layeredIndexableAttributeGroupLangValue.setIdLang(rs.getInt("id_lang"));
        layeredIndexableAttributeGroupLangValue.setUrlName(rs.getString("url_name"));
        layeredIndexableAttributeGroupLangValue.setMetaTitle(rs.getString("meta_title"));
        return layeredIndexableAttributeGroupLangValue;
    }

}

