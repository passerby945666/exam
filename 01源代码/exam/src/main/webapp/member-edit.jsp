<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!--_meta 作为公共模版分离出去-->
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="Bookmark" href="/favicon.ico" >
<link rel="Shortcut Icon" href="/favicon.ico" />
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
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<!--/meta 作为公共模版分离出去-->

<title>修改考生信息 - 考生管理</title>
<meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
<meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
</head>
<body>
<article class="page-container">
	<form   class="form form-horizontal"  action="/stu/updateStu">

		<input type="hidden"  value="${sId}"   name="sId">

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">账号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${stu.sNo}" placeholder=""  name="sNo">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">姓名：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${stu.sName}" placeholder=""  name="sName">
			</div>
		</div>

	<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">性别：</label>
			<div class="formControls col-xs-8 col-sm-9 skin-minimal">
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

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">身份证号码：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" placeholder="" name="sIdcard" value="${stu.sIdcard}" >
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">出生年月：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="date" class="input-text" placeholder="格式：yyyy-MM-dd" name="sBirthday"   value="${date}}"  />
				<input value="${date}" name="date" type="hidden">
			</div>
		</div>


		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
				<input class="btn btn-primary radius" type="submit"  value="&nbsp;&nbsp;确定&nbsp;&nbsp;">
				<input class="btn btn-primary radius" type="reset" value="&nbsp;&nbsp;重置&nbsp;&nbsp;">
			</div>
		</div>
	</form>
</article>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="/static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="/static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本--> 
<script type="text/javascript" src="/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="/lib/jquery.validation/1.14.0/jquery.validate.js"></script>
<script type="text/javascript" src="/lib/jquery.validation/1.14.0/validate-methods.js"></script>
<script type="text/javascript" src="/lib/jquery.validation/1.14.0/messages_zh.js"></script>
<script type="text/javascript">

</script> 
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>