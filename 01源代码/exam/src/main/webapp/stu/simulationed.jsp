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
<body  STYLE="background-color:transparent">
    <div class="container">
        <div class="row clearfix">
            <div class="panel panel-default">
                <div class="panel-body">
                    <div class="col-md-12 column">
                        <table class="table  table-hover">
                            <td><input type="hidden" name="Id" value="${thisI}"></td>
                            <span>分数：${grade} （未计算问答题）</span>
                            <c:choose>
                            <c:when test="${List==null}"><span>页面发生异常</span></c:when>
                            <c:when test="${empty  List} "><span>没有数据</span></c:when>
                            <c:otherwise>
                            <c:forEach  items="${List}" var="map">
                            <c:choose>
                            <c:when test='${map.qType eq "1"}'>
                            <div >
                                <div>
                                        ${map.No}、${map.content}
                                </div>
                                <div>
                                    <c:choose>
                                        <c:when test="${map.hAnswer eq map.answer}">
                                            <div>
                                                考生答案：
                                                <input size="10" readonly="readonly" value="${map.answer}" />
                                            </div>
                                        </c:when>
                                        <c:otherwise>
                                            <div>
                                                考生答案：
                                                <input size="10" readonly="readonly" value="${map.hAnswer}" />
                                            </div>
                                            <div>
                                                参考答案：
                                                <input size="10" readonly="readonly" value="${map.answer}" style="color: red"/>
                                            </div>
                                        </c:otherwise>
                                    </c:choose>
                                </div>
                                <div>
                                    题目解析：<br>
                                    <textarea style="width: 70%;" name="401" maxlength="500" readonly="readonly">${map. reply}</textarea>
                                </div>
                            </div>
                            </c:when>
                            <c:when test='${map.qType eq "2"}'>
                            <div >
                                <div>
                                        ${map.No}、${map.content}
                                </div>
                                <div>
                                    <c:choose>
                                        <c:when test="${map.hAnswer eq map.answer}">
                                            <div>
                                                考生答案：
                                                <input size="10" readonly="readonly" value="${map.answer}" />
                                            </div>
                                        </c:when>
                                        <c:otherwise>
                                            <div>
                                                考生答案：
                                                <input size="10" readonly="readonly" value="${map.hAnswer}" />
                                            </div>
                                            <div>
                                                参考答案：
                                                <input size="10" readonly="readonly" value="${map.answer}" style="color: red"/>
                                            </div>
                                        </c:otherwise>
                                    </c:choose>
                                </div>
                                <div>
                                    题目解析：<br>
                                    <textarea style="width: 70%;" name="401" maxlength="500" readonly="readonly">${map. reply}</textarea>
                                </div>
                            </div>
                            </c:when>
                            <c:when test='${map.qType eq "3"}'>
                            <div >
                                <div>
                                        ${map.No}、${map.content}
                                </div>
                                <div>
                                    <c:choose>
                                        <c:when test="${map.hAnswer eq map.answer}">
                                            <div>
                                                考生答案：
                                                <input size="10" readonly="readonly" value="${map.answer}" />
                                            </div>
                                        </c:when>
                                        <c:otherwise>
                                            <div>
                                                考生答案：
                                                <input size="10" readonly="readonly" value="${map.hAnswer}" />
                                            </div>
                                            <div>
                                                参考答案：
                                                <input size="10" readonly="readonly" value="${map.answer}" style="color: red"/>
                                            </div>
                                        </c:otherwise>
                                    </c:choose>
                                </div>
                                <div>
                                    题目解析：<br>
                                    <textarea style="width: 70%;" name="401" maxlength="500" readonly="readonly">${map.reply}</textarea>
                                </div>
                            </div>
                            </c:when>
                            <c:when test='${map.qType eq "4"}'>
                            <div id="401">
                                <div>${map.No}、${map.content}</div>
                                <div>
                                    考生答案：<br>
                                    <textarea style="width: 70%;" name="401" maxlength="500" placeholder="${map.hAnswer}"></textarea>
                                </div>
                                <div>
                                    题目解析：<br>
                                    <textarea style="width: 70%;" name="401" maxlength="500" placeholder="${map.reply}"></textarea>
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
</body>

</html>