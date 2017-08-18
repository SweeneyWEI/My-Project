package org;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by weixin on 17-8-18.
 */
@WebServlet(name = "Servlet3")
public class Servlet3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/x-msdownload");
//        String filename=request.getParameter("newfile.txt");
        File file=new File("/home/weixin/newfile.txt");
        InputStream inputStream=new FileInputStream(file);
        ServletOutputStream outputStream=response.getOutputStream();
        byte[] bytes=new byte[1024];
        int hasRead=0;
        while((hasRead=inputStream.read(bytes))!=-1){
            outputStream.write(bytes,0,hasRead);
            outputStream.flush();
            outputStream.close();
            inputStream.close();
        }
    }
}
