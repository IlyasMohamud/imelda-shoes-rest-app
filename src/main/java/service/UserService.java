package service;


import api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    /**
 * Tjenesteklassen `UserService` håndterer operasjoner knyttet til brukere.
 * Den er merket med `@Service` for å indikere at den skal håndteres av Spring som en tjeneste.
 * Inkluderer en liste over brukere initialisert ved opprettelse av tjenesten.
 * Metoden `getUser` søker etter en bruker med angitt ID i listen og returnerer en valgfri bruker.
 */

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "Sophia", 27, "sophia@gmail.com", null);
        User user2 = new User(2, "Noah", 40, "noah@yahoo.com", null);
        User user3 = new User(3, "Emma", 35, "emma@hotmail.com", null);
        User user4 = new User(4, "Liam", 30, "liam@gmail.com", null);

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
