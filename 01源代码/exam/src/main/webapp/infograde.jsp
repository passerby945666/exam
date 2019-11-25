<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<title></title>
<style>
body {
	margin: 0;
	padding: 0;
	font: 14px "微软雅黑", san-serif;
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
.c_tits {
	height: 30px;
	line-height: 30px;
	color: #3083c7;
	font-size: 22px;
	text-align: center;
	margin: 40px 0;
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
.queryLeft {
	width: 815px;
	float: left;
	position: relative;
	padding-right: 50px;
	border-right: solid 1px #ddd;
	margin: 0 0 60px 0;
}
.intr {
	float: left;
	width: 220px;
	margin-left: 40px;
	text-align: left;
	margin-top: 20px;
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
.tips {
	position: absolute;
	color: red;
	top: 3px;
	width: 200px;
	font-style: normal;
}
.container ol li div {
	float: left;
	margin-left: 10px;
	height: 30px;
	overflow: hidden;
}
.s2 input, .s1 input, ol li div input {
	height: 28px;
	*height: 27px;
	line-height: 27px;
	width: 230px;
	border-radius: 5px;
	border: solid 1px #a9a9a9;
	padding: 0 5px;
}


#Header img {
	margin-top: 14px;
}
</style>
</head>
<body>
<div id="Body">
   <div id="Header"><a href="#" style='text-decoration:none;'>思考官网<img alt="" src=""></a></div>

    <div id="Content">
        <div id="Content1">

            <div id="query_param">
                <div class="queryLeft" style="min-height: 660px;">
                    <div class="c_tits"><span id="parm_sn">思考在线考试</span>成绩查询<!--  -输入查询条件 --></div>
                    <p class="h2" style="font-size:14px;margin-bottom:35px;text-align:center;margin-top:-20px"><span id="parm_subn">仅限查询当前准考号对应的成绩</span></p>
                    <div class="container">
                        <ol>
                            <li><span>准考证号：</span>
                                <div>
                                    <input name="zkzh" id="zkzh" type="text" alt="准考证号" value="" autocomplete="off">
                                
                                </div>
                            </li>
                            <li class="tip_n"><span>&nbsp;</span>
                                <div>请输入15位准考证号</div>
                            </li>
                            <li><span>姓名：</span>
                                <div>
                                    <input name="sName" id="name"  type="text" alt="姓名" value="" autocomplete="off">
                                </div>
                                <em class="tips" id="nameerror"></em></li>
                            <li class="tip_n"><span>&nbsp;</span>
                                <div>姓名超过3个字，可只输入前3个</div>
                            </li>
                       
                       
                        </ol>

                        <div class="s3">
                            <input id="submitButton" style="cursor:hand;" type="button" value="查询">
                            <input name="button" id="button" type="button" value="重填">
                            <input style="cursor:pointer" onclick="javascript:window.open('index.jsp','_self')" type="button" value="返回">
                        </div>
                    </div>
                </div>

                <div class="intr">
                    <div class="intrtit" style="border-bottom: none;margin-bottom: 0px;"><i></i>常见问题</div>
                
                    <ul>
                        <li style="margin-bottom: 10px;">
                            1、输入准考证号和姓名，点击查询按钮进行查询。
                        </li>
                    
                        <li style="margin-bottom: 10px;">
                            2、如果输入信息正确，对应考试的成绩信息将会在下一个页面列出。
                        </li>
                    </ul>
            
       
                </div>
            </div>
   
        </div>

    </div>
</div>
</body>
</html>
