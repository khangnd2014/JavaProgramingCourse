package com.example.jstldemo.controller;

import com.example.jstldemo.model.User;
import com.example.jstldemo.model.UserDB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "showUserServlet", value = "/showuser")
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        Access to localhost:8080/showuser?id=khang

        * */
        String userId = req.getParameter("id");
        if (userId == null) {
            throw new ServletException("Not found UserId: " + userId);
        }

        UserDB userDB = UserDB.getInstance();
        User user = userDB.getUser(userId);

        if (user == null) {
            resp.setStatus(404);
            req.getRequestDispatcher("notfound.jsp").forward(req, resp);
            return;
        }

        req.setAttribute("model", user);
        req.getRequestDispatcher("showuser.jsp").forward(req, resp);
    }
}
