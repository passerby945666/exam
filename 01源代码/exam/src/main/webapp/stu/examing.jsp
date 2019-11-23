<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>

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
<body>

<div class="container">
	<div class="row clearfix">
		<div class="panel panel-default">
			<div class="panel-body">
				<div class="col-md-12 column">
					<table class="table  table-hover">
						<thead>
						<tr>
							<th></th>
							<th>考试编号</th>
							<th>科目名称</th>
							<th>开考时间</th>
							<th>考试时长</th>
							<th>操作</th>
						</tr>
						</thead>
						<tbody>
						<c:choose>
						<c:when test="${List==null}"><span>页面发生异常</span></c:when>
						<c:when test="${empty  List} "><span>没有正在进行的考试</span></c:when>
						<c:otherwise>
						<c:forEach  items="${List}" var="exam">
						<tr>
							<td><input type="hidden" name=""></td>
							<td>${exam.get("eNo")}</td>
							<td>${exam.get("eName")}</td>
							<td>${exam.get("timeBegin")}</td>
							<td>${exam.get("timeTest")}</td>
							<td class="f-14 td-manage"><a style="text-decoration:none" href="/examing/examing?eId=${exam.get("eId")}" >进入考试</a></td>
						</tr>
						</c:forEach>
						</c:otherwise>
						</c:choose>
</body>

</html>