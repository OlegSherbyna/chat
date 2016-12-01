



package com.project.servlet;

import com.project.utils.ServletUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/logOut"})
public class LogOutServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public LogOutServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      /*  Set<User> users = (Set<User>) getServletContext().getAttribute("onlineUserSet");
        for(User i : users){
            if(i.getLogin().equals(request.getParameter("login"))){
                ((Set<User>) getServletContext().getAttribute("onlineUserSet")).remove(i);
                break;
            }
        }*/

        ServletUtils.instanse.redirect(request, response, getServletContext(), "/WEB-INF/views/login.jsp");


    }
}


