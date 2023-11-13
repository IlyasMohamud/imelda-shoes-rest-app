package main.java.service;

import main.java.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "Sophia", 27, "sophia@gmail.com");
        User user2 = new User(2, "Noah", 40, "noah@yahoo.com");
        User user3 = new User(3, "Emma", 35, "emma@hotmail.com");
        User user4 = new User(4, "Liam", 30, "liam@gmail.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4));
    }

    public Optional<User> getUser(Integer id) {
        Optional<User> optional = Optional.empty();
        for (User user: userList) {
            if(id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
