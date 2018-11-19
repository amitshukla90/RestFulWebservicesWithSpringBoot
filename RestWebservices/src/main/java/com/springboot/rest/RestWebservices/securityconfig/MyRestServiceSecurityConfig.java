package com.springboot.rest.RestWebservices.securityconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class MyRestServiceSecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private MyRestServiceEntryPoint myRestServiceEntryPoint;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests().antMatchers("/login/**").permitAll().anyRequest().authenticated();
		http.httpBasic().authenticationEntryPoint(myRestServiceEntryPoint);
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	    auth.inMemoryAuthentication().withUser("amit").password("$2a$04$i3j2UTi/UfPQKRxZRyHsje0YTMBypN62zY4keWq22VDN7KNPdNKJS").roles("USER");
	}
	
	
	@Bean
	public BCryptPasswordEncoder encoder() {
	    return new BCryptPasswordEncoder();
	}
}
