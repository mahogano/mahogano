package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.LayeredIndexableAttributeLangValue;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LayeredIndexableAttributeLangValueMapper implements RowMapper<LayeredIndexableAttributeLangValue> {

    @Override
    public LayeredIndexableAttributeLangValue mapRow(ResultSet rs, int i) throws SQLException {
        LayeredIndexableAttributeLangValue layeredIndexableAttributeLangValue = new LayeredIndexableAttributeLangValue();
        layeredIndexableAttributeLangValue.setIdAttribute(rs.getInt("id_attribute"));
        layeredIndexableAttributeLangValue.setIdLang(rs.getInt("id_lang"));
        layeredIndexableAttributeLangValue.setUrlName(rs.getString("url_name"));
        layeredIndexableAttributeLangValue.setMetaTitle(rs.getString("meta_title"));
        return layeredIndexableAttributeLangValue;
    }

}

