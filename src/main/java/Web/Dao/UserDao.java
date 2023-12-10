package Web.Dao;

import Web.Models.User;


import java.util.List;


public interface UserDao {
    List<User> allUsers();
    void addUser(User user);
    void removeUser(int id);
    User showUser(int id);
    void updateUserParams(int id, User user);


}
