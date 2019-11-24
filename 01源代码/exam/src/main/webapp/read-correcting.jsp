<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>答卷列表</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 答卷管理 <span class="c-gray en">&gt;</span> 批改试卷 <span class="c-gray en">&gt;</span> ${eName} <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <div style="text-align: center;">
        <h3>阅卷</h3>
    </div>
    <form action="/correct/corrected" method='post' style="width: 70%; margin-left: 15%;border: 1px solid red;padding-bottom: 50px;">
        <c:choose>
            <c:when test="${List ==null}"><span>服务器异常</span></c:when>
            <c:when test="${empty  List} "><span>没有数据</span></c:when>
            <c:otherwise>
                <c:forEach  items="${List}" var="map">
                    <input type="hidden" value="${map.hId}" name="hId${map.No}">
                    <div id="1" style="border: 1px solid red;">
                        <div style="border: 1px solid red;">
                           ${map.content}
                        </div>
                        <textarea readonly="" style="width: 95%;height: 50px;"> ${map.hAnswer}</textarea>
                        <div style="text-align:right;margin-right: 5%;">
                            得分：<input style="width: 50px;" name="hGrade${map.No}" value="0" />/${map.qValue}
                        </div>
                    </div>
                    <br />
                </c:forEach>
            </c:otherwise>
        </c:choose>



        <br />
        <div style="text-align: center;">
            <input type="submit" value="提交"/>
        </div>
    </form>



</div>


</body>
</html>
