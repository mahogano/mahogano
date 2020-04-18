package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogEavAttribute;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogEavAttributeMapper implements RowMapper<CatalogEavAttribute> {

    @Override
    public CatalogEavAttribute mapRow(ResultSet rs, int i) throws SQLException {
        CatalogEavAttribute catalogEavAttribute = new CatalogEavAttribute();
        catalogEavAttribute.setAttributeId(rs.getInt("attribute_id"));
        catalogEavAttribute.setFrontendInputRenderer(rs.getString("frontend_input_renderer"));
        catalogEavAttribute.setIsGlobal(rs.getInt("is_global"));
        catalogEavAttribute.setIsVisible(rs.getInt("is_visible"));
        catalogEavAttribute.setIsSearchable(rs.getInt("is_searchable"));
        catalogEavAttribute.setIsFilterable(rs.getInt("is_filterable"));
        catalogEavAttribute.setIsComparable(rs.getInt("is_comparable"));
        catalogEavAttribute.setIsVisibleOnFront(rs.getInt("is_visible_on_front"));
        catalogEavAttribute.setIsHtmlAllowedOnFront(rs.getInt("is_html_allowed_on_front"));
        catalogEavAttribute.setIsUsedForPriceRules(rs.getInt("is_used_for_price_rules"));
        catalogEavAttribute.setIsFilterableInSearch(rs.getInt("is_filterable_in_search"));
        catalogEavAttribute.setUsedInProductListing(rs.getInt("used_in_product_listing"));
        catalogEavAttribute.setUsedForSortBy(rs.getInt("used_for_sort_by"));
        catalogEavAttribute.setIsConfigurable(rs.getInt("is_configurable"));
        catalogEavAttribute.setApplyTo(rs.getString("apply_to"));
        catalogEavAttribute.setIsVisibleInAdvancedSearch(rs.getInt("is_visible_in_advanced_search"));
        catalogEavAttribute.setPosition(rs.getInt("position"));
        catalogEavAttribute.setIsWysiwygEnabled(rs.getInt("is_wysiwyg_enabled"));
        catalogEavAttribute.setIsUsedForPromoRules(rs.getInt("is_used_for_promo_rules"));
        return catalogEavAttribute;
    }

}

