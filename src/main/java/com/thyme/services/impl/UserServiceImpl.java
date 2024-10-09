package com.thyme.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.thyme.entities.User;
import com.thyme.payloads.UserDto;
import com.thyme.repositories.UserRepo;
import com.thyme.services.UserService;


public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDto createUser(UserDto userDto) {
		
		User user = this.dtoUser(userDto);
		
		User savedUser = this.userRepo.save(user);
		
		return this.userToDto(savedUser);
	}

	@Override
	public UserDto updateUser(UserDto user, Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub

	}
	
	public User dtoUser(UserDto userDto) {
		
		User user = new User();
		user.setId(userDto.getId());
		user.setName(user.getName());
		user.setEmail(userDto.getEmail());
		user.setAbout(userDto.getAbout());
		user.setPassword(userDto.getPassword());
		user.setRole(userDto.getRole());
		user.setImageURL(userDto.getImageURL());
		
		return user;
	}
	
	
public UserDto userToDto(User user) {
		
		UserDto userDto = new UserDto();
		userDto.setId(userDto.getId());
		userDto.setName(user.getName());
		userDto.setEmail(userDto.getEmail());
		userDto.setAbout(userDto.getAbout());
		userDto.setPassword(userDto.getPassword());
		userDto.setRole(userDto.getRole());
		userDto.setImageURL(userDto.getImageURL());
		
		return userDto;
	}

}
