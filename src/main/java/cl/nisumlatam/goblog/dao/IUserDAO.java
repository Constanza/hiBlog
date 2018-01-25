package cl.nisumlatam.goblog.dao;

import cl.nisumlatam.goblog.domain.User;

import java.util.List;

public interface IUserDAO {
    // CRUD
    void create(User user);
    User read(String lastName);
    void update(User user);
    void delete(String lastName);
    List<User> loadAllUsers();
}
