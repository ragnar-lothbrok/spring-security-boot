package com.demo.geek.security;

import java.util.ArrayList;
import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.demo.geek.domain.User;
import com.demo.geek.repository.UserRepository;

@Component
public class UserDetailsService implements
		org.springframework.security.core.userdetails.UserDetailsService {
	private final Logger log = LoggerFactory
			.getLogger(UserDetailsService.class);

	@Autowired
	private UserRepository userRepository;

	public UserDetails loadUserByUsername(String login)
			throws UsernameNotFoundException {
		log.debug("Authenticating {}", login);

		String lowercaseLogin = login.toLowerCase();
		User userDataBase = userRepository.findOne(lowercaseLogin);
		if (userDataBase == null) {
			throw new UsernameNotFoundException("User " + lowercaseLogin
					+ " was not found in the database");
		}
		Collection<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
		GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(
				Authorities.ROLE_USER.name());
		grantedAuthorities.add(grantedAuthority);

		return new org.springframework.security.core.userdetails.User(
				lowercaseLogin, userDataBase.getPassword(), grantedAuthorities);
	}
}
