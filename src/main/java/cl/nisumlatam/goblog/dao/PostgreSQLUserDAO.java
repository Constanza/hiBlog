package cl.nisumlatam.goblog.dao;

import cl.nisumlatam.goblog.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostgreSQLUserDAO implements IUserDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void create(User user) {

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
        String sql = "SELECT * FROM tbl_user";
        RowMapper<User> rowMapper = (rs, rowNum) -> {
            String firstName = rs.getString("first_name");
            return new User();
        };

        List<User> user = jdbcTemplate.query(sql, rowMapper);
        return user;
    }
}
