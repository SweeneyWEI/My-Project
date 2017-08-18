<%--
  Created by IntelliJ IDEA.
  User: weixin
  Date: 17-8-18
  Time: 下午4:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
<html>
<head>
    <title>Title</title>
</head>
<body>
<%request.setAttribute("name","魏鑫");
request.getRequestDispatcher("test2.jsp").forward(request,response);
//    response.sendRedirect("test2.jsp");//传不过去
%>


</body>
</html>
