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
<br>
<br>
<br>
<div style="margin-left: 15%;">
    <c:choose>
        <c:when test="${List==null}"><span>查询考试发生异常</span></c:when>
        <c:when test="${empty  List} "><span>没查到数据</span></c:when>
        <c:otherwise>
            <table style="margin-left: 25%; width: 50%;text-align-last: center" border="3">
                <tr><th colspan="2"><h3>确认报考信息</h3></th></tr>
                <tr>
                    <td>编号</td>
                    <td>${List.sNo}</td>
                </tr>
                <tr>
                    <td>姓名</td>
                    <td>${List.sName}</td>
                </tr>
                <tr>
                    <td>身份证号</td>
                    <td>${List.sIdcard}</td>
                </tr>
                <c:choose>
                    <c:when test="${List.sSex==1}">
                        <tr>
                            <td>性别</td>
                            <td>男</td>
                        </tr>
                    </c:when>
                    <c:otherwise>
                        <tr>
                            <td>性别</td>
                            <td>女</td>
                        </tr>
                    </c:otherwise>
                </c:choose>
                <tr>
                    <td>考试名称</td>
                    <td>${exam.eName}</td>
                </tr>
                <tr>
                    <td>考试编号</td>
                    <td>${exam.eNo}</td>
                </tr>
                <tr>
                    <td>开考时间</td>
                    <td>${exam.timeBegin}</td>
                </tr>
                <tr>
                    <td>考试时长</td>
                    <td>${exam.timeTest}</td>
                </tr>
                <tr>
                    <td>科目名称</td>
                    <td>${exam.kName}</td>
                </tr>
                <tr>
                    <td>负责人</td>
                    <td>${exam.mName}</td>
                </tr>
            </table>
        </c:otherwise>
    </c:choose>
    <br>
    <br>
    <div style="text-align: center;">
        <button><a href="/sign/signed?eId=${exam.eId}">确定报考</a></button>
        &nbsp;&nbsp;
        <button><a href="/sign/choose">重新选择考试</a></button>
        &nbsp;&nbsp;
        <button><a href="/stu/getStuSId?sId=${List.sId}">修改个人信息</a></button>
    </div>
    <div class="col-md-12 text-right">
        <navigationTag:page url="${pageContext.request.contextPath }/toCourse.action" />
    </div>

</div>
</body>
</html>