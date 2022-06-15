package web.config;

import org.springframework.stereotype.Component;
import web.model.User;
import web.service.UserService;

import javax.annotation.PostConstruct;

@Component
public class InitUsers {

    private UserService userService;

    public InitUsers(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    public void initMethod() {
        userService.addUser(new User("Aleksandr", "Pushkin"));
        userService.addUser(new User("Mikhail", "Lermontov"));
    }
}
