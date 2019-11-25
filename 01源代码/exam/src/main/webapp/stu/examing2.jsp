<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

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
<form action='${scr}' method='post'>
<div class="container">
    <div class="row clearfix">
        <div class="panel panel-default">
            <div class="panel-body">
                <div class="col-md-12 column">
                    <table class="table  table-hover">
                        <td><input type="hidden" name="eId" value="${thisEId}"></td>
                        <div id="timer"></div>
                        <div id="warring"></div>
                        <c:choose>

                        <c:when test="${List==null}"><span>页面发生异常</span></c:when>
                        <c:when test="${empty  List} "><span>没有正在进行的考试</span></c:when>
                        <c:otherwise>
                        <c:forEach  items="${List}" var="map">
                            <c:choose>
                            <c:when test='${map.qType eq "1"}'>
                            <div id="101" style="width: 70%; margin-left: 15%;">
                                <div style="width: 100%;">
                                        ${map.No}、${map.content}
                                </div>
                                <div style="text-align: center;">
                                    <input type="radio" name="hAnswer${map.No}" value="A" />A
                                    &nbsp;&nbsp;&nbsp;
                                    <input type="radio" name="hAnswer${map.No}" value="B" />B
                                    &nbsp;&nbsp;&nbsp;
                                    <input type="radio" name="hAnswer${map.No}" value="C" />C
                                    &nbsp;&nbsp;&nbsp;
                                    <input type="radio" name="hAnswer${map.No}" value="D" />D
                                </div>
                            </div>
                            </c:when>
                            <c:when test='${map.qType eq "2"}'>
                            <div id="101" style="width: 70%; margin-left: 15%;">
                                <div style="width: 100%;">
                                        ${map.No}、${map.content}
                                </div>
                                <div style="text-align: center;">
                                    <input type="checkbox" name="hAnswer${map.No}" value="A" />A
                                    &nbsp;&nbsp;&nbsp;
                                    <input type="checkbox" name="hAnswer${map.No}" value="B" />B
                                    &nbsp;&nbsp;&nbsp;
                                    <input type="checkbox" name="hAnswer${map.No}" value="C" />C
                                    &nbsp;&nbsp;&nbsp;
                                    <input type="checkbox" name="hAnswer${map.No}" value="D" />D
                                </div>
                            </div>
                            </c:when>
                            <c:when test='${map.qType eq "2"}'>
                            <div id="101" style="width: 70%; margin-left: 15%;">
                                <div style="width: 100%;">
                                        ${map.No}、${map.content}
                                </div>
                                <div style="text-align: center;">
                                    <input type="checkbox" name="hAnswer${map.No}" value="A" />A
                                    &nbsp;&nbsp;&nbsp;
                                    <input type="checkbox" name="hAnswer${map.No}" value="B" />B
                                    &nbsp;&nbsp;&nbsp;
                                    <input type="checkbox" name="hAnswer${map.No}" value="C" />C
                                    &nbsp;&nbsp;&nbsp;
                                    <input type="checkbox" name="hAnswer${map.No}" value="D" />D
                                </div>
                            </div>
                            </c:when>
                            <c:when test='${map.qType eq "3"}'>
                            <div id="101" style="width: 70%; margin-left: 15%;">
                                <div style="width: 100%;">
                                        ${map.No}、${map.content}
                                </div>
                                <div style="text-align: center;">
                                    答案：<input type="text" name="hAnswer${map.No}">
                                </div>
                            </div>
                            </c:when>
                            <c:when test='${map.qType eq "4"}'>
                            <div id="101" style="width: 70%; margin-left: 15%;">
                                <div style="width: 100%;">
                                        ${map.No}、${map.content}
                                </div>
                                <div style="text-align: center;">
                                    答案：<input type="text" name="hAnswer${map.No}" style="min-height: 100px;min-width: 100px;">
                                </div>
                            </div>
                            </c:when>
                            <c:otherwise>
                            <span>未知题型</span>
                            </c:otherwise>
                           </c:choose>
                        </c:forEach>
                        </c:otherwise>
                        </c:choose>
     <input type="submit" value="提交试卷">
         </form>
</body>
<script type="text/javascript">
    var maxtime = ${time} * 60; //
    function CountDown() {
        if (maxtime >= 0) {
            minutes = Math.floor(maxtime / 60);
            seconds = Math.floor(maxtime % 60);
            msg = "距离结束还有" + minutes + "分" + seconds + "秒";
            document.all["timer"].innerHTML = msg;
            if (maxtime == 5 * 60)alert("距离结束仅剩5分钟");
            --maxtime;
        } else{
            clearInterval(timer);
            alert("时间到，结束!");
        }
    }
    timer = setInterval("CountDown()", 1000);
</script>
</html>