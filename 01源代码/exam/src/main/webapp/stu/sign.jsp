<%@ page language="java"  import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="navigationTag" uri="http://navigationTag.com/common/"%>
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
					<table class="table  table-hover">
						<thead>
							<tr>
								<th></th>
								<th>考试编号</th>
								<th>科目名称</th>
								<th>开考时间</th>
								<th>报名时间</th>
								<th>截止时间</th>
								<th>考试时长</th>
								<th>监考老师</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
			<c:choose>
            <c:when test="${examList==null}"><span>查询考试发生异常</span></c:when>
                <c:when test="${empty  examList} "><span>没查到数据</span></c:when>
            <c:otherwise>
                <c:forEach  items="${examList}" var="exam">
                    <tr>
                     <td><input type="checkbox" value="choose" name="${exam.eId}"></td>
                    <td>${exam.eNo}</td>
                    <td>${exam.eName}</td>
                    <td>${exam.timeBegin}</td>
                    <td>${exam.timeTest}</td>
                    <td>${exam.timeBaomin}</td>
                    <td>${exam.timeEnd}</td>
                    <td>${exam.kId}</td>
					<td>${exam.mId}</td>
                       <td class="f-14 td-manage"><a style="text-decoration:none" onClick="article_stop(this,'10001')" href="javascript:;" title="下架"><i class="Hui-iconfont">&#xe6de;</i></a> <a style="text-decoration:none" class="ml-5" onClick="article_edit('资讯编辑','exam-add.html','10001')" href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onClick="article_del(this,'10001')" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
                    </tr>
                </c:forEach>
            </c:otherwise>
            </c:choose>
						</tbody>
					</table>
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