<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<!--[if lt IE 9]>"WebContent/article-add.jsp"
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

<title>编辑 - 考试管理 - H-ui.admin v3.1</title>
<meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
<meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
</head>
<body>
<article class="page-container">
	<form class="form form-horizontal"  action="/quebank/updateQuebank" >
        <div class="row c">
            <label class="form-label col-xs-4 col-sm-2">题库编号:</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${quebankList.tNo}" placeholder="" id="articletitle" name="tNo">
            </div>
        </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">题目内容：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${quebankList.content}" placeholder="" id="articletitle1" name="content">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">题目的类型：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <select name="qId" class="select">
                    <c:forEach  items="${qType}" var="q">
                        <option value="${q.qId}">${q.qType}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">这题目的答案：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${quebankList.answer}" placeholder="" id="articletitle3" name="answer">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">解答内容：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${quebankList.reply}" placeholder="" id="articletitle4" name="reply">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-2">科目名称：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <select name="kId" class="select">
                    <c:forEach  items="${kName}" var="k">
                        <option value="${k.kId}">${k.kName}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="row cl">
            <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
                <input type="hidden" name="tId" value="${tId}">
                <input type="hidden" name="mId" value="${mId}">
                <button  class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe632;</i> 保存并提交审核</button>
            </div>
        </div>
    </form>
</article>
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>