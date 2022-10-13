package com.example.yx_login3.interceptor;

import com.auth0.jwt.exceptions.AlgorithmMismatchException;
import com.auth0.jwt.exceptions.InvalidClaimException;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.example.yx_login3.Utils.JWTUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class interceptor01 implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        try {
            String token = request.getParameter("token");
//            String token =  request.getHeader("token");//一般都将token放在请求头中
            JWTUtils jwtUtils = new JWTUtils();
            jwtUtils.verifyToken(token);
            return true;
        }catch (SignatureVerificationException e){
            e.printStackTrace();
        }catch (TokenExpiredException e){
            e.printStackTrace();
        }catch (AlgorithmMismatchException e){
            e.printStackTrace();
        }catch (InvalidClaimException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
