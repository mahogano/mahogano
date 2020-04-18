package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CmsBlock;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CmsBlockMapper implements RowMapper<CmsBlock> {

    @Override
    public CmsBlock mapRow(ResultSet rs, int i) throws SQLException {
        CmsBlock cmsBlock = new CmsBlock();
        cmsBlock.setBlockId(rs.getInt("block_id"));
        cmsBlock.setTitle(rs.getString("title"));
        cmsBlock.setIdentifier(rs.getString("identifier"));
        cmsBlock.setContent(rs.getString("content"));
        cmsBlock.setCreationTime(rs.getTimestamp("creation_time") != null ? rs.getTimestamp("creation_time").toLocalDateTime() : null);
        cmsBlock.setUpdateTime(rs.getTimestamp("update_time") != null ? rs.getTimestamp("update_time").toLocalDateTime() : null);
        cmsBlock.setIsActive(rs.getInt("is_active"));
        return cmsBlock;
    }

}

