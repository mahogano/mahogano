package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.ApiUser;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ApiUserMapper implements RowMapper<ApiUser> {

    @Override
    public ApiUser mapRow(ResultSet rs, int i) throws SQLException {
        ApiUser apiUser = new ApiUser();
        apiUser.setUserId(rs.getInt("user_id"));
        apiUser.setFirstname(rs.getString("firstname"));
        apiUser.setLastname(rs.getString("lastname"));
        apiUser.setEmail(rs.getString("email"));
        apiUser.setUsername(rs.getString("username"));
        apiUser.setApiKey(rs.getString("api_key"));
        apiUser.setCreated(rs.getTimestamp("created").toLocalDateTime());
        apiUser.setModified(rs.getTimestamp("modified") != null ? rs.getTimestamp("modified").toLocalDateTime() : null);
        apiUser.setLognum(rs.getInt("lognum"));
        apiUser.setReloadAclFlag(rs.getInt("reload_acl_flag"));
        apiUser.setIsActive(rs.getInt("is_active"));
        return apiUser;
    }

}

