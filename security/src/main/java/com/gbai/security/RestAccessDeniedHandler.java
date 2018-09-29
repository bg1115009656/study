package com.gbai.security;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: security
 * @description:
 * @author: gbai
 * @create: 2018-07-06 18:24
 **/
public class RestAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException e) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setStatus(403);
    }
}
