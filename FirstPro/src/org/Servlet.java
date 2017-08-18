package org;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by weixin on 17-8-15.
 */
@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String uname = request.getParameter("uname").trim();
        String upwd = request.getParameter("upwd").trim();
        String newpwd = request.getParameter("newpwd").trim();
//        System.out.println(uname + " "+upwd +" "+ newpwd);
        if(uname.equals("1154416503@qq.com")&&upwd.equals("123456")) {
            response.getWriter().write(uname+upwd);
        }
        else response.getWriter().write("0");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
