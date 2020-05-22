package pl.edu.wszib.dao;
import pl.edu.wszib.domain.User;
import java.util.List;


public interface UserDao {
    List<User> getUsers();
    void saveUser(User user);
    User getById(Long id);
}
