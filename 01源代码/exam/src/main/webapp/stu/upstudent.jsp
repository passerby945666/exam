<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		<div class="col-md-12 column">
			<div class="panel  panel-info">
				<div class="panel-body">
						<div class="col-md-12 column">
							<form class="form-horizontal" role="form"  action="/stu/updateStuM" method="post">
								<div class="form-group">
									<input type="hidden" class="form-control"   name="sId" value="${stu.sId}" />
						<label for="edit" class="col-sm-2 control-label">账号</label>
						<div class="col-sm-10">
							<input type="text" class="form-control"  placeholder="账号" name="sNo" value="${stu.sNo}" />
						</div>
					</div>

					<div class="form-group">
						<label for="edit" class="col-sm-2 control-label">名字</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" placeholder="名字" name="sName"  value="${stu.sName}"/>
						</div>
					</div>

					<div class="form-group">
						<label for="edit" class="col-sm-2 control-label">性别</label>
						<div class="col-sm-10">

							<c:choose>
								<c:when test="${stu.sSex==1}">
									<div class="radio-box">
										<label>	<input name="sSex" type="radio"  value="1"  checked>男</label>
									</div>
									<div class="radio-box">
										<label>	<input name="sSex" type="radio"  value="2" >女</label>
									</div>
								</c:when>
								<c:otherwise>
									<div class="radio-box">
										<label>	<input name="sSex" type="radio"  value="1"  >男</label>
									</div>
									<div class="radio-box">
										<label>	<input name="sSex" type="radio"  value="2" checked>女</label>
									</div>
								</c:otherwise>
							</c:choose>
						</div>
					</div>
								<div class="form-group">
									<label for="edit" class="col-sm-2 control-label">身份证号码</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" id="edit_sName" placeholder="身份证号码" name="sIdcard" value="${stu.sIdcard}" />
									</div>
								</div>


								<div class="form-group">
									<label for="edit" class="col-sm-2 control-label">出生年月</label>
									<div class="col-sm-10">
										<input type="date" class="form-control" id="edit_sName" placeholder="出生年月" name="sBirthday" value="${stu.sBirthday}" />
										<input type="hidden" value="${date}" name="date">
									</div>
								</div>

								<div class="form-group">
									<div class="col-sm-offset-2 col-sm-10">
										 <button type="submit" class="btn btn-default">确认修改</button>
										  <button type="reset" class="btn btn-default"class="text-right" >取消</button>
									</div>
								</div>
							</form>
						</div>
				</div>
			</div>
		</div>
	</div>
		<div class="row clearfix">
	
		</div>
	</div>
</body>

</html>

