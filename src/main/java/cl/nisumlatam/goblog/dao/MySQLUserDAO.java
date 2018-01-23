package cl.nisumlatam.goblog.dao;

import cl.nisumlatam.goblog.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MySQLUserDAO implements IUserDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<User> loadAllUsers() {
        String sql = "SELECT * FROM users";
//        RowMapper<User> rowMapper = (rs, rowNum) -> {
//            String firstName = rs.getString("first_name");
//            return new User().setFirstName(firstName).setLastName("Castillo");
//        };

        MyRowMapper rowMapper = new MyRowMapper();
        List<User> user = jdbcTemplate.query(sql, rowMapper);
        return user;
    }
}
