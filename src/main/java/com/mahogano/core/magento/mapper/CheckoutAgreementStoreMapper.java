package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CheckoutAgreementStore;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CheckoutAgreementStoreMapper implements RowMapper<CheckoutAgreementStore> {

    @Override
    public CheckoutAgreementStore mapRow(ResultSet rs, int i) throws SQLException {
        CheckoutAgreementStore checkoutAgreementStore = new CheckoutAgreementStore();
        checkoutAgreementStore.setAgreementId(rs.getInt("agreement_id"));
        checkoutAgreementStore.setStoreId(rs.getInt("store_id"));
        return checkoutAgreementStore;
    }

}

