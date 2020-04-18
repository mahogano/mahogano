package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.NewsletterTemplate;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NewsletterTemplateMapper implements RowMapper<NewsletterTemplate> {

    @Override
    public NewsletterTemplate mapRow(ResultSet rs, int i) throws SQLException {
        NewsletterTemplate newsletterTemplate = new NewsletterTemplate();
        newsletterTemplate.setTemplateId(rs.getInt("template_id"));
        newsletterTemplate.setTemplateCode(rs.getString("template_code"));
        newsletterTemplate.setTemplateText(rs.getString("template_text"));
        newsletterTemplate.setTemplateTextPreprocessed(rs.getString("template_text_preprocessed"));
        newsletterTemplate.setTemplateStyles(rs.getString("template_styles"));
        newsletterTemplate.setTemplateType(rs.getInt("template_type"));
        newsletterTemplate.setTemplateSubject(rs.getString("template_subject"));
        newsletterTemplate.setTemplateSenderName(rs.getString("template_sender_name"));
        newsletterTemplate.setTemplateSenderEmail(rs.getString("template_sender_email"));
        newsletterTemplate.setTemplateActual(rs.getInt("template_actual"));
        newsletterTemplate.setAddedAt(rs.getTimestamp("added_at") != null ? rs.getTimestamp("added_at").toLocalDateTime() : null);
        newsletterTemplate.setModifiedAt(rs.getTimestamp("modified_at") != null ? rs.getTimestamp("modified_at").toLocalDateTime() : null);
        return newsletterTemplate;
    }

}

