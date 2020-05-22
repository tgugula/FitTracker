package pl.edu.wszib.dao.impl;

import org.springframework.stereotype.Repository;
import pl.edu.wszib.dao.UserDao;
import pl.edu.wszib.domain.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserDaoImpl implements UserDao {

    private Map<Long, User> userMap;
    private static Long id = 1L;

    public UserDaoImpl() {
        this.userMap = new HashMap<>();
        showUser();
    }


    @Override
    public List<User> getUsers() {
        return new ArrayList<>(userMap.values());
    }

    @Override
    public void saveUser(User user) {
      if (user.getId() < 1){
          user.setId(id);
          id++;
      }

        userMap.put(user.getId(), user);
    }

    @Override
    public User getById(Long id) {
        return userMap.get(id);
    }

    private void showUser() {
        User user = new User();
        user.setName("Tomasz");
        user.setSurname("Kot");
        user.setEmail("tomaszkot@gmail.com");
        user.setAge(32);
        user.setHeight(1.99);
        user.setWeight(80);
        saveUser(user);

    }
}
