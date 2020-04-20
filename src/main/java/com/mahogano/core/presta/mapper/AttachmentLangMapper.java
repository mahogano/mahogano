package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.AttachmentLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AttachmentLangMapper implements RowMapper<AttachmentLang> {

    @Override
    public AttachmentLang mapRow(ResultSet rs, int i) throws SQLException {
        AttachmentLang attachmentLang = new AttachmentLang();
        attachmentLang.setIdAttachment(rs.getInt("id_attachment"));
        attachmentLang.setIdLang(rs.getInt("id_lang"));
        attachmentLang.setName(rs.getString("name"));
        attachmentLang.setDescription(rs.getString("description"));
        return attachmentLang;
    }

}

