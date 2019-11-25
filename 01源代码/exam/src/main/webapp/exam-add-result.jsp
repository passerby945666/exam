<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>新增考试-结果</title>
</head>
<body>
<c:choose>
    <c:when test="${1==param.rows}">
        <span>新增成功</span>
    </c:when>
    <c:when test="${-1==param.rows}">
        <span>新增失败服务器异常</span>
    </c:when>
    <c:otherwise><span>新增失败返回未知状态</span></c:otherwise>
</c:choose>
<a href="/exam-add.jsp">继续添加</a>
</body>
</html>
