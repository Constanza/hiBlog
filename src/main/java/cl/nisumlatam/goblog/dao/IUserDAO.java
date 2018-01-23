package cl.nisumlatam.goblog.dao;

import cl.nisumlatam.goblog.domain.User;

import java.util.List;

public interface IUserDAO {
    // CRUD
    List<User> loadAllUsers();
}
