package com.example.yx_login3.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.example.yx_login3.service.LoginServicelmp.LoginServicelmp;
import com.example.yx_login3.Utils.JWTUtils;
import com.example.yx_login3.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {
        @Resource
        LoginServicelmp myBatisDemo;

        @RequestMapping("/register")
        public Map<String, Object> register(User user) throws IOException {
                Map<String,Object> resultmap = new HashMap<>();
                User user1 = myBatisDemo.check(user.getUsername(),user.getPassword());

                if(user1 != null){
                        //将获取到的user信息封装到usermap中
                        Map<String,String> usermap = new HashMap<>();
                        usermap.put("username",user1.getUsername());
                        //使用JWT工具类获取token
                        JWTUtils jwtUtils = new JWTUtils();
                        String token = jwtUtils.getToken(usermap);
                        //将token返回到前端
                        resultmap.put("token",token);
                        resultmap.put("status","true");
                }else{
                        resultmap.put("status","false");
                }
                return resultmap;
                }

        @RequestMapping("/test")
        public String test(HttpServletRequest request, HttpServletResponse response){
                //获取token
                String token = request.getParameter("token");
                //获取DecodedJWT对象
                JWTUtils jwtUtils = new JWTUtils();
                DecodedJWT decodedJWT = jwtUtils.verifyToken(token);
                //获取DecodedJWT对象里的payload信息
                String username = decodedJWT.getClaim("username").asString();
                return username+"token的登录验证，成功";
        }





}
