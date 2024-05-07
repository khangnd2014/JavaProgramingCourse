package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class ParamsController {

    @Autowired
    HttpServletRequest req;

    @Autowired
    HttpServletResponse res;

    @Autowired
    HttpSession session;

    @Autowired
    ServletContext context;

    @RequestMapping("/bai4.2")
    public String params(@CookieValue(name = "user", defaultValue = "null") String user) {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println("username: " + username);
        System.out.println("password: " + password);
        System.out.println("user    : " + user);
        return "success";
    }

    @RequestMapping("/bai4.3")
    public String param2() {

        req.setAttribute("request", "Attribute's Request");
        session.setAttribute("session", "Content of session");
        context.setAttribute("context", "Context data");

        return "params";
    }


}
