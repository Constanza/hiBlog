package cl.nisumlatam.goblog.dao;

import cl.nisumlatam.goblog.domain.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MyRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");

        return new User().setFirstName(firstName).setLastName(lastName);
    }
}
