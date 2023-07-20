package com.discoclient.com.discoclient.security;


import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;

@EnableGlobalMethodSecurity(securedEnabled=true, prePostEnabled=true)
@EnableWebSecurity
public class WebSecurity  {
	
	protected void configure(HttpSecurity http) throws Exception {
		
		JwtAuthenticationConverter jwtAuthenticationConverter = new JwtAuthenticationConverter();
		jwtAuthenticationConverter.setJwtGrantedAuthoritiesConverter(new KeycloakRoleConverter());
	 
		http
			.authorizeRequests()
					.requestMatchers(HttpMethod.GET, "/users/status/check") 
					//.hasAuthority("SCOPE_profile")
					.hasRole("developer")
					//.hasAnyAuthority("ROLE_developer")
					//.hasAnyRole("devleoper","user")
				.anyRequest().authenticated()
				.and()
			.oauth2ResourceServer()
			.jwt()
			.jwtAuthenticationConverter(jwtAuthenticationConverter);
	}
	
}