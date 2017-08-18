package org;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;

/**
 * Created by weixin on 17-8-18.
 */
@WebServlet(name = "Servlet2")
public class Servlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        InputStream inputStream=request.getInputStream();
        File file=new File("/home/weixin/newfile.txt");
        FileOutputStream outputStream=new FileOutputStream(file);
        byte[] bytes=new byte[1024];
        int hasRead=0;
        while((hasRead=inputStream.read(bytes))!=-1){
            outputStream.write(bytes,0,hasRead);
        }
        outputStream.flush();
        outputStream.close();
        inputStream.close();

        request.getRequestDispatcher("filedemo.html").forward(request,response);

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}