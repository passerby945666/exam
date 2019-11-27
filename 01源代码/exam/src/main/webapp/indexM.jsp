<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html class="no-js" lang="en">

    <head>
        <!-- meta data -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

        <!--font-family-->
		<link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
        
        <!-- title of site -->
        <title>思考官网</title>

        <!-- For favicon png -->
		<link rel="shortcut icon" type="image/icon" href="assets/logo/favicon.png"/>
       
        <!--font-awesome.min.css-->
        <link rel="stylesheet" href="assets/css/font-awesome.min.css">

        <!--linear icon css-->
		<link rel="stylesheet" href="assets/css/linearicons.css">

		<!--animate.css-->
        <link rel="stylesheet" href="assets/css/animate.css">

		<!--flaticon.css-->
        <link rel="stylesheet" href="assets/css/flaticon.css">

		<!--slick.css-->
        <link rel="stylesheet" href="assets/css/slick.css">
		<link rel="stylesheet" href="assets/css/slick-theme.css">
		
        <!--bootstrap.min.css-->
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
		
		<!-- bootsnav -->
		<link rel="stylesheet" href="assets/css/bootsnav.css" >	
        
        <!--style.css-->
        <link rel="stylesheet" href="assets/css/style.css">
        
        <!--responsive.css-->
        <link rel="stylesheet" href="assets/css/responsive.css">
        
        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
		
        <!--[if lt IE 9]>
			<script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
			<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>
	
	<body>
		<!--[if lte IE 9]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="https://browsehappy.com/">upgrade your browser</a> to improve your experience and security.</p>
        <![endif]-->
		
		<!--header-top start -->
		<header id="header-top" class="header-top">
			<ul>
				<li>
					<div class="header-top-left">
						<ul>
								<li class="select-opt">
															<select name="language" id="language">
																<option value="default">EN</option>
																<option value="Bangla">BN</option>
																<option value="Arabic">AB</option>
															</select>
														</li>
							<li >
							</li>
						</ul>
					</div>
				</li>
				<li class="head-responsive-right pull-right">
					<div class="header-top-right">
						<ul>
							<li class="header-top-contact">
								<a href="login.jsp">登录</a>
							</li>
							<li class="header-top-contact">
								<a href="register.jsp">注册</a>
							</li>
						</ul>
					</div>
				</li>
			</ul>
					
		</header><!--/.header-top-->
		<!--header-top end -->

		<!-- top-area Start -->
		<section class="top-area">
			<div class="header-area">
				<!-- Start Navigation -->
			    <nav class="navbar navbar-default bootsnav  navbar-sticky navbar-scrollspy"  data-minus-value-desktop="70" data-minus-value-mobile="55" data-speed="1000">

			        <div class="container">

			            <!-- Start Header Navigation -->
			            <div class="navbar-header">
			                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-menu">
			                    <i class="fa fa-bars"></i>
			                </button>
			                <a class="navbar-brand" href="indexM.jsp">思考<span>在线</span></a>

			            </div><!--/.navbar-header-->
			            <!-- End Header Navigation -->

			            <!-- Collect the nav links, forms, and other content for toggling -->
			            <div class="collapse navbar-collapse menu-ui-design" id="navbar-menu">
			                <ul class="nav navbar-nav navbar-right" data-in="fadeInDown" data-out="fadeOutUp">
			                    <li class=" scroll active"><a href="#home">首页</a></li>
			                    <li class="scroll"><a href="#works">关于我们</a></li>
								<li class="scroll"><a href="#reviews">考试动态</a></li>
			                    <li class="scroll"><a href="#explore">开发团队</a></li>
			                    <li class="scroll"><a href="#blog">常见问题</a></li>
			                </ul><!--/.nav -->
			            </div><!-- /.navbar-collapse -->
			        </div><!--/.container-->
			    </nav><!--/nav-->
			    <!-- End Navigation -->
			</div><!--/.header-area-->
		    <div class="clearfix"></div>

		</section><!-- /.top-area-->
		<!-- top-area End -->

		<!--welcome-hero start -->
		<section id="home" class="welcome-hero">
			<div class="container">
				<div class="welcome-hero-txt">
					<h2>FIND AND EXPLORE </h2>
				</div>
			<%--	<div class="welcome-hero-serch-box">
					<div class="welcome-hero-form">--%>
					<%-- 	<div class="single-welcome-hero-form">
							<h3>what?</h3>
							<form action="index.html">
								<input type="text" placeholder="Ex: palce, resturent, food, automobile" />
							</form>

						</div> --%>
					<%--	<div class="single-welcome-hero-form">
						
							<form action="index.html">
								<input type="text" placeholder="Ex: london, newyork, rome" />
							</form>
							<div class="welcome-hero-form-icon">
								<i class="flaticon-gps-fixed-indicator"></i>
							</div>
						</div>
					</div>--%>
				<%--	<div class="welcome-hero-serch">
						<button class="welcome-hero-btn" onclick="window.location.href='#'">
							 search  <i data-feather="search"></i> 
						</button>
					</div>--%>
				</div>
			</div>

		</section><!--/.welcome-hero-->
		<!--welcome-hero end -->

		<!--list-topics start -->
		<section id="list-topics" class="list-topics">
			<div class="container">
				<div class="list-topics-content">
					<ul>
						<li>

							<div class="single-list-topics-content">
								<%-- <div class="single-list-topics-icon">
									<i class="flaticon-restaurant"></i>
								</div>--%>
								<h2><a href="/indexM.jsp">项目介绍</a></h2>
							</div>

						</li>
						<li>
							<button href="indexM.jsp">
							<div class="single-list-topics-content">
							<%--	<div class="single-list-topics-icon">
									<i class="flaticon-travel"></i>
								</div>--%>
								<h2><a href="/login.jsp">在线报名</a></h2>
							</div>
								</button>
						</li>
						<li>
							<button>
							<div class="single-list-topics-content">
							<%--	<div class="single-list-topics-icon">
									<i class="flaticon-building"></i>
								</div>--%>
								<h2><a href="/infograde.jsp">成绩查询</a></h2>
							</div>
								</button>
						</li>
						<li>

							<div class="single-list-topics-content">
							<%--	<div class="single-list-topics-icon">
									<i class="flaticon-pills"></i>
								</div>--%>
								<h2><a href="/login.jsp">考试安排</a></h2>
							</div>

						</li>
						<li>
							<div class="single-list-topics-content">
						<%--<div class="single-list-topics-icon">
									<i class="flaticon-transport"></i>
								</div>--%>
								<h2><a href="/login.jsp">证书查询</a></h2>
							</div>
						</li>
					</ul>
				</div>
			</div><!--/.container-->

		</section><!--/.list-topics-->
		<!--list-topics end-->

		<!--works start -->
		<section id="works" class="works">
			<div class="container">
				<div class="section-header">
					<h2>关于我们</h2>
				</div><!--/.section-header-->
				<div class="works-content">
					<div class="row">
						<div class="col-md-4 col-sm-6">
							<div class="single-how-works">
								<h2><a href="#">choose <span> what to</span> do</a></h2>
								<p>
									Lorem ipsum dolor sit amet, consecte adipisicing elit, sed do eiusmod tempor incididunt ut laboremagna aliqua. 
								</p>
								<button class="welcome-hero-btn how-work-btn" onclick="window.location.href='#'">
									更多
								</button>
							</div>
						</div>

						<div class="col-md-4 col-sm-6">
							<div class="single-how-works">
								<h2><a href="#">find <span> what you want</span></a></h2>
								<p>
									Lorem ipsum dolor sit amet, consecte adipisicing elit, sed do eiusmod tempor incididunt ut laboremagna aliqua. 
								</p>
								<button class="welcome-hero-btn how-work-btn" onclick="window.location.href='#'">
									更多
								</button>
							</div>
						</div>
						<div class="col-md-4 col-sm-6">
							<div class="single-how-works">
								<h2><a href="#">explore <span> amazing</span> place</a></h2>
								<p>
									Lorem ipsum dolor sit amet, consecte adipisicing elit, sed do eiusmod tempor incididunt ut laboremagna aliqua. 
								</p>
								<button class="welcome-hero-btn how-work-btn" onclick="window.location.href='#'">
									更多
								</button>
							</div>
						</div>


						<div class="col-md-4 col-sm-6">
							<div class="single-how-works">
								<h2><a href="#">explore <span> amazing</span> place</a></h2>
								<p>
									Lorem ipsum dolor sit amet, consecte adipisicing elit, sed do eiusmod tempor incididunt ut laboremagna aliqua.
								</p>
								<button class="welcome-hero-btn how-work-btn" onclick="window.location.href='#'">
									更多
								</button>
							</div>
						</div>

					</div>
				</div>
			</div><!--/.container-->
		
		</section><!--/.works-->
		<!--works end -->




		<!--reviews start -->
		<section id="reviews" class="reviews">
			<div class="section-header">
				<h2>考试动态</h2>
			</div><!--/.section-header-->
			<div class="reviews-content">
				<div class="testimonial-carousel">
					<div class="single-testimonial-box">
						<div class="testimonial-description">
							<div class="testimonial-info">
								<div class="testimonial-person">
									<h2>2019年下半年思考英语考试时间及报名方式</h2>
								</div><!--/.testimonial-person-->
							</div><!--/.testimonial-info-->
							<div class="testimonial-comment">
								<p>
									一、考试科目及时间
									<br>  英语考试考试时间为12月23日 9:00-11:20（F999次）<br>
									二、报名方式
									　<br>　第一阶段：11月23日9时-11月30日17时</br>
									　　考生登录思考在线考试网站，点击考试报名栏目进行报名完成信息填报等报名手续
									<br>  第二阶段：12月20日9时开始</br>
									　　成功完成报名的考生登录思考在线考试网站查看考生的考试具体时间

								</p>
							</div><!--/.testimonial-comment-->
						</div><!--/.testimonial-description-->
					</div><!--/.single-testimonial-box-->
					<div class="single-testimonial-box">
						<div class="testimonial-description">
							<div class="testimonial-info">
								<div class="testimonial-person">
									<h2>2018年下半年思考考试成绩发布通知</h2>
								</div><!--/.testimonial-person-->
							</div><!--/.testimonial-info-->
							<div class="testimonial-comment">
								<p>
									一、发布时间
									<br> 2019年2月21日9时 ）<br>
									二、发布内容
									　<br>2019年上半年思考英语考试成绩</br>
									<br> 2019年上半年思考语文考试成绩</br>
									<br> 2019年上半年思考计算机等级考试成绩</br>
									三、查询方式
									<br><a href="infograde.jsp">点这里</a></br>
								</p>
							</div><!--/.testimonial-comment-->
						</div><!--/.testimonial-description-->
					</div><!--/.single-testimonial-box-->
					<div class="single-testimonial-box">
						<div class="testimonial-description">
							<div class="testimonial-info">

								<div class="testimonial-person">
									<h2>2019年下半年思考语文考试时间及报名方式</h2>
								</div><!--/.testimonial-person-->
							</div><!--/.testimonial-info-->
							<div class="testimonial-comment">
								<p>
									一、考试科目及时间
									<br>  语文考试考试时间为12月18日 9:00-11:20（G999次）<br>
									二、报名方式
									　<br>　第一阶段：11月22日9时-11月30日17时</br>
									　　考生登录思考在线考试网站，点击考试报名栏目进行报名完成信息填报等报名手续
									<br>  第二阶段：12月15日9时开始</br>
									　　成功完成报名的考生登录思考在线考试网站查看考生的考试具体时间
								</p>
							</div><!--/.testimonial-comment-->
						</div><!--/.testimonial-description-->
					</div><!--/.single-testimonial-box-->
					<div class="single-testimonial-box">
						<div class="testimonial-description">
							<div class="testimonial-info">
								<div class="testimonial-person">
									<h2>2019下年上半年思考英语考试时间及报名方式</h2>
								</div><!--/.testimonial-person-->
							</div><!--/.testimonial-info-->
							<div class="testimonial-comment">
								<p>
									一、考试科目及时间
									<br>  英语考试考试时间为12月23日 9:00-11:20（F999次）<br>
									二、报名方式
									　<br>　第一阶段：11月23日9时-11月30日17时</br>
									　　考生登录思考在线考试网站，点击考试报名栏目进行报名完成信息填报等报名手续
									<br>  第二阶段：12月20日9时开始</br>
									　　成功完成报名的考生登录思考在线考试网站查看考生的考试具体时间
								</p>
							</div><!--/.testimonial-comment-->
						</div><!--/.testimonial-description-->
					</div><!--/.single-testimonial-box-->
					<div class="single-testimonial-box">
						<div class="testimonial-description">
							<div class="testimonial-info">
								<div class="testimonial-person">
									<h2>2018年下半年思考英语成绩考试时间及报名方式</h2>
								</div><!--/.testimonial-person-->
							</div><!--/.testimonial-info-->
							<div class="testimonial-comment">
								<p>
									一、考试科目及时间
									<br>  英语考试考试时间为12月23日 9:00-11:20（F999次）<br>
									二、报名方式
									　<br>　第一阶段：11月23日9时-11月30日17时</br>
									　　考生登录思考在线考试网站，点击考试报名栏目进行报名完成信息填报等报名手续
									<br>  第二阶段：12月20日9时开始</br>
									　　成功完成报名的考生登录思考在线考试网站查看考生的考试具体时间
								</p>
							</div><!--/.testimonial-comment-->
						</div><!--/.testimonial-description-->
					</div><!--/.single-testimonial-box-->
					<div class="single-testimonial-box">
						<div class="testimonial-description">
							<div class="testimonial-info">

								<div class="testimonial-person">
									<h2>2019年下半年CET考试时间及报名方式</h2>
								</div><!--/.testimonial-person-->
							</div><!--/.testimonial-info-->
							<div class="testimonial-comment">
								<p>
									一、考试科目及时间
									<br>  英语考试考试时间为12月23日 9:00-11:20（F999次）<br>
									二、报名方式
									　<br>　第一阶段：11月23日9时-11月30日17时</br>
									　　考生登录思考在线考试网站，点击考试报名栏目进行报名完成信息填报等报名手续
									<br>  第二阶段：12月20日9时开始</br>
									　　成功完成报名的考生登录思考在线考试网站查看考生的考试具体时间
								</p>
							</div><!--/.testimonial-comment-->
						</div><!--/.testimonial-description-->
					</div><!--/.single-testimonial-box-->
					<div class="single-testimonial-box">
						<div class="testimonial-description">
							<div class="testimonial-info">
								<div class="testimonial-person">
									<h2>2019年下半年CET考试时间及报名方式</h2>
								</div><!--/.testimonial-person-->
							</div><!--/.testimonial-info-->
							<div class="testimonial-comment">
								<p>
									一、考试科目及时间
									<br>  英语考试考试时间为12月23日 9:00-11:20（F999次）<br>
									二、报名方式
									　<br>　第一阶段：11月23日9时-11月30日17时</br>
									　　考生登录思考在线考试网站，点击考试报名栏目进行报名完成信息填报等报名手续
									<br>  第二阶段：12月20日9时开始</br>
									　　成功完成报名的考生登录思考在线考试网站查看考生的考试具体时间
								</p>
								</p>
							</div><!--/.testimonial-comment-->
						</div><!--/.testimonial-description-->
					</div><!--/.single-testimonial-box-->
					<div class="single-testimonial-box">
						<div class="testimonial-description">
							<div class="testimonial-info">
								<div class="testimonial-person">
									<h2>2019年下半年CET考试时间及报名方式</h2>
								</div><!--/.testimonial-person-->
							</div><!--/.testimonial-info-->
							<div class="testimonial-comment">
								<p>
									一、考试科目及时间
									<br>  英语考试考试时间为12月23日 9:00-11:20（F999次）<br>
									二、报名方式
									　<br>　第一阶段：11月23日9时-11月30日17时</br>
									　　考生登录思考在线考试网站，点击考试报名栏目进行报名完成信息填报等报名手续
									<br>  第二阶段：12月20日9时开始</br>
									　　成功完成报名的考生登录思考在线考试网站查看考生的考试具体时间
								</p>
								</p>
							</div><!--/.testimonial-comment-->
						</div><!--/.testimonial-description-->
					</div><!--/.single-testimonial-box-->
				</div>
			</div>

		</section><!--/.reviews-->
		<!--reviews end -->




		<!--blog start -->
		<section id="blog" class="blog" >
			<div class="container">
				<div class="section-header">
					<h2>常见问题</h2>
				</div><!--/.section-header-->
				<div class="blog-content">
					<div class="row">
						<div class="col-md-4 col-sm-6">
							<div class="single-blog-item">
								<div class="single-blog-item-txt">
									<h2><a href="#">什么是思考在线考试（SK）？</a></h2>
									<p>
										思考在线考试，系思考主办统一标准化考试，由思考考试中心组织实施的统一标准化考试。
									</p>
								</div>
							</div>
						</div>
						<div class="col-md-4 col-sm-6">
							<div class="single-blog-item">
								<div class="single-blog-item-txt">
									<h2><a href="#">思考在线考试所包含的科目？</a></h2>
									<p>
										　　英语四级、六级，Java二级、四级，网络技术二级、三级、数据库二级、三级和四级。
									</p>
								</div>
							</div>
						</div>
						<div class="col-md-4 col-sm-6">
							<div class="single-blog-item">
								<div class="single-blog-item-txt">
									<h2><a href="#">思考在线考试报考资格及如何报名？</a></h2>
									<p>
										SK笔试报考资格为全日制普通高等院校本科、专科在校生、专科在校生，在籍研究生。
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div><!--/.container-->

		</section><!--/.blog-->
		<!--blog end -->




		<!--footer start-->
		<footer id="footer"  class="footer">
			<div class="container">
		
				<div class="hm-footer-copyright">
					<div class="row">
						<div class="col-sm-5">
							<p>
								Copyright © 2019 - 2099 sk. All Rights Reserved. 青软思考 版权所有
							</p><!--/p-->
						</div>
						<div class="col-sm-7">
							<div class="footer-social">
								<a href="#"><i class="fa fa-facebook"></i></a>	
								<a href="#"><i class="fa fa-twitter"></i></a>
								<a href="#"><i class="fa fa-linkedin"></i></a>
								<a href="#"><i class="fa fa-google-plus"></i></a>
							</div>
						</div>
					</div>
					
				</div><!--/.hm-footer-copyright-->
			</div><!--/.container-->

			<div id="scroll-Top">
				<div class="return-to-top">
					<i class="fa fa-angle-up " id="" data-toggle="tooltip" data-placement="top" title="" data-original-title="Back to Top" aria-hidden="true"></i>
				</div>
				
			</div><!--/.scroll-Top-->
			
        </footer><!--/.footer-->
		<!--footer end-->
		
		<!-- Include all js compiled plugins (below), or include individual files as needed -->

		<script src="assets/js/jquery.js"></script>
        
        <!--modernizr.min.js-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.min.js"></script>
		
		<!--bootstrap.min.js-->
        <script src="assets/js/bootstrap.min.js"></script>
		
		<!-- bootsnav js -->
		<script src="assets/js/bootsnav.js"></script>

        <!--feather.min.js-->
        <script  src="assets/js/feather.min.js"></script>

        <!-- counter js -->
		<script src="assets/js/jquery.counterup.min.js"></script>
		<script src="assets/js/waypoints.min.js"></script>

        <!--slick.min.js-->
        <script src="assets/js/slick.min.js"></script>

		<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
		     
        <!--Custom JS-->
        <script src="assets/js/custom.js"></script>
        
    </body>
	
</html>