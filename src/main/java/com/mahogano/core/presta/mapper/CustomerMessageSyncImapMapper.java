package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CustomerMessageSyncImap;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerMessageSyncImapMapper implements RowMapper<CustomerMessageSyncImap> {

    @Override
    public CustomerMessageSyncImap mapRow(ResultSet rs, int i) throws SQLException {
        CustomerMessageSyncImap customerMessageSyncImap = new CustomerMessageSyncImap();
        customerMessageSyncImap.setMd5Header(rs.getBytes("md5_header"));
        return customerMessageSyncImap;
    }

}

