package com.gbai.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.expression.method.MethodSecurityExpressionHandler;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.security.oauth2.provider.expression.OAuth2MethodSecurityExpressionHandler;

/**
 * @program: study
 * @description:
 * @author: gbai
 * @create: 2018-09-11 17:11
 **/
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter
{
    //自定义UserDetailsService注入
    @Autowired
    private OathUser userDetailsService;
    //配置匹配用户时密码规则
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new StandardPasswordEncoder();
    }
    //配置全局设置
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        //设置UserDetailsService以及密码规则
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }
    //排除/hello路径拦截
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/hello");
    }
    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
    //开启全局方法拦截
    @EnableGlobalMethodSecurity(prePostEnabled = true, jsr250Enabled = true)
    public static class GlobalSecurityConfiguration extends GlobalMethodSecurityConfiguration {
        @Override
        protected MethodSecurityExpressionHandler createExpressionHandler() {
            return new OAuth2MethodSecurityExpressionHandler();
        }

    }
}
