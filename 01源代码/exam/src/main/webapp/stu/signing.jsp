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
                    <h1>请确认您的信息</h1>

                        <c:choose>
                            <c:when test="${List==null}"><span>查询考试发生异常</span></c:when>
                            <c:when test="${empty  List} "><span>没查到数据</span></c:when>
                            <c:otherwise>
                                编号<input type="text" value="${List.sNo}" name="sNo"  readonly>
                                姓名<input type="text" value="${List.sName}" name="sName" readonly>
                                身份证号<input type="text" value="${List.sIdcard}" name="sIdcard" readonly>
                                <c:choose>
                                    <c:when test="${List.sSex==1}">
                                       性别<input type="text" value="男" name="sSex" readonly>
                                    </c:when>
                                    <c:otherwise>
                                        性别<input type="text" value="女" name="sSex" readonly>
                                    </c:otherwise>
                                </c:choose>
                                考试编号<input type="text" value="${exam.eNo}" name="eNo"  readonly>
                                考试名称<input type="text" value="${exam.eName}" name="eName"  readonly>
                                开考时间<input type="text" value="${exam.timeBegin}" name="timeBegin"  readonly>
                                考试时长<input type="text" value="${exam.timeTest}" name="timeTest"  readonly>
                                科目名称<input type="text" value="${exam.kName}" name="kName"  readonly>
                                负责人<input type="text" value="${exam.mName}" name="mName"  readonly>
                            </c:otherwise>
                        </c:choose>
                    <a href="/stu/getStuSId?sId=${List.sId}">修改个人信息</a>
                    <a href="/sign/choose">重新选择考试</a>
                    <a href="/sign/signed?eId=${exam.eId}">报考</a>
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