package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ImportMatch;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ImportMatchMapper implements RowMapper<ImportMatch> {

    @Override
    public ImportMatch mapRow(ResultSet rs, int i) throws SQLException {
        ImportMatch importMatch = new ImportMatch();
        importMatch.setIdImportMatch(rs.getInt("id_import_match"));
        importMatch.setName(rs.getString("name"));
        importMatch.setMatch(rs.getString("match"));
        importMatch.setSkip(rs.getInt("skip"));
        return importMatch;
    }

}

