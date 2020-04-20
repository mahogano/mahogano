package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Badge;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BadgeMapper implements RowMapper<Badge> {

    @Override
    public Badge mapRow(ResultSet rs, int i) throws SQLException {
        Badge badge = new Badge();
        badge.setIdBadge(rs.getInt("id_badge"));
        badge.setIdPsBadge(rs.getInt("id_ps_badge"));
        badge.setType(rs.getString("type"));
        badge.setIdGroup(rs.getInt("id_group"));
        badge.setGroupPosition(rs.getInt("group_position"));
        badge.setScoring(rs.getInt("scoring"));
        badge.setAwb(rs.getInt("awb"));
        badge.setValidated(rs.getInt("validated"));
        return badge;
    }

}

