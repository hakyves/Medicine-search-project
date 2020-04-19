package com.hak.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import com.hak.model.UserDto;
import com.hak.model.Users;
import com.hak.repo.UserRepo;


@Service(value = "userService")
public class UserService implements UserDetailsService {
	
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private BCryptPasswordEncoder bcryptEncoder;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Users user = userRepo.findByUsername(username);

		if (user == null) {
			throw new UsernameNotFoundException("Invalid username or password");
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				getAuthority(user));
	}

	private Set<SimpleGrantedAuthority> getAuthority(Users user) {
		Set<SimpleGrantedAuthority> authorities = new HashSet<>();
		user.getRoles().forEach(role->{
			authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getName()));

		});
		return authorities;

	}

	
	public List<Users> findAll() {
		List<Users> list = new ArrayList<>();
		userRepo.findAll().iterator().forEachRemaining(list::add);
		return list;
	}

	
	public void delete(long id) {
		userRepo.deleteById(id);

	}

	
	public Users findOne(String username) {
		return userRepo.findByUsername(username);

	}

	
	public Optional<Users> findById(Long id) {
		return userRepo.findById(id);
		 
	}

	
	public Users save(UserDto user) {
		Users newUser = new Users();
		newUser.setUsername(user.getUsername());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		newUser.setEmail(user.getEmail());     
		return userRepo.save(newUser);
	}

}
