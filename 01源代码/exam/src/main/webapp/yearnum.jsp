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
<script language="JavaScript">
    $(document).ready(function() {
        var chart = {
            type: 'column'
        };
        var title = {
            text: '男女考生年龄统计'
        };
        var subtitle = {
            text: ''
        };
        var xAxis = {
            categories: ['9岁以下','10-12','13-15','16-18','19-21','22-25'],
            crosshair: true
        };
        var yAxis = {
            min: 0,
            title: {
                text: '人数'
            }
        };
        var tooltip = {
            headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
            pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
                '<td style="padding:0"><b>{point.y:.1f} 人</b></td></tr>',
            footerFormat: '</table>',
            shared: true,
            useHTML: true
        };
        var plotOptions = {
            column: {
                pointPadding: 0.2,
                borderWidth: 0
            }
        };
        var credits = {
            enabled: false
        };
        var series= [{
            name: '男生',
            data: [
                ${mapa.level1}, ${mapa.level2}, ${mapa.level3}, ${mapa.level4}, ${mapa.level5}, ${mapa.level6}
            ]
        }, {
            name: '女生',
            data: [${mapb.level1}, ${mapb.level2}, ${mapb.level3}, ${mapb.level4}, ${mapb.level5}, ${mapb.level6}]
        }];
        var json = {};
        json.chart = chart;
        json.title = title;
        json.subtitle = subtitle;
        json.tooltip = tooltip;
        json.xAxis = xAxis;
        json.yAxis = yAxis;
        json.series = series;
        json.plotOptions = plotOptions;
        json.credits = credits;
        $('#container').highcharts(json);

    });
</script>
</body>
</html>
