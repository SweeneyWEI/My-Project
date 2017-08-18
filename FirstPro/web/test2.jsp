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

<%
String name=(String)request.getAttribute("name");
out.write(name);
%>

</body>
</html>
