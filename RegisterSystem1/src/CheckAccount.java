import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class CheckAccount extends HttpServlet {
    //因为登录表单是以get方式提交的，所以重写doGet方法，运行时调用此方法
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userName=request.getParameter("username");//获取用户名
        HttpSession session = request.getSession();
        session.setAttribute("username",userName); //用户名写入session，
        String passWord=request.getParameter("password");
        session.setAttribute("password",passWord);//获取口令

        if(userName.equals("jsp")&&passWord.equals("1")) //用户名和密码正确
            response.sendRedirect("success.jsp"); //重定向到留言页面
        else
            response.sendRedirect("fail.jsp");
    }
}
