package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Attachment;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AttachmentMapper implements RowMapper<Attachment> {

    @Override
    public Attachment mapRow(ResultSet rs, int i) throws SQLException {
        Attachment attachment = new Attachment();
        attachment.setIdAttachment(rs.getInt("id_attachment"));
        attachment.setFile(rs.getString("file"));
        attachment.setFileName(rs.getString("file_name"));
        attachment.setFileSize(rs.getLong("file_size"));
        attachment.setMime(rs.getString("mime"));
        return attachment;
    }

}

