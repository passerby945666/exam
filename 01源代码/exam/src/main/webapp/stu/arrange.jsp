<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>考试安排</title>
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
								<th>考生编号</th>
								<th>考试编号</th>
								<th>考试名称</th>
								<th>考试时间</th>
								<th>考试时长</th>
								<th>准考证号</th>
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

