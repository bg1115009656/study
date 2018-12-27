//package com.dianmi.esign.config.secruity;
//
//
//import com.dianmi.esign.model.User;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//public final class JwtUserFactory {
//
//    private JwtUserFactory() {
//    }
//
//    public static JwtUser create(User user) {
//        return new JwtUser(
//                user.getId(),
//                user.getUsername(),
//                user.getPassword(),
//                //角色权限，暂时不加
//                null
//        );
//    }
//
//    private static List<GrantedAuthority> mapToGrantedAuthorities(List<String> authorities) {
//        return authorities.stream()
//                .map(SimpleGrantedAuthority::new)
//                .collect(Collectors.toList());
//    }
//}
//
