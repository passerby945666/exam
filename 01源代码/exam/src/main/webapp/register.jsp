<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户注册</title>
<link href="/css/login.css" rel="stylesheet" rev="stylesheet" type="text/css" media="all" />
<link href="/css/demo.css" rel="stylesheet" rev="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="/js/jquery1.42.min.js"></script>
<script type="text/javascript" src="/js/jquery.SuperSlide.js"></script>
<script type="text/javascript" src="/js/Validform_v5.3.2_min.js"></script>


</head>

<body>


<div class="header">
  <h1 class="headerLogo"><a title="思考在线考试系统" target="_blank" href="#"><img alt="logo" style="width:140px" src="images/logo.png"></a></h1>
	<div class="headerNav">
		<a target="_blank" href="#">思考官网</a>
		<a target="_blank" href="#">关于我们</a>
		<a target="_blank" href="#">开发团队</a>
		<a target="_blank" href="#">意见反馈</a>
		<a target="_blank" href="#">帮助</a>	
	</div>
</div>

<div class="banner">

<div class="login-aside">
  <div id="o-box-up"></div>
  <div id="o-box-down"  style="table-layout:fixed;">
   <div class="error-box"></div>
   
   <form class="registerform"action="/stu/register">
   <div class="fm-item">
	   <label for="logonId" class="form-label">系统注册：</label>
	   <input type="text" value=""  placeholder="请输入账号" maxlength="16" name="sNo" class="i-text"  datatype="s6-18" errormsg="账号至少6个字符,最多18个字符！"  >
       <div class="ui-form-explain"></div>
  </div>
  
  <div class="fm-item">
	   <label for="logonId" class="form-label">密码：</label>
	   <input type="password" value=""  placeholder="请输入密码"maxlength="32" name="sPassword" class="i-text" datatype="*6-16" nullmsg="请设置密码！" errormsg="密码范围在6~16位之间！">
       <div class="ui-form-explain"></div>
  </div>
  
    <div class="fm-item">
	   <label for="logonId" class="form-label">确认密码：</label>
	   <input type="password" value=""  placeholder="请输入确认密码"maxlength="32" name="Cpassword" class="i-text" datatype="*6-16" nullmsg="请设置确认密码！" errormsg="密码范围在6~16位之间！">
       <div class="ui-form-explain"></div>
  </div>
  
  <!--<div class="fm-item pos-r">
	   <label for="logonId" class="form-label">验证码</label>
	   <input type="text" value="输入验证码" maxlength="100" id="yzm" class="i-text yzm" nullmsg="请输入验证码！" >    
       <div class="ui-form-explain"><img src="images/yzm.jpg" class="yzm-img" /></div>
  </div>-->
  
  <div class="fm-item">
	   <label for="logonId" class="form-label"></label>
	   <input type="submit" value="" tabindex="4" id="send-btn" class="btn-login"> 
       <div class="ui-form-explain"></div>
  </div>
  
  </form>
  
  </div>

</div>

	<div class="bd">
		<ul>
			<li style="background:url(themes/theme-pic1.jpg) #CCE1F3 center 0 no-repeat;"><a target="_blank" href="#"></a></li>
			<li style="background:url(themes/theme-pic2.jpg) #BCE0FF center 0 no-repeat;"><a target="_blank" href="#"></a></li>
		</ul>
	</div>

	<div class="hd"><ul></ul></div>
</div>
<script type="text/javascript">jQuery(".banner").slide({ titCell:".hd ul", mainCell:".bd ul", effect:"fold",  autoPlay:true, autoPage:true, trigger:"click" });</script>


<div class="banner-shadow"></div>

<div class="footer">
	<p>Copyright © 2019 - 2099 sk. All Rights Reserved. 青软思考 版权所有</p>
</div>

</body>
</html>
