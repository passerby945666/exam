<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<title>题库管理</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 题库管理 <span class="c-gray en">&gt;</span> 题库信息 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<div class="text-c">
        <form class="form form-horizontal" action="/quebank/queryQuebankKId" >
            <button onclick="removeIframe()" class="btn btn-primary radius">关闭选项卡</button>
            科目:
            <span class="select-box inline">
                <select name="kId" class="select">
                    <option value="%">全部</option>
                    <c:forEach  items="${kName}" var="k">
                        <option value="${k.kId}">${k.kName}</option>
                    </c:forEach>
                </select>
            </span>
            题目类型：
            <span class="select-box inline">
                <select name="qId" class="select">
                     <option value="%">全部</option>
                    <c:forEach  items="${qType}" var="q">
                        <option value="${q.qId}">${q.qType}</option>
                    </c:forEach>
                </select>
            </span>
            <input type="text"  placeholder=" 题库名称" style="width:250px" class="input-text" name="que">
            <button class="btn btn-success" type="submit"><i class="Hui-iconfont">&#xe665;</i> 搜题库</button>
        </form>
    </div>
	<div class="cl pd-5 bg-1 bk-gray mt-20">
        <a class="btn btn-primary radius" data-title="添加题库" href="/quebank/getKId"><i class="Hui-iconfont">&#xe600;</i> 添加题库</a></span>
        <span class="r">共有数据：<strong>${size}</strong> 条</span>
    </div>
	<div class="mt-20">
		<table class="table table-border table-bordered table-bg table-hover table-sort table-responsive">
			<thead>
				<tr class="text-c">
					<th width="25"><input type="checkbox" name="" value=""></th>
					<th width="80">题目编号</th>
					<th width="60">题目内容</th>
                    <th width="80">题目类型</th>
					<th width="75">答案</th>
					<th width="60">解答内容</th>
					<th width="60">录入时间</th>
                    <th width="60">科目名称</th>
					<th width="60">负责人</th>
					<th width="120">操作</th>
				</tr>
			</thead>
			<tbody>
			<tr>
			<c:choose>
            <c:when test="${quebankList==null}"><span>查询题库信息发生异常</span></c:when>
                <c:when test="${empty  quebankList} "><span>没查到数据</span></c:when>
            <c:otherwise>
                <c:forEach  items="${quebankList}" var="quebank">
                    <tr>
                     <td><input type="checkbox" value="" name="tId"></td>
                    <td>${quebank.tNo}</td>
                    <td>${quebank.content}</td>
                     <td>${quebank.qType}</td>
                    <td>${quebank.answer}</td>
                    <td>${quebank.reply}</td>
                    <td>${quebank.tTime}</td>
                    <td>${quebank.kName}</td>
                    <td>${quebank.mName}</td>
                    <td class="f-14 td-manage">
                           <a style="text-decoration:none" onClick="quebank_stop(this,'10001')" href="javascript:;" title="下架"><i class="Hui-iconfont">&#xe6de;</i></a>
                           <a style="text-decoration:none" class="ml-5" onClick="" href="/quebank/getQuebankTId?tId=${quebank.tId}"  title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a>
                           <a style="text-decoration:none" class="ml-5" onClick=" quebank_del(this,'${quebank.tId}')" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a>
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

/*资讯-删除*/
function quebank_del(obj,tId){
	layer.confirm('确认要删除吗？',function(index){
		$.ajax({
			type: 'POST',
			url: "/quebank/deleteQuebank",
            data:{"tId":tId},
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
function quebank_stop(obj,id){
	layer.confirm('确认要下架吗？',function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="quebank_start(this,id)" href="javascript:;" title="发布"><i class="Hui-iconfont">&#xe603;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已下架</span>');
		$(obj).remove();
		layer.msg('已下架!',{icon: 5,time:1000});
	});
}
</script> 
</body>
</html>