<%@ page language="java"  import="java.util.*" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="<%=basePath%>css/bootstrap.min.css">
    <script src="<%=basePath%>js/jquery-1.11.3.min.js"></script>
    <script src="<%=basePath%>js/bootstrap.min.js"></script>
    <title>考试报名</title>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="panel panel-default">
            <div class="panel-body">
                <div class="col-md-12 column">

                        <c:choose>
                            <c:when test="${List==null}"><span>查询考试发生异常</span></c:when>
                            <c:when test="${empty  List} "><span>没查到数据</span></c:when>
                            <c:otherwise>
                                编号<input type="text" value="${List.eNo}" name="sNo">
                                姓名<input type="text" value="${List.eName}" name="sName">
                                身份证号<input type="text" value="${List.sIdcard}" name="sIdcard">
                                <c:choose>
                                    <c:when test="${List.sSex==1}">
                                       性别<input type="text" value="男" name="sSex">
                                    </c:when>
                                    <c:otherwise>
                                        性别<input type="text" value="女" name="sSex">
                                    </c:otherwise>
                                </c:choose>
                                出生年月<input type="date" value="${List.sBirthday}" name="sBirthday">

                            </c:otherwise>
                        </c:choose>

                    <div class="col-md-12 text-right">
                        <navigationTag:page url="${pageContext.request.contextPath }/toCourse.action" />
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>