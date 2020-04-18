package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesFlatOrderAddress;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesFlatOrderAddressMapper implements RowMapper<SalesFlatOrderAddress> {

    @Override
    public SalesFlatOrderAddress mapRow(ResultSet rs, int i) throws SQLException {
        SalesFlatOrderAddress salesFlatOrderAddress = new SalesFlatOrderAddress();
        salesFlatOrderAddress.setEntityId(rs.getInt("entity_id"));
        salesFlatOrderAddress.setParentId(rs.getInt("parent_id"));
        salesFlatOrderAddress.setCustomerAddressId(rs.getInt("customer_address_id"));
        salesFlatOrderAddress.setQuoteAddressId(rs.getInt("quote_address_id"));
        salesFlatOrderAddress.setRegionId(rs.getInt("region_id"));
        salesFlatOrderAddress.setCustomerId(rs.getInt("customer_id"));
        salesFlatOrderAddress.setFax(rs.getString("fax"));
        salesFlatOrderAddress.setRegion(rs.getString("region"));
        salesFlatOrderAddress.setPostcode(rs.getString("postcode"));
        salesFlatOrderAddress.setLastname(rs.getString("lastname"));
        salesFlatOrderAddress.setStreet(rs.getString("street"));
        salesFlatOrderAddress.setCity(rs.getString("city"));
        salesFlatOrderAddress.setEmail(rs.getString("email"));
        salesFlatOrderAddress.setTelephone(rs.getString("telephone"));
        salesFlatOrderAddress.setCountryId(rs.getString("country_id"));
        salesFlatOrderAddress.setFirstname(rs.getString("firstname"));
        salesFlatOrderAddress.setAddressType(rs.getString("address_type"));
        salesFlatOrderAddress.setPrefix(rs.getString("prefix"));
        salesFlatOrderAddress.setMiddlename(rs.getString("middlename"));
        salesFlatOrderAddress.setSuffix(rs.getString("suffix"));
        salesFlatOrderAddress.setCompany(rs.getString("company"));
        salesFlatOrderAddress.setVatId(rs.getString("vat_id"));
        salesFlatOrderAddress.setVatIsValid(rs.getInt("vat_is_valid"));
        salesFlatOrderAddress.setVatRequestId(rs.getString("vat_request_id"));
        salesFlatOrderAddress.setVatRequestDate(rs.getString("vat_request_date"));
        salesFlatOrderAddress.setVatRequestSuccess(rs.getInt("vat_request_success"));
        return salesFlatOrderAddress;
    }

}

