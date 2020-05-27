package org.emart_authentication.security;

import org.emart_authentication.repository.BuyerRepository;
import org.emart_authentication.repository.SellerRepository;
import org.emart_authentication.repository.UserRepository;
import org.emart_authentication.service.AuthUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.NegatedRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;

@Configuration
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BuyerRepository buyerRepository;
	@Autowired
	SellerRepository sellerRepository;
	
	private final static RequestMatcher AUTHENTICATION_ENDPOINT =
		      new AntPathRequestMatcher("/login");
	private final static RequestMatcher PROTECTED_REST_API_URLS =
		      new AntPathRequestMatcher("/user/**");
	private final static RequestMatcher PUBLIC_URLS =
		      new NegatedRequestMatcher(PROTECTED_REST_API_URLS);

	
	@Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	@Override
	@Bean
	public UserDetailsService userDetailsServiceBean() throws Exception {
		return super.userDetailsServiceBean();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication().withUser("user").password("user").roles("USER")
			.and().withUser("admin").password("admin").roles("USER", "ADMIN");
		
		auth.userDetailsService(new AuthUserDetailsService(userRepository, buyerRepository, sellerRepository));
	}
	  @Override
	  protected void configure(HttpSecurity http) throws Exception {
	    http
	        // Disable CSRF because of using JWT
	        .csrf().disable()
	        // Enable CORS
	        .cors().and()
	        // Set Session policy to STATELESS because of using JWT
	        .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
	        // Permit the authentication entdpoint
	        .authorizeRequests().requestMatchers(AUTHENTICATION_ENDPOINT).permitAll().and()
	        // JWT Authentication Filter
//	        .addFilterAfter(authenticationFilter, SecurityContextPersistenceFilter.class)
	        .authorizeRequests().requestMatchers(PROTECTED_REST_API_URLS).authenticated().and()
	        // Disable Basic Authentication
	        .httpBasic().disable()
	        // Disable Form Authentication
	        .formLogin().disable().logout().disable();
	  }
}
