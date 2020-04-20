package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Employee;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int i) throws SQLException {
        Employee employee = new Employee();
        employee.setIdEmployee(rs.getInt("id_employee"));
        employee.setIdProfile(rs.getInt("id_profile"));
        employee.setIdLang(rs.getInt("id_lang"));
        employee.setLastname(rs.getString("lastname"));
        employee.setFirstname(rs.getString("firstname"));
        employee.setEmail(rs.getString("email"));
        employee.setPasswd(rs.getString("passwd"));
        employee.setLastPasswdGen(rs.getTimestamp("last_passwd_gen").toLocalDateTime());
        employee.setStatsDateFrom(rs.getTimestamp("stats_date_from") != null ? rs.getTimestamp("stats_date_from").toLocalDateTime() : null);
        employee.setStatsDateTo(rs.getTimestamp("stats_date_to") != null ? rs.getTimestamp("stats_date_to").toLocalDateTime() : null);
        employee.setStatsCompareFrom(rs.getTimestamp("stats_compare_from") != null ? rs.getTimestamp("stats_compare_from").toLocalDateTime() : null);
        employee.setStatsCompareTo(rs.getTimestamp("stats_compare_to") != null ? rs.getTimestamp("stats_compare_to").toLocalDateTime() : null);
        employee.setStatsCompareOption(rs.getInt("stats_compare_option"));
        employee.setPreselectDateRange(rs.getString("preselect_date_range"));
        employee.setBoColor(rs.getString("bo_color"));
        employee.setBoTheme(rs.getString("bo_theme"));
        employee.setBoCss(rs.getString("bo_css"));
        employee.setDefaultTab(rs.getInt("default_tab"));
        employee.setBoWidth(rs.getInt("bo_width"));
        employee.setBoMenu(rs.getInt("bo_menu"));
        employee.setActive(rs.getInt("active"));
        employee.setOptin(rs.getInt("optin"));
        employee.setIdLastOrder(rs.getInt("id_last_order"));
        employee.setIdLastCustomerMessage(rs.getInt("id_last_customer_message"));
        employee.setIdLastCustomer(rs.getInt("id_last_customer"));
        employee.setLastConnectionDate(rs.getTimestamp("last_connection_date") != null ? rs.getTimestamp("last_connection_date").toLocalDateTime() : null);
        employee.setResetPasswordToken(rs.getString("reset_password_token"));
        employee.setResetPasswordValidity(rs.getTimestamp("reset_password_validity") != null ? rs.getTimestamp("reset_password_validity").toLocalDateTime() : null);
        return employee;
    }

}

