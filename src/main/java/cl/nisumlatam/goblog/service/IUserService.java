package cl.nisumlatam.goblog.service;

import cl.nisumlatam.goblog.domain.User;

import java.util.List;

public interface IUserService {
    List<User> loadAllUsers();

    void create(User user);
}
