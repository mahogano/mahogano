package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Linksmenutop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LinksmenutopMapper implements RowMapper<Linksmenutop> {

    @Override
    public Linksmenutop mapRow(ResultSet rs, int i) throws SQLException {
        Linksmenutop linksmenutop = new Linksmenutop();
        linksmenutop.setIdLinksmenutop(rs.getInt("id_linksmenutop"));
        linksmenutop.setIdShop(rs.getInt("id_shop"));
        linksmenutop.setNewWindow(rs.getInt("new_window"));
        return linksmenutop;
    }

}

