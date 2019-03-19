package com.opendevup.sec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityCongif extends WebSecurityConfigurerAdapter {

	@Autowired
	private javax.sql.DataSource dataSource;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("habib").password("123").roles("ADMIN", "USER");
		auth.inMemoryAuthentication().withUser("kristelle").password("123").roles("USER");

		/*auth.jdbcAuthentication().dataSource(dataSource)
				.usersByUsernameQuery(
						"select username as principal, pass as credentials, active from users where username = ?")
				.authoritiesByUsernameQuery(
						"select username as principal, role as role from users_roles where username = ?")
				.rolePrefix("ROLE_");*/
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.formLogin();
		//http.formLogin().loginPage("/login");
		//http.authorizeRequests().anyRequest().authenticated();
		//http.authorizeRequests().antMatchers("/saveUser").hasRole("ADMIN");
		http.authorizeRequests().antMatchers("/reservation").hasRole("USER");
	}

}
