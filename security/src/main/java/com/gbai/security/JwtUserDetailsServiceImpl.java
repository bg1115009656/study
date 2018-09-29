package com.gbai.security;

import com.gbai.dao.IUserRepository;
import com.gbai.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

/**
 * @program: security
 * @description:
 * @author: gbai
 * @create: 2018-07-06 18:20
 **/
@Component
public class JwtUserDetailsServiceImpl implements UserDetailsService {
    private IUserRepository userRepository;

    @Autowired
    public JwtUserDetailsServiceImpl(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
        } else {
            return new JwtUser(user.getUsername(), user.getPassword(), user.getRoles().stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList()));
        }
    }
}
