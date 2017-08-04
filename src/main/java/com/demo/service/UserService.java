/**
 * 
 */
package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.User;
import com.demo.repository.UserRepository;

/**
 * @author khoada
 *
 */
@Service
public class UserService  {
    @Autowired
    private UserRepository userRepository;

    public Iterable<User> findAllUser() {
        return userRepository.findAll();
    }
    
    public Iterable<User> findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    
    public void addNewUser(String name, String email, String about) {
		User u = new User();
		u.setName(name);
		u.setEmail(email);
		u.setAbout(about);
    	userRepository.save(u);
    }
}
