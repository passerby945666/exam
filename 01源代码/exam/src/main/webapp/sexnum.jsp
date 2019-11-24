<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
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
            plotBackgroundColor: null,//方框的颜色
            plotBorderWidth: 0,//方框的粗细(内)
            plotShadow: false//方框是否可见
        };
        var title = {
            text: '考生性别比例'
        };
        var tooltip = {
            pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
        };
        var plotOptions = {
            pie: {
                allowPointSelect: true,//能否选择区域
                cursor: 'pointer',
                dataLabels: {//外围小字提示设置
                    enabled: true,//是否显示外面的小字提示
                    format: '<b>{point.name}%</b>: {point.percentage:.1f} %',//小字格式
                    style: {//小字格式
                        color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black'
                    }
                }
            }
        };
        var series= [{
            type: 'pie',
            name: 'Browser share',
            data: [
                ['男生',${map.man}],
                ['女生',${map.woman}]
            ]
        }];

        var json = {};
        json.chart = chart;
        json.title = title;
        json.tooltip = tooltip;
        json.series = series;
        json.plotOptions = plotOptions;
        $('#container').highcharts(json);
    });
</script>
</body>
</html>
