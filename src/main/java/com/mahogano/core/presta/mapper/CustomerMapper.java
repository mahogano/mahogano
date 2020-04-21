package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Customer;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerMapper implements RowMapper<Customer> {

    @Override
    public Customer mapRow(ResultSet rs, int i) throws SQLException {
        Customer customer = new Customer();
        customer.setIdCustomer(rs.getInt("id_customer"));
        customer.setIdShopGroup(rs.getInt("id_shop_group"));
        customer.setIdShop(rs.getInt("id_shop"));
        customer.setIdGender(rs.getInt("id_gender"));
        customer.setIdDefaultGroup(rs.getInt("id_default_group"));
        customer.setIdLang(rs.getInt("id_lang"));
        customer.setIdRisk(rs.getInt("id_risk"));
        customer.setCompany(rs.getString("company"));
        customer.setSiret(rs.getString("siret"));
        customer.setApe(rs.getString("ape"));
        customer.setFirstname(rs.getString("firstname"));
        customer.setLastname(rs.getString("lastname"));
        customer.setEmail(rs.getString("email"));
        customer.setPasswd(rs.getString("passwd"));
        customer.setLastPasswdGen(rs.getTimestamp("last_passwd_gen").toLocalDateTime());
        customer.setBirthday(rs.getTimestamp("birthday") != null ? rs.getTimestamp("birthday").toLocalDateTime() : null);
        customer.setNewsletter(rs.getInt("newsletter"));
        customer.setIpRegistrationNewsletter(rs.getString("ip_registration_newsletter"));
        customer.setNewsletterDateAdd(rs.getTimestamp("newsletter_date_add") != null ? rs.getTimestamp("newsletter_date_add").toLocalDateTime() : null);
        customer.setOptin(rs.getInt("optin"));
        customer.setWebsite(rs.getString("website"));
        customer.setOutstandingAllowAmount(rs.getBigDecimal("outstanding_allow_amount"));
        customer.setShowPublicPrices(rs.getInt("show_public_prices"));
        customer.setMaxPaymentDays(rs.getInt("max_payment_days"));
        customer.setSecureKey(rs.getString("secure_key"));
        customer.setNote(rs.getString("note"));
        customer.setActive(rs.getInt("active"));
        customer.setIsGuest(rs.getInt("is_guest"));
        customer.setDeleted(rs.getInt("deleted"));
        customer.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        customer.setDateUpd(rs.getTimestamp("date_upd").toLocalDateTime());
        customer.setResetPasswordToken(rs.getString("reset_password_token"));
        customer.setResetPasswordValidity(rs.getTimestamp("reset_password_validity") != null ? rs.getTimestamp("reset_password_validity").toLocalDateTime() : null);
        return customer;
    }

}

