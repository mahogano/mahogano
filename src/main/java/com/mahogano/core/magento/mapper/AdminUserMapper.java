package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.AdminUser;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminUserMapper implements RowMapper<AdminUser> {

    @Override
    public AdminUser mapRow(ResultSet rs, int i) throws SQLException {
        AdminUser adminUser = new AdminUser();
        adminUser.setUserId(rs.getInt("user_id"));
        adminUser.setFirstname(rs.getString("firstname"));
        adminUser.setLastname(rs.getString("lastname"));
        adminUser.setEmail(rs.getString("email"));
        adminUser.setUsername(rs.getString("username"));
        adminUser.setPassword(rs.getString("password"));
        adminUser.setCreated(rs.getTimestamp("created").toLocalDateTime());
        adminUser.setModified(rs.getTimestamp("modified") != null ? rs.getTimestamp("modified").toLocalDateTime() : null);
        adminUser.setLogdate(rs.getTimestamp("logdate") != null ? rs.getTimestamp("logdate").toLocalDateTime() : null);
        adminUser.setLognum(rs.getInt("lognum"));
        adminUser.setReloadAclFlag(rs.getInt("reload_acl_flag"));
        adminUser.setIsActive(rs.getInt("is_active"));
        adminUser.setExtra(rs.getString("extra"));
        adminUser.setRpToken(rs.getString("rp_token"));
        adminUser.setRpTokenCreatedAt(rs.getTimestamp("rp_token_created_at") != null ? rs.getTimestamp("rp_token_created_at").toLocalDateTime() : null);
        return adminUser;
    }

}

