package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.PermissionBlock;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PermissionBlockMapper implements RowMapper<PermissionBlock> {

    @Override
    public PermissionBlock mapRow(ResultSet rs, int i) throws SQLException {
        PermissionBlock permissionBlock = new PermissionBlock();
        permissionBlock.setBlockId(rs.getInt("block_id"));
        permissionBlock.setBlockName(rs.getString("block_name"));
        permissionBlock.setIsAllowed(rs.getInt("is_allowed"));
        return permissionBlock;
    }

}

