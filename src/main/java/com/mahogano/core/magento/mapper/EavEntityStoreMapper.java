package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.EavEntityStore;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EavEntityStoreMapper implements RowMapper<EavEntityStore> {

    @Override
    public EavEntityStore mapRow(ResultSet rs, int i) throws SQLException {
        EavEntityStore eavEntityStore = new EavEntityStore();
        eavEntityStore.setEntityStoreId(rs.getInt("entity_store_id"));
        eavEntityStore.setEntityTypeId(rs.getInt("entity_type_id"));
        eavEntityStore.setStoreId(rs.getInt("store_id"));
        eavEntityStore.setIncrementPrefix(rs.getString("increment_prefix"));
        eavEntityStore.setIncrementLastId(rs.getString("increment_last_id"));
        return eavEntityStore;
    }

}

