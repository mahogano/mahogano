package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.SupplierLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SupplierLangMapper implements RowMapper<SupplierLang> {

    @Override
    public SupplierLang mapRow(ResultSet rs, int i) throws SQLException {
        SupplierLang supplierLang = new SupplierLang();
        supplierLang.setIdSupplier(rs.getInt("id_supplier"));
        supplierLang.setIdLang(rs.getInt("id_lang"));
        supplierLang.setDescription(rs.getString("description"));
        supplierLang.setMetaTitle(rs.getString("meta_title"));
        supplierLang.setMetaKeywords(rs.getString("meta_keywords"));
        supplierLang.setMetaDescription(rs.getString("meta_description"));
        return supplierLang;
    }

}

