<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML>
<html>
<head>
	<meta charset="utf-8">
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
	<meta http-equiv="Cache-Control" content="no-siteapp" />
	<link rel="stylesheet" type="text/css" href="/static/h-ui/css/H-ui.min.css" />
	<link rel="stylesheet" type="text/css" href="/static/h-ui.admin/css/H-ui.admin.css" />
	<link rel="stylesheet" type="text/css" href="/lib/Hui-iconfont/1.0.8/iconfont.css" />
	<link rel="stylesheet" type="text/css" href="/static/h-ui.admin/skin/default/skin.css" id="skin" />
	<link rel="stylesheet" type="text/css" href="/static/h-ui.admin/css/style.css" />
	<title>考生管理</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 考生管理 <span class="c-gray en">&gt;</span> 考试列表 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<div class="text-c">
		<form action="/stu/getStu">
			<button onclick="removeIframe()" class="btn btn-primary radius">关闭选项卡</button>
			<input type="text" name="stu"  value="" placeholder="考生编号或名字或身份证号" style="width:250px" class="input-text">
			<button name=""  class="btn btn-success" type="submit"><i class="Hui-iconfont">&#xe665;</i> 搜考生</button>
		</form>
	</div>
	<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l">
	<a class="btn btn-primary radius" data-title="添加考生" data-href="/member-add.jsp" onclick="Hui_admin_tab(this)" href="javascript:;">
	<i class="Hui-iconfont">&#xe600;</i> 新增考生信息</a></span>
		<span class="r">共有数据：<strong>${fn:length(requestScope.stuList)}</strong> 条</span></div>
	<div class="mt-20">
		<table class="table table-border table-bordered table-bg table-hover table-sort table-responsive">
			<thead>
			<tr class="text-c">
				<th width="25"><input type="checkbox" name="" value=""></th>
				<th width="80">考生编号</th>
				<th width="100">考生姓名</th>
				<th width="40">性别</th>
				<th width="130">身份证号码</th>
				<th width="70">出生年月</th>
				<th width="100">操作</th>
			</tr>
			</thead>
			<tbody>
			<tr>
				<c:choose>
				<c:when test="${stuList==null}"><span>查询考生信息发生异常</span></c:when>
				<c:when test="${empty  stuList} "><span>没有考生信息</span></c:when>
				<c:otherwise>
				<c:forEach  items="${stuList}" var="stu">
			<tr>
				<td><input type="checkbox" value="" name="sId"></td>
				<td>${stu.sNo}</td>
				<td>${stu.sName}</td>
				<td>${1==stu.sSex?'男':'女'}</td>
				<td>${stu.sIdcard}</td>
				<td><fmt:formatDate value="${stu.sBirthday}" pattern="yyyy-MM-dd"/></td>
				<td>
					<a style="text-decoration:none" class="ml-5" onClick="member_edit()" href="/stu/getStudent?sId=${stu.sId}" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a>
					<a style="text-decoration:none" class="ml-5" onClick="member_del(this,${stu.sId})" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a>
				</td>
			</tr>
			</c:forEach>
			</c:otherwise>
			</c:choose>
			</tr>
			</tbody>
		</table>
	</div>
</div>
<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="/static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="/static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
	/*考生-删除*/
	function member_del(obj,id){
		layer.confirm('确认要删除吗？',function(index){
			$.ajax({
				type: 'POST',
				url:"/stu/deleteStu",
				data:{"sId":id},
				dataType: 'text',
				success: function(data){
					$(obj).parents("tr").remove();
					layer.msg('已删除!',{icon:1,time:1000});
				},
				error:function(data) {
					console.log(data.msg);
				},
			});
		});
	}



</script>
</body>
</html>