//package com.dianmi.esign.config.secruity;
//
//import com.dianmi.esign.core.ResultGenerator;
//import com.dianmi.esign.util.JacksonUtil;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.AuthenticationEntryPoint;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.Serializable;
//
//@Component
//public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {
//
//    private static final long serialVersionUID = -8970718410437077606L;
//
//    @Override
//    public void commence(HttpServletRequest request,
//                         HttpServletResponse response,
//                         AuthenticationException authException) throws IOException {
//        //  response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
//        //认证失败返回
//        String json = JacksonUtil.pojo2Json(ResultGenerator.genFailResult("登陆失效"));
//        response.setContentType("application/json; charset=utf-8");
//        response.setCharacterEncoding("UTF-8");
//        response.getWriter().write(json);
//    }
//}
