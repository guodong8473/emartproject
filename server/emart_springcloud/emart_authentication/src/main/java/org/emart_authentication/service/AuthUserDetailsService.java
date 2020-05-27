package org.emart_authentication.service;

import java.util.ArrayList;
import java.util.List;

import org.emart_authentication.entity.BuyerEntity;
import org.emart_authentication.repository.BuyerRepository;
import org.emart_authentication.repository.SellerRepository;
import org.emart_authentication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class AuthUserDetailsService implements UserDetailsService{
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BuyerRepository buyerRepository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	public AuthUserDetailsService(UserRepository userRepository, BuyerRepository buyerRepository, SellerRepository sellerRepository) {
		this.userRepository = userRepository;
		this.buyerRepository = buyerRepository;
		this.sellerRepository = sellerRepository;
		
	}
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		BuyerEntity user = userRepository.findUserByUserName(username);
//		List<BuyerEntity> userList = (List<BuyerEntity>) buyerRepository.findAll();
//		BuyerEntity user = userList.get(0);
		//.findUserByUserName(username);
		if(user != null){
			List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
			authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
			
			return new User(user.getUser_name(), user.getPassword(), authorities);
		}
		
		throw new UsernameNotFoundException("User '" + username + "' not found.");
	}

}
