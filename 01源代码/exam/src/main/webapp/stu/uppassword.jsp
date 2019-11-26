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
							<form class="form-horizontal" role="form"  action="/stu/updateStuPassword" method="post">
								<div class="form-group">
									<input type="hidden" class="form-control"   name="sId" value="${stu.sId}" />
					</div>
					<div class="form-group">
						<label for="edit_customerName" class="col-sm-2 control-label">密码</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="edit_sName" placeholder="密码" name="sPassword" />
						</div>
					</div>
					<div class="form-group">
						<label for="edit_customerName" class="col-sm-2 control-label">确认密码</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="edit_sName" placeholder="确认密码" name="csPassword" />
						</div>
					</div>
                     ${smg}
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

