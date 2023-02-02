package com.restapi.spring.securityservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.restapi.spring.entity.User;
import com.restapi.spring.entity.UserDetailsJwt;
import com.restapi.spring.repository.UsersRepo;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private UsersRepo userrepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
	
	Optional<User> user=userrepo.findByEmailId(username);
	if(user.isPresent() && user.get().getEmailId().equals(username)) {
		UserDetailsJwt res = new UserDetailsJwt(username,user.get().getPassword());
		return res;
	}
	return null;
}
}
