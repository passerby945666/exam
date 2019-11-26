<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
<title>成绩查询-结果</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font: 14px "华文楷体", san-serif;
            text-align: left;
            background: #fff;
        }
        div, dl, dt, dd, ul, ol, li, h1, h2, h3, h4, h5, h6, pre, form, input, p {
            padding: 0;
            margin: 0;
        }
        img {
            border: 0;
            margin: 0;
        }
        #Content {
            padding: 10px 0;
            width: 1200px;
            margin: 0 auto;
        }
        #Header, #Content {
            width: 1200px;
            margin: 0 auto;
            text-align: left;
            overflow: hidden;
            clear: both;
        }
        #Header {
            width: 1200px;
            height: 100px;
            margin: 0 auto;
            line-height: 100px;
            font-size: 42px;
            text-align: left;
            text-indent: 0.5em;
            color: #3083c7;
            border-bottom: 3px #3083c7 solid;
        }
        #Content {
            padding: 42px 0 0 0;
        }

        a {
            color: #333;
        }
        #Content1 {
            width: 1200px;
            margin: 0 auto;
        }
        #query_result {
            margin-bottom: 60px;
        }
        .c_tits {
            height: 30px;
            line-height: 30px;
            color: #3083c7;
            font-size: 22px;
            text-align: center;
            margin: 40px 0;
        }
        .hisbtn {
            text-align: center;
            margin-top: 30px;
        }
        .s3 {
            clear: both;
            text-align: center;
        }
        input {
            outline: 0;
        }
        .s3 input, .s3 button, .s3 a {
            background-image: none;
            background-color: #01adef;
            color: #fff;
            width: 80px;
            height: 30px;
            line-height: 29px;
            margin: 0 5px;
            padding: 0;
            border-radius: 3px;
            border: 0;
            text-align: center;
            display: inline-block;
            cursor: pointer;
        }
        .score {
            width: 450px;
            margin: 0 auto;
        }
        ul, li {
            list-style: None;
        }
        .clist li {
            overflow: hidden;
            clear: both;
            margin-bottom: 15px;
            color: rgb(7, 78, 151);
        }
        .clist li strong {
            float: left;
            width: 90px;
            text-align: right;
            font-weight: 600;
        }
        .clist li span {
            float: left;
            margin-left: 3px;
        }
        .titleT {
            height: 35px;
            line-height: 35px;
            background-color: #b8cce4;
            text-align: center;
            margin-bottom: 15px;
            font-weight: 600;
            letter-spacing: 3px;
        }

        .scoreT li strong {
            text-align: left;
            width: auto;
            color: #707070;
            font-weight: normal;
        }
        .scoreT li span {
            font-weight: bold;
        }
        .clist li span#s {
            color: #d71e04;
            font-weight: bold;
        }
        .intr .intrtit {
            font-size: 18px;
            padding: 8px 0 20px 40px;
            border-bottom: #ddd solid 1px;
            margin-bottom: 30px;
            position: relative;
        }
        .intr ul li {
            padding-left: 20px;
            line-height: 200%;
            margin-bottom: 20px;
        }
        .intr .intrtit i {
            position: absolute;
            left: 15px;
            top: 15px;
            height: 10px;
            width: 10px;
            background-color: #fe8500;
        }
        .problem li {
            padding-left: 20px;
            line-height: 200%;
            margin-bottom: 20px;
            cursor: pointer;
        }
        ol li div a {
            float: right;
            margin-left: 5px;
        }
        .container ol {
            margin: 0 auto;
            width: 520px;
        }
        .container ol li {
            clear: both;
            float: left;
            width: 100%;
            position: relative;
        }
        .container ol li.tip_n {
            margin: 3px 0 5px;
            color: #a7a7a7;
        }
        .container ol li span {
            float: left;
            width: 125px;
            text-align: right;
            line-height: 30px;
        }

        .container ol li div {
            float: left;
            margin-left: 10px;
            height: 30px;
            overflow: hidden;
        }
        .s2 input, .s1 input, ol li div input {
            height: 28px;
            *height: 27px ;
            line-height: 27px;
            width: 230px;
            border-radius: 5px;
            border: solid 1px #a9a9a9;
            padding: 0 5px;
        }
        #verifysStrDiv a {
            color: #00aef1;
            line-height: 30px;
            font-size: 14px;
        }
        #Header img {
            margin-top: 14px;
        }
    </style>
</head>
<body>
<div id="Body">
   <div id="Header"><a href="indexM.jsp" style='text-decoration:none;'>思考官网<img alt="" src=""></a></div>

    <div id="Content">
        <div id="Content1">

            <div id="query_result">
                <div class="c_tits"><span id="sn"></span> 思考- 成绩</div>
                <div class="container" style="padding-bottom:10px">

                    <div class="score" >
                        <div class="titleT">笔试成绩</div>
                        <ul class="clist">
                            <li><strong>准考证号：</strong><input type="text" style="border:none;" value="${examCard}" readonly></li>
                            <li><strong>总　　分：</strong><input type="text" style="border:none;" value="${grades.grade}" readonly></li>
                        </ul>
                </div>


                <div class="s3 hisbtn">
                    <input type="button" value="继续查询" onclick="javascript:window.open('infograde.jsp','_self')" style="cursor:pointer">
                    <input style="cursor:pointer" onclick="javascript:window.open('indexM.jsp','_self')" type="button" value="返回主页">
                </div>
                    <a href="indexM.jsp">11111111</a>
            </div>

            </div>
        </div>

    </div>
</div>
</body>
</html>
