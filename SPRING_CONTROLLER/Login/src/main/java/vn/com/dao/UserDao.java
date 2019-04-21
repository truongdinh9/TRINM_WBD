package vn.com.dao;

import vn.com.model.Login;
import vn.com.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;

    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(10);
        u1.setName("Hung");
        u1.setAccount("hung");
        u1.setEmail("Hung@codegym.vn");
        u1.setPassword("12345");
        users.add(u1);

        User u2 = new User();
        u2.setAge(12);
        u2.setName("Nam");
        u2.setAccount("nam");
        u2.setEmail("nam@gmail.com");
        u2.setPassword("12345");
        users.add(u2);
    }

    public static User checkLogin(Login login) {
        for (User u : users) {
            if (u.getAccount().equals(login.getAccount())
                    && u.getPassword().equals(login.getPassword())) {
                return u;
            }
        }
        return null;
    }
}
