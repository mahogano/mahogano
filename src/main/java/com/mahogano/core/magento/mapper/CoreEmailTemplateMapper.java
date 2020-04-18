package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CoreEmailTemplate;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CoreEmailTemplateMapper implements RowMapper<CoreEmailTemplate> {

    @Override
    public CoreEmailTemplate mapRow(ResultSet rs, int i) throws SQLException {
        CoreEmailTemplate coreEmailTemplate = new CoreEmailTemplate();
        coreEmailTemplate.setTemplateId(rs.getInt("template_id"));
        coreEmailTemplate.setTemplateCode(rs.getString("template_code"));
        coreEmailTemplate.setTemplateText(rs.getString("template_text"));
        coreEmailTemplate.setTemplateStyles(rs.getString("template_styles"));
        coreEmailTemplate.setTemplateType(rs.getInt("template_type"));
        coreEmailTemplate.setTemplateSubject(rs.getString("template_subject"));
        coreEmailTemplate.setTemplateSenderName(rs.getString("template_sender_name"));
        coreEmailTemplate.setTemplateSenderEmail(rs.getString("template_sender_email"));
        coreEmailTemplate.setAddedAt(rs.getTimestamp("added_at") != null ? rs.getTimestamp("added_at").toLocalDateTime() : null);
        coreEmailTemplate.setModifiedAt(rs.getTimestamp("modified_at") != null ? rs.getTimestamp("modified_at").toLocalDateTime() : null);
        coreEmailTemplate.setOrigTemplateCode(rs.getString("orig_template_code"));
        coreEmailTemplate.setOrigTemplateVariables(rs.getString("orig_template_variables"));
        return coreEmailTemplate;
    }

}

