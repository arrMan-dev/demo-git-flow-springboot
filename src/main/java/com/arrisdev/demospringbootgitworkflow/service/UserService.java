package com.arrisdev.demospringbootgitworkflow.service;

import com.arrisdev.demospringbootgitworkflow.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    public User createUser(User user){
        User user1 = new User();
        user1.setId(user.getId());
        user1.setName(user.getName());
        user1.setAge(user1.getAge());

        return user1;
    }
     public List<User> allUsers(){
        List<User> userList = new ArrayList<>();
         User user1 = new User();
         user1.setId(1);
         user1.setName("Arris");
         user1.setAge(40);

         User user2 = new User();
         user1.setId(2);
         user1.setName("Esther");
         user1.setAge(33);

         User user3 = new User();
         user1.setId(3);
         user1.setName("Brighel");
         user1.setAge(3);

         userList.add(user1);
         userList.add(user2);
         userList.add(user3);

         return userList;
     }
}
