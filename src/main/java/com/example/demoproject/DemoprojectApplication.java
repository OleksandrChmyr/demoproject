package com.example.demoproject;

import com.example.demoproject.entity.User;
import com.example.demoproject.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;

@Slf4j
@SpringBootApplication
public class DemoprojectApplication {

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(DemoprojectApplication.class, args);
        log.info("Final log");
    }

    @PostConstruct
    public void postConstruct() {
        List<User> users = userService.getAll();

        for (User user : users) {
            log.info(String.format("\n Name: %s \n LastName: %s \n E-mail: %s", user.getFirstName(),
                    user.getLastName(), user.getEmail()));
        }
    }
}



