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
<meta http-equiv="description" content="This is my page">


<link rel="stylesheet" href="<%=basePath%>css/bootstrap.min.css">
<script src="<%=basePath%>js/jquery-1.11.3.min.js"></script>
<script src="<%=basePath%>js/bootstrap.min.js"></script>
<script type="text/javascript">

//通过id获取修改的客户信息
function editCustomer(id) {
    $.ajax({
        type:"get",
        url:"<%=basePath%>customer/getCustomerById.action",
        data:{"id":id},
        success:function(data) {
            $("#edit_cust_id").val(data.cust_id);
            $("#edit_customerName").val(data.cust_name);
            $("#edit_customerFrom").val(data.cust_source)
            $("#edit_custIndustry").val(data.cust_industry)
            $("#edit_custLevel").val(data.cust_level)
            $("#edit_linkMan").val(data.cust_linkman);
            $("#edit_phone").val(data.cust_phone);
            $("#edit_mobile").val(data.cust_mobile);
            $("#edit_zipcode").val(data.cust_zipcode);
            $("#edit_address").val(data.cust_address);
            
        }
    });
}

function loginout(){
	if(confirm("确认退出")){
		window.location.href="<%=basePath%>loginout.action"
	}
	
}

</script>
</head>
<body>
	<div class="row clearfix">
		<div class="col-md-12 column">
			<nav class="navbar navbar-default" role="navigation" >
			<div class="navbar-header">
		<a class="navbar-brand" href="<%=basePath%>customer/list.action">思考在线考试 v1.0</a>
	</div>
				
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav  navbar-center">
						<li >
							 <a href="stu/sign.jsp" target="table">考试报名</a>
						</li>
						<li>
							 <a href="stu/info.jsp" target="table">成绩查询</a>
						</li>
						<li>
							 <a href="stu/arrange.jsp" target="table">考试安排</a>
						</li>
						<li>
							 <a href="stu/imitate.jsp" target="table" >模拟考场</a>
						</li>
							<li>
							 <a href="/examing/choose" target="table" >进入考试</a>
						</li>
					
					</ul>
			
					<ul class="nav navbar-nav navbar-right">
				
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">欢迎：${stu.sNo}<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									 <a href="#"  class="btn btn-primary" data-toggle="modal" data-target="#stuEditDialog">个人信息</a>
								</li>
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
			<iframe    name="table" frameborder="0" width="100%" style="height:750px;">
            </iframe>
</div>
</body>



	
<!-- 修改个人信息模态框 -->
<div class="modal fade" id="stuEditDialog" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title" id="myModalLabel">修改个人信息</h4>
			</div>
			<div class="modal-body">
				<form class="form-horizontal" id="edit_customer_form">
					<input type="hidden" id="edit_cust_id" name="cust_id"/>
					<div class="form-group">
						<label for="edit_customerName" class="col-sm-2 control-label">考生编号</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="edit_sNo" placeholder="考生编号" name="sNo" />
						</div>
					</div>
					<div class="form-group">
						<label for="edit_customerName" class="col-sm-2 control-label">考生姓名</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="edit_sName" placeholder="考生姓名" name="sName" />
						</div>
					</div>
					<div class="form-group">
						<label for="edit_sSex" class="col-sm-2 control-label">性别</label>
						<div class="col-sm-10">
							<select	class="form-control" id="edit_sSex" name="sSex">
								<option value="">--请选择--</option>
								<c:forEach items="${levelType}" var="item">
									<option value="${item.dict_id}"<c:if test="${item.dict_id == custLevel}"> selected</c:if>>${item.dict_item_name }</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label for="edit_customerName" class="col-sm-2 control-label">身份证号码</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="edit_sIdcard" placeholder="身份证号码" name="sIdcard" />
						</div>
					</div>
				
					<div class="form-group">
						<label for="edit_customerName" class="col-sm-2 control-label">出生年月</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="edit_sIdcard" placeholder="出生年月" name="sBirthday" />
						</div>
					</div>
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				<button type="button" class="btn btn-primary" onclick="updateCustomer()">保存修改</button>
			</div>
		</div>
	</div>
</div>
</html>

