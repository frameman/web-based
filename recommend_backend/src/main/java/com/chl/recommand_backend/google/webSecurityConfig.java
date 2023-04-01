package com.chl.recommand_backend.google;
import com.chl.recommand_backend.checking.Is_new_User;
import com.chl.recommand_backend.sql.userdb;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import java.io.IOException;
@Configuration
@EnableWebSecurity
public class webSecurityConfig {
        @Bean
        public PasswordEncoder passwordEncoder() {
            return new BCryptPasswordEncoder();
       }



        @Bean
        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
            http.csrf().disable();
            http
                    .authorizeHttpRequests().requestMatchers("/class").authenticated()
                    .anyRequest().permitAll()
                    .and()
                    //.authorizeHttpRequests().requestMatchers("/class").hasRole("USER")
                    //.and()
                    //.authorizeHttpRequests().requestMatchers("/**").permitAll()
                    //.anyRequest()
                    //.authenticated()
                    //.and()
                    //.exceptionHandling().accessDeniedPage("/404")//when it is error redirect to this page
                    // .and()
                    //.formLogin()
                    //.loginPage("/login.html")
                    .oauth2Login()
                    .userInfoEndpoint()
                    .and()
                    .successHandler(new AuthenticationSuccessHandler() {
                    @Override
                    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
                        CustomerOAuth2User oauth2 = (CustomerOAuth2User) authentication.getPrincipal();
                        String email = oauth2.getEmail();
                        if (newUser.check(email) == null){
                            newUser.addemail(email);
                            response.sendRedirect("/info");
                        }
                        else {
                        response.sendRedirect("/class");}
                    }
                });
            return http.build();
        }
    @Autowired
    private Is_new_User newUser;
      @Autowired
      private OAuth2UserService oAuth2UserService;
   }

