<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<meta name="renderer" content="webkit"> 
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">


<link rel="stylesheet" href="<%=basePath%>css/bootstrap.min.css">
<script src="<%=basePath%>js/jquery-1.11.3.min.js"></script>
<script src="<%=basePath%>js/bootstrap.min.js"></script>
<title>成绩查询</title>
</head>
<body  STYLE="background-color:transparent">
<div class="container">
	<div class="row clearfix">
		<div class="panel panel-default">
			<div class="panel-body">
				<div class="col-md-12 column">
					<table class="table  table-hover">
						<thead>
							<tr class="success">
								<th>考试科目</th>
								<th>考生名称</th>
								<th>分数</th>
							</tr>
						</thead>
						<tbody>
						<tr>
			<c:choose>
            <c:when test="${mapList==null}"><span>查询成绩发生异常</span></c:when>
            <c:otherwise>
                <c:forEach  items="${mapList}" var="map">
                    <tr class="danger">
					<td>${map.eName}</td>
                    <td>${map.sName}</td>
                    <td>${map.grade}</td>
                    </tr>
                </c:forEach>
            </c:otherwise>
            </c:choose>
			</tr>
						</tbody>
					</table>
					<div class="col-md-12 text-right">
					</div>
				</div>
			</div>
		</div>
		</div>
	</div>
</body>

</html>

