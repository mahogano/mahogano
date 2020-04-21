package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.RequestSql;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RequestSqlMapper implements RowMapper<RequestSql> {

    @Override
    public RequestSql mapRow(ResultSet rs, int i) throws SQLException {
        RequestSql requestSql = new RequestSql();
        requestSql.setIdRequestSql(rs.getInt("id_request_sql"));
        requestSql.setName(rs.getString("name"));
        requestSql.setSql(rs.getString("sql"));
        return requestSql;
    }

}

