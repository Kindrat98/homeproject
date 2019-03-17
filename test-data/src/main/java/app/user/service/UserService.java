package app.user.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import app.user.own.User;
import java.net.InetAddress;

@Service
public class UserService {
    @Value("${max.age}")
    private Integer maxAge;

    public User getDefaultUser(){
        return User
                .builder().age(10.0).lastName("Korol").name("Ivan")
                .build();
    }

    public Integer getMaxAge(){
        return maxAge;

    }

}
