package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Guest;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GuestMapper implements RowMapper<Guest> {

    @Override
    public Guest mapRow(ResultSet rs, int i) throws SQLException {
        Guest guest = new Guest();
        guest.setIdGuest(rs.getInt("id_guest"));
        guest.setIdOperatingSystem(rs.getInt("id_operating_system"));
        guest.setIdWebBrowser(rs.getInt("id_web_browser"));
        guest.setIdCustomer(rs.getInt("id_customer"));
        guest.setJavascript(rs.getInt("javascript"));
        guest.setScreenResolutionX(rs.getInt("screen_resolution_x"));
        guest.setScreenResolutionY(rs.getInt("screen_resolution_y"));
        guest.setScreenColor(rs.getInt("screen_color"));
        guest.setSunJava(rs.getInt("sun_java"));
        guest.setAdobeFlash(rs.getInt("adobe_flash"));
        guest.setAdobeDirector(rs.getInt("adobe_director"));
        guest.setAppleQuicktime(rs.getInt("apple_quicktime"));
        guest.setRealPlayer(rs.getInt("real_player"));
        guest.setWindowsMedia(rs.getInt("windows_media"));
        guest.setAcceptLanguage(rs.getString("accept_language"));
        guest.setMobileTheme(rs.getInt("mobile_theme"));
        return guest;
    }

}

