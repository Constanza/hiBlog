package cl.nisumlatam.goblog.controller;

import cl.nisumlatam.goblog.dao.IUserDAO;
import cl.nisumlatam.goblog.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    @Qualifier("mySQLUserDAO")
    IUserDAO userDAO;

    //CRUD
    @GetMapping("/users")
    public ResponseEntity<List<User>> loadAlUsers() {
        List<User> users = userDAO.loadAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
