package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.UserRepository;
import com.example.demo.entity.User;
import org.springframework.stereotype.Service;
@Service
public class IUserService {
	@Autowired
	UserRepository userRepository;
	public void saveUser(User user) {
		userRepository.save(user);
		//comments
		
	}
	public Iterable<User> getUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
	public Optional<User> getUser(Integer id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
		
	}

}
