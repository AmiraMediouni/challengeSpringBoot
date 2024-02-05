package com.example.challenge.services;

import com.example.challenge.entites.User;
import com.example.challenge.reponses.MessageResponse;
import com.example.challenge.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


@Service
public class UserService {
    /*@Autowired(required = false)
   private List<User> userList=new CopyOnWriteArrayList<>();*/
    @Autowired
    UserRepository userRepository;
    public List<User> userList=new CopyOnWriteArrayList<>();
    private int userIdCount=1;
    public List<User> getAllUsers(){
         return userRepository.findAll();
    }

    public User getUserByID(int id){
      /*  return userList
                .stream()
                .filter(c->c.getId()==id)
                .findFirst()
                .get();*/
        return userRepository.findById(id).get();
    }

    public User addNewUser(User user){
       /* user.setId(userIdCount);
        userList.add(user);
        userIdCount++;
        return user;*/
        return userRepository.save(user);
    }

    public User updateUserByID(int id, User user){
       /* userList
                .stream()
                .forEach(u->{
                    if(u.getId()==id){
                        u.setFirstName(user.getFirstName());
                        u.setLastName(user.getLastName());
                        u.setEmail(user.getEmail());
                        u.setPassword(user.getPassword());
                        u.setAge(user.getAge());
                    }
                });
        return userList
                .stream()
                .filter(u->u.getId()==id)
                .findFirst()
                .get();*/
        user.setId(id);
        return userRepository.save(user);

    }
    public MessageResponse deleteUserById(int id ){
        /*userList
                .stream()
                .forEach(u-> {
                    if (u.getId() == id) {
                        userList.remove(u);
                    }
                });
        return new MessageResponse("User deleted with success!");*/
        userRepository.deleteById(id);
        return new MessageResponse("User deleted with success!");


    }
}
