<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title></title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">


    <link rel="stylesheet" href="<%=basePath%>css/bootstrap.min.css">
    <script src="<%=basePath%>js/jquery-1.11.3.min.js"></script>
    <script src="<%=basePath%>js/bootstrap.min.js"></script>

</head>
<body STYLE="background-color:transparent">
<div class="container">
<div class="row clearfix">
    <div class="panel panel-default">
        <div class="panel-body">
            <div class="col-md-12 column">
                <table class="table  table-hover">
                    <form action="/examing/simulation" method='post'>
                    <select name="kId" class="select">
                        <c:forEach  items="${List}" var="map">
                            <option value="${map.kId}">${map.kName}</option>
                        </c:forEach>
                    </select>
                        <input type="submit" value="开始进行模拟考试">
                    </form>
                </table>
            </div>
        </div>
    </div>
</div>
</div>



</body>

</html>


