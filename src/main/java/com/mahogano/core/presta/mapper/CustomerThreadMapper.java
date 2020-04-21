package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CustomerThread;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerThreadMapper implements RowMapper<CustomerThread> {

    @Override
    public CustomerThread mapRow(ResultSet rs, int i) throws SQLException {
        CustomerThread customerThread = new CustomerThread();
        customerThread.setIdCustomerThread(rs.getInt("id_customer_thread"));
        customerThread.setIdShop(rs.getInt("id_shop"));
        customerThread.setIdLang(rs.getInt("id_lang"));
        customerThread.setIdContact(rs.getInt("id_contact"));
        customerThread.setIdCustomer(rs.getInt("id_customer"));
        customerThread.setIdOrder(rs.getInt("id_order"));
        customerThread.setIdProduct(rs.getInt("id_product"));
        customerThread.setStatus(rs.getString("status"));
        customerThread.setEmail(rs.getString("email"));
        customerThread.setToken(rs.getString("token"));
        customerThread.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        customerThread.setDateUpd(rs.getTimestamp("date_upd").toLocalDateTime());
        return customerThread;
    }

}

