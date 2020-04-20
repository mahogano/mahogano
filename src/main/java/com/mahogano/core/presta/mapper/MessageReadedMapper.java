package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.MessageReaded;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MessageReadedMapper implements RowMapper<MessageReaded> {

    @Override
    public MessageReaded mapRow(ResultSet rs, int i) throws SQLException {
        MessageReaded messageReaded = new MessageReaded();
        messageReaded.setIdMessage(rs.getInt("id_message"));
        messageReaded.setIdEmployee(rs.getInt("id_employee"));
        messageReaded.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        return messageReaded;
    }

}

