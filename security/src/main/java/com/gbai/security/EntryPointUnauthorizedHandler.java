package com.gbai.security;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: security
 * @description:
 * @author: gbai
 * @create: 2018-07-06 18:23
 **/
@Component
public class EntryPointUnauthorizedHandler implements AuthenticationEntryPoint  {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setStatus(401);
    }
}
