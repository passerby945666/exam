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
    <title>个人信息</title>
</head>
<body>
<div>
<c:choose>
    <c:when test="${stu==null}"><span>查询考试发生异常</span></c:when>
    <c:when test="${empty  stu} "><span>没查到数据</span></c:when>
    <c:otherwise>
        <div style="text-align: center;">
            <h3>个人信息</h3>
        </div>
        <div style="margin-left: 10%;position: absolute;">
            <div style="width:40%;float: left;margin-bottom: 20px;">
                <input type="button" readonly="readonly" style="width: 40%;" value="考生编号" />
                <input type="text" readonly="readonly" style="width: 55%;background-color:#ECECEC;" value="${stu.sNo}"/>
            </div>
            <div style="width:40%;float: left;margin-bottom: 20px;margin-left: 50px;">
                <input type="button" readonly="readonly" style="width: 40%;" value="考生姓名" />
                <input type="text" readonly="readonly" style="width: 55%;background-color:#ECECEC;" value="${stu.sName}"/>
            </div>
            <c:choose>
                <c:when test="${stu.sSex==1}">
                    <div style="width:40%;float: left;margin-bottom: 20px;">
                        <input type="button" readonly="readonly" style="width: 40%;" value="性别" />
                        <input type="text" readonly="readonly" style="width: 55%;background-color:#ECECEC;" value="男"/>
                    </div>
                </c:when>
                <c:otherwise>
                    <div style="width:40%;float: left;margin-bottom: 20px;">
                        <input type="button" readonly="readonly" style="width: 40%;" value="性别" />
                        <input type="text" readonly="readonly" style="width: 55%;background-color:#ECECEC;" value="女"/>
                    </div>
                </c:otherwise>
            </c:choose>
            <div style="width:40%;float: left;margin-bottom: 20px;margin-left: 50px;">
                <input type="button" readonly="readonly" style="width: 40%;" value="身份证号码" />
                <input type="text" readonly="readonly" style="width: 55%;background-color:#ECECEC;" value="${stu.sIdcard}"/>
            </div>
            <div style="width:40%;float: left;">
                <input type="button" readonly="readonly" style="width: 40%;" value="出生年月" />
                <input type="text" readonly="readonly" style="width: 55%;background-color:#ECECEC;" value="${stu.sBirthday}"/>
            </div>
            <div style="width:40%;float: left;margin-bottom: 20px;margin-left: 50px;">
                <input type="button" readonly="readonly" style="width: 95%;" value="修改信息" />
            </div>
        </div>
    </c:otherwise>
</c:choose>
</div>
</body>
</html>