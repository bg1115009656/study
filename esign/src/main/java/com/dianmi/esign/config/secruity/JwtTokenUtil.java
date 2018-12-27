//package com.dianmi.esign.config.secruity;
//
//import com.dianmi.esign.model.User;
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Component;
//
//import java.io.Serializable;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//
//@Component
//public class JwtTokenUtil implements Serializable {
//
//    public static final String CLAIM_KEY_ID = "id";
//    public static final String CLAIM_KEY_ACCOUNT = "sub";
//    public static final String CLAIM_KEY_NAME = "name";
//    public static final String CLAIM_KEY_CREATED = "created";
//
//    private static final long serialVersionUID = -3301605591108950415L;
//
//    @Value("${jwt.secret}")
//    private String secret;
//
//    @Value("${jwt.expiration}")
//    private Long expiration;
//
//
//    public String generateToken(User user) {
//        Map<String, Object> claims = new HashMap<>();
//        claims.put(CLAIM_KEY_ACCOUNT, user.getUserNo());
//        claims.put(CLAIM_KEY_ID, user.getId());
//        claims.put(CLAIM_KEY_NAME, user.getName());
//        claims.put(CLAIM_KEY_CREATED, new Date());
//        return generateToken(claims);
//    }
//
//    private String generateToken(Map<String, Object> claims) {
//        return Jwts.builder()
//                .setClaims(claims)
//                .setExpiration(generateExpirationDate())
//                .signWith(SignatureAlgorithm.HS512, secret)
//                .compact();
//    }
//
//    private Date generateExpirationDate() {
//        return new Date(System.currentTimeMillis() + expiration * 1000);
//    }
//
//    public String getUsernameFromToken(String token) {
//        String username;
//        try {
//            final Claims claims = getClaimsFromToken(token);
//            username = claims.getSubject();
//        } catch (Exception e) {
//            username = null;
//        }
//        return username;
//    }
//
//    public Boolean validateToken(String token, UserDetails userDetails) {
//        JwtUser user = (JwtUser) userDetails;
//        final String username = getUsernameFromToken(token);
//        final Date created = getCreatedDateFromToken(token);
//        //final Date expiration = getExpirationDateFromToken(token);
//        return (
//                username.equals(user.getUsername())
//                        && !isTokenExpired(token));
//    }
//
//    private Boolean isTokenExpired(String token) {
//        final Date expiration = getExpirationDateFromToken(token);
//        return expiration.before(new Date());
//    }
//
//    public Date getExpirationDateFromToken(String token) {
//        Date expiration;
//        try {
//            final Claims claims = getClaimsFromToken(token);
//            expiration = claims.getExpiration();
//        } catch (Exception e) {
//            expiration = null;
//        }
//        return expiration;
//    }
//
//    public Date getCreatedDateFromToken(String token) {
//        Date created;
//        try {
//            final Claims claims = getClaimsFromToken(token);
//            created = new Date((Long) claims.get(CLAIM_KEY_CREATED));
//        } catch (Exception e) {
//            created = null;
//        }
//        return created;
//    }
//
//    public Claims getClaimsFromToken(String token) {
//        Claims claims;
//        try {
//            claims = Jwts.parser()
//                    .setSigningKey(secret)
//                    .parseClaimsJws(token)
//                    .getBody();
//        } catch (Exception e) {
//            claims = null;
//        }
//        return claims;
//    }
//
//}
//
