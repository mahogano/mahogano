package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.PollStore;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PollStoreMapper implements RowMapper<PollStore> {

    @Override
    public PollStore mapRow(ResultSet rs, int i) throws SQLException {
        PollStore pollStore = new PollStore();
        pollStore.setPollId(rs.getInt("poll_id"));
        pollStore.setStoreId(rs.getInt("store_id"));
        return pollStore;
    }

}

