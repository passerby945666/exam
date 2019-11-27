<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8" />
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <script src="https://code.highcharts.com/highcharts.js"></script>
</head>
<body>
<div id="container" style="width: 550px; height: 400px; margin: 0 auto"></div>
<div name="yesyes">
    <c:choose>
    <c:when test="${ListLL==null}">
        <span>发生异常</span>
    </c:when>
    <c:when test="${empty ListLL}">
        <span>无成绩数据</span>
    </c:when>
    <c:otherwise>
</div>
<script language="JavaScript">
    var series= [
        <c:forEach items="${ListLL}" var="mapLL" varStatus="ll">
        {
            name: " ${mapLL.kName}",
            data: [
                <c:forEach items="${mapLL.ListSS}" var="mapSS" varStatus="ss">
                ${mapSS.pjf}
                <c:choose>
                <c:when test="${ss.last}">
                </c:when>
                <c:otherwise>
                ,
                </c:otherwise>
                </c:choose>
                </c:forEach>
            ]
        }
        <c:choose>
        <c:when test="${ll.last}">
        </c:when>
        <c:otherwise>
        ,
        </c:otherwise>
        </c:choose>
        </c:forEach>
    ]
    $(document).ready(function() {

        var title = {
            text: '考试平均成绩折线图'
        };
        var subtitle = {
            text: ''
        };
        var xAxis = {
            categories: [ '最近第1次', '最近第2次','最近第3次', '最近第4次', '最近第5次']
        };
        var yAxis = {
            title: {
                text: '分数'
            }
        };
        var plotOptions = {
            line: {
                dataLabels: {
                    enabled: true
                },
                enableMouseTracking: false
            }
        };

        var json = {};

        json.title = title;
        json.subtitle = subtitle;
        json.xAxis = xAxis;
        json.yAxis = yAxis;
        json.series = series;
        json.plotOptions = plotOptions;
        $('#container').highcharts(json);
    });
</script>
</c:otherwise>
</c:choose>
</body>
</html>