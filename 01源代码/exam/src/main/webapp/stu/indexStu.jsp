<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>考生首页</title>
<meta name="renderer" content="webkit"> 
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="考生首页">


<link rel="stylesheet" href="<%=basePath%>css/bootstrap.min.css">
<script src="<%=basePath%>js/jquery-1.11.3.min.js"></script>
<script src="<%=basePath%>js/bootstrap.min.js"></script>
<script type="text/javascript">
</script>
	<style>
		hr {color:sienna;}

		body {
			background-image:url(../images/pic1.jpg);
			background-size: 100%;}

	</style>
</head>
<body >
	<div class="row clearfix">
		<div class="col-md-12 column">
			<nav class="navbar navbar-default" role="navigation" >
			<div class="navbar-header">
		<a class="navbar-brand" >思考在线考试 </a>
	</div>
				
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav  navbar-center">
						<li >
							 <a href="/sign/choose" target="table">考试报名</a>
						</li>
						<li>
							 <a href="/grade/getGradekFind?str=${stu.sNo}" target="table">成绩查询</a>
						</li>
						<li>
							 <a href="/exam/getExamSId?sId=${stu.sId}" target="table">考试安排</a>
						</li>
						<li>
							 <a href="/examing/simulationbef" target="table" >模拟考场</a>
						</li>
							<li>
							 <a href="/examing/choose" target="table" >进入考试</a>
						</li>
						</li>
						<li>
							<a href="/stu/getStuSId?sId=${stu.sId}" target="table" >个人信息</a>
						</li>

					</ul>
			
					<ul class="nav navbar-nav navbar-right">
				
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">欢迎：${stu.sNo}<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<%--<li>--%>
									 <%--<a href="/stu/getStuSId"  class="btn btn-primary" data-toggle="modal" data-target="#stuEditDialog">个人信息</a>--%>
								<%--</li>--%>
								<li>
									 <a href="/stu/uppassword.jsp" target="table">修改密码</a>
								</li>
							<li>
					<a href="/stu/logout.action">
					<i class="fa fa-sign-out fa-fw"></i>退出登录
					</a>
				</li>
							
							</ul>
						</li>
					</ul>
				</div>
				
			</nav>
		</div>
	</div>


<div class="col-md-10 column">
	<iframe   name="table" width="100%" height="100%" align="center" scrolling="auto" frameborder="0" allowTransparency="true" >
	</iframe>
</div>

</body>


</html>

