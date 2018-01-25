package cl.nisumlatam.goblog.service;

import cl.nisumlatam.goblog.dao.IUserDAO;
import cl.nisumlatam.goblog.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    @Qualifier("mySQLUserDAO")
    IUserDAO userDAO;

    @Override
    @Transactional
    public List<User> loadAllUsers() {
        return userDAO.loadAllUsers();
    }

    @Override
    public void create(User user) {
        userDAO.create(user);
    }
}
