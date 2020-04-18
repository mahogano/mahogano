package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CheckoutAgreement;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CheckoutAgreementMapper implements RowMapper<CheckoutAgreement> {

    @Override
    public CheckoutAgreement mapRow(ResultSet rs, int i) throws SQLException {
        CheckoutAgreement checkoutAgreement = new CheckoutAgreement();
        checkoutAgreement.setAgreementId(rs.getInt("agreement_id"));
        checkoutAgreement.setName(rs.getString("name"));
        checkoutAgreement.setContent(rs.getString("content"));
        checkoutAgreement.setContentHeight(rs.getString("content_height"));
        checkoutAgreement.setCheckboxText(rs.getString("checkbox_text"));
        checkoutAgreement.setIsActive(rs.getInt("is_active"));
        checkoutAgreement.setIsHtml(rs.getInt("is_html"));
        return checkoutAgreement;
    }

}

