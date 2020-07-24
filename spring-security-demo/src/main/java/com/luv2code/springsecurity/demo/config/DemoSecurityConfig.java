package com.luv2code.springsecurity.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private DataSource securityDataSource;
	
	@Autowired
	private UsernamePasswordAuthenticationProvider userPwdAuthProvider;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {		
		//auth.authenticationProvider(userPwdAuthProvider);
		auth.jdbcAuthentication().dataSource(securityDataSource);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		//super.configure(http);
		
		http
			.authorizeRequests()
				.antMatchers("/leaders/**").hasAnyRole("MANAGER")
				.antMatchers("/systems/**").hasAnyRole("ADMIN")
				.anyRequest().authenticated()
			.and()
				.formLogin().permitAll()
			.and()
				.exceptionHandling().accessDeniedPage("/access-denied");
			//.and()
				//.logout();
		
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception{
		// web.ignoring().antMatchers("/");
	}
}
