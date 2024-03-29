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
<!--[if lt IE 9]>
<script type="text/javascript" src="/lib/html5shiv.js"></script>
<script type="text/javascript" src="/lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="/lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="/static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="/static/h-ui.admin/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="/lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>考试管理</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 考试管理 <span class="c-gray en">&gt;</span> 考试列表 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<div class="text-c">
		<form action="/exam/getExamExam">
		<button onclick="removeIframe()" class="btn btn-primary radius">关闭选项卡</button>
            科目:
	    <span class="select-box inline">
            <select name="kId" class="select">
                <c:forEach  items="${kName}" var="k">
                    <option value="${k.kId}">${k.kName}</option>
                </c:forEach>
            </select>
		</span>
		<input type="text" name="exam"  value="" placeholder=" 搜索框优先于下拉框，请输入编号或名称" style="width:250px" class="input-text">
		<button name=""  class="btn btn-success" type="submit"><i class="Hui-iconfont">&#xe665;</i> 搜考试</button>
		</form>
	</div>
	<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l">
	<a class="btn btn-primary radius" data-title="添加考试" data-href="/exam/getinsertExam" onclick="Hui_admin_tab(this)" href="javascript:;">
	<i class="Hui-iconfont">&#xe600;</i> 新增考试</a></span> <span class="r">共有数据：<strong>${fn:length(requestScope.examList)}</strong> 条</span> </div>
	<div class="mt-20">
		<table class="table table-border table-bordered table-bg table-hover table-sort table-responsive">
			<thead>
				<tr class="text-c">
					<th width="25"><input type="checkbox" name="" value=""></th>
					<th width="30">考试编号</th>
					<th width="40">考试名称</th>
					<th width="80">科目名称</th>
					<th width="120">开考时间</th>
					<th width="50">考试时间</th>
					<th width="120">报名时间</th>
					<th width="120">报名截止时间</th>
					<th width="60">负责人</th>
					<th width="120">操作</th>
				</tr>
			</thead>
			<tbody>
			<tr>
			<c:choose>
            <c:when test="${examList==null}"><span>查询不到考试信息</span></c:when>
                <c:when test="${empty  examList} "><span>考试信息为空</span></c:when>
            <c:otherwise>
                <c:forEach  items="${examList}" var="exam">
                    <tr>
                     <td><input type="checkbox" value="" name="${exam.eId}"></td>
                    <td>${exam.eNo}</td>
                    <td>${exam.eName}</td>
					<td>${exam.kName}</td>
				<td><fmt:formatDate value="${exam.timeBegin}" pattern="yyyy-MM-dd hh:mm"/></td>
                    <td>${exam.timeTest}</td>
				<td><fmt:formatDate value="${exam.timeBaomin}" pattern="yyyy-MM-dd hh:mm"/></td>
				<td><fmt:formatDate value="${exam.timeEnd}" pattern="yyyy-MM-dd hh:mm"/></td>
					<td>${exam.mName}</td>
					<td class="f-14 td-manage"> <a style="text-decoration:none" class="ml-5" onClick="article_edit()" href="/exam/getExamEId?eId=${exam.eId}" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onClick="article_del(this,${exam.eId})" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
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

/*考试-删除*/
function article_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$.ajax({
			type: 'POST',
			url: '/exam/deleteExam',
		     data:{"eId":id},
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

/*资讯-下架*/
function article_stop(obj,id){
	layer.confirm('确认要下架吗？',function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="article_start(this,id)" href="javascript:;" title="发布"><i class="Hui-iconfont">&#xe603;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已下架</span>');
		$(obj).remove();
		layer.msg('已下架!',{icon: 5,time:1000});
	});
}


</script>
</body>
</html>