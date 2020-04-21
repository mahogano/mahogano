package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.GroupShop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GroupShopMapper implements RowMapper<GroupShop> {

    @Override
    public GroupShop mapRow(ResultSet rs, int i) throws SQLException {
        GroupShop groupShop = new GroupShop();
        groupShop.setIdGroup(rs.getInt("id_group"));
        groupShop.setIdShop(rs.getInt("id_shop"));
        return groupShop;
    }

}

