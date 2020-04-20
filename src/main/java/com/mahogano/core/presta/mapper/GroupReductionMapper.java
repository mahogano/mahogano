package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.GroupReduction;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GroupReductionMapper implements RowMapper<GroupReduction> {

    @Override
    public GroupReduction mapRow(ResultSet rs, int i) throws SQLException {
        GroupReduction groupReduction = new GroupReduction();
        groupReduction.setIdGroupReduction(rs.getInt("id_group_reduction"));
        groupReduction.setIdGroup(rs.getInt("id_group"));
        groupReduction.setIdCategory(rs.getInt("id_category"));
        groupReduction.setReduction(rs.getBigDecimal("reduction"));
        return groupReduction;
    }

}

