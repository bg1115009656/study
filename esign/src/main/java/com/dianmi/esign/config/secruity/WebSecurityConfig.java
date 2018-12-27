//package com.dianmi.esign.config.secruity;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import javax.annotation.Resource;
//
//@SuppressWarnings("SpringJavaAutowiringInspection")
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//    @Resource
//    private JwtAuthenticationEntryPoint authenticationEntryPoint;
//
//    @Bean
//    public JwtAuthenticationTokenFilter  authenticationTokenFilterBean() throws Exception {
//        return new JwtAuthenticationTokenFilter();
//    }
//
//    @Override
//    protected void configure(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity
//                .exceptionHandling()
//                .authenticationEntryPoint(authenticationEntryPoint)   //配置401 未授权页面
//                .and()
//                .addFilterAfter(authenticationTokenFilterBean(), UsernamePasswordAuthenticationFilter.class)
//                .csrf().disable().authorizeRequests()
//                // swagger start
//                .antMatchers("/swagger-ui.html").permitAll()
//                .antMatchers("/swagger-resources/**").permitAll()
//                .antMatchers("/images/**").permitAll()
//                .antMatchers("/webjars/**").permitAll()
//                .antMatchers("/v2/*").permitAll()
//                .antMatchers("/configuration/*").permitAll()
//                // 对于获取token的rest api要允许匿名访问
////                .antMatchers("/user/checkWeixinValid/**").permitAll()
//                .antMatchers("/user/login/**").permitAll()
////                .antMatchers("/user/bindWx/**").permitAll()
////                .antMatchers("/user/loginWx/**").permitAll()
//                // 对于 下载模板 允许匿名
////                .antMatchers("/files/downLoadTemplate/**").permitAll()
////                .antMatchers("/files/downLoadFile/**").permitAll()
//                // swagger end
//                .anyRequest().authenticated() //所有请求需要身份认证
//                .and()
//                // 禁用Session
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//
//        // 禁用缓存
//        httpSecurity.headers().cacheControl();
//    }
//}
