package cl.nisumlatam.goblog.dao;

import cl.nisumlatam.goblog.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MySQLUserDAO implements IUserDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void create(User user) {
        String sql = "INSERT INTO USER (first_name,last_name) VALUES (?,?)";
        jdbcTemplate.update(sql,user.getFirstName(),user.getLastName());
    }

    @Override
    public User read(String lastName) {
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(String lastName) {

    }

    @Override
    public List<User> loadAllUsers() {
        String sql = "SELECT * FROM USER";
        RowMapper<User> rowMapper = (rs, rowNum) -> {
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            return new User().setFirstName(firstName).setLastName(lastName);
        };

        //MyRowMapper rowMapper = new MyRowMapper();
        List<User> user = jdbcTemplate.query(sql, rowMapper);
        return user;
    }
}
