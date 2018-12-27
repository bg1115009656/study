//package com.dianmi.esign.config.secruity;
//
//import com.dianmi.esign.core.BaseException;
//import com.dianmi.esign.dao.UserMapper;
//import com.dianmi.esign.model.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.Resource;
//
//@Service
//public class JwtUserDetailsServiceImpl implements UserDetailsService {
//    @Resource
//    private UserMapper userMapper;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userMapper.selectOne(User.builder().username(username).build());
//        if (user == null) {
//            throw new BaseException(String.format("No user found with username '%s'.", username));
//        } else {
//            return JwtUserFactory.create(user);
//        }
//    }
//}
