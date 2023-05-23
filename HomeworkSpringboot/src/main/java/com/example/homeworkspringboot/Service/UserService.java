package com.example.homeworkspringboot.Service;


import com.example.homeworkspringboot.Model.User;
import com.example.homeworkspringboot.Repository.UserRepository;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User addUsers(User user){
        return userRepository.save(user);
    }


    public boolean updateUsers(Integer id , User user) {
        User oldUser = userRepository.getById(id);
        if( oldUser == null)
            return false;
        oldUser.setAge(user.getAge());
        oldUser.setName(user.getName());
        oldUser.setRole(user.getRole());
        oldUser.setEmail(user.getEmail());
        oldUser.setUsername(user.getUsername());
        oldUser.setPassword(user.getPassword());
        userRepository.save(oldUser);
        return true;
    }

    public boolean deleteUser (Integer id){
        if (userRepository.getById(id) == null)
            return false;
        userRepository.deleteById(id);
        return true;
    }
}
