package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CoreUrlRewrite;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CoreUrlRewriteMapper implements RowMapper<CoreUrlRewrite> {

    @Override
    public CoreUrlRewrite mapRow(ResultSet rs, int i) throws SQLException {
        CoreUrlRewrite coreUrlRewrite = new CoreUrlRewrite();
        coreUrlRewrite.setUrlRewriteId(rs.getInt("url_rewrite_id"));
        coreUrlRewrite.setStoreId(rs.getInt("store_id"));
        coreUrlRewrite.setIdPath(rs.getString("id_path"));
        coreUrlRewrite.setRequestPath(rs.getString("request_path"));
        coreUrlRewrite.setTargetPath(rs.getString("target_path"));
        coreUrlRewrite.setIsSystem(rs.getInt("is_system"));
        coreUrlRewrite.setOptions(rs.getString("options"));
        coreUrlRewrite.setDescription(rs.getString("description"));
        coreUrlRewrite.setCategoryId(rs.getInt("category_id"));
        coreUrlRewrite.setProductId(rs.getInt("product_id"));
        return coreUrlRewrite;
    }

}

