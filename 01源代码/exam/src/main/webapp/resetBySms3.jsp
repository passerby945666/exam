<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/22
  Time: 21:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>操作结果页面</title>
</head>
<body>
<c:choose>
    <c:when test="${1==param.rows}">
        <span style="color:rgb(0,0,255)">修改成功</span>
    </c:when>
    <c:when test="${0==param.rows}">
        <span style="color:rgb(255,0,0)">操作失败,服务器异常</span>
    </c:when>
    <c:otherwise>
        <span style="color:rgb(219,99,48)">服务器返回未知的状态</span>
    </c:otherwise>
</c:choose>
<a href="/login.jsp">返回登录</a>
</body>
</html>