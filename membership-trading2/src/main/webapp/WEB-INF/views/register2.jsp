<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@ page contentType="text/html; charset=utf-8" trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
<title>ㄱ2</title>
<link href="/library/basic-theme/css/bootstrap.css" rel='stylesheet' type='text/css' />
<link href="/library/basic-theme/css/style.css" rel='stylesheet' type='text/css' />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300,700' rel='stylesheet' type='text/css'>
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<script src="/library/basic-theme/js/jquery.min.js"></script>
</head>
<body>
  <div class="menu" id="menu">
	</div>
	<!-- end menu -->
        <div class="main">
          <div class="register-grids">
          	<div class="container">
						<form action="/register" method="post"> 
								<div class="col-md-4">&nbsp;</div>
								<div class="col-md-7">
								<div class="register-top-grid">
										<h3>PERSONAL INFORMATION</h3>
										
										<div>
											<span>아이디<label>*</label></span>
											<input type="text" name="id" maxlength="50"> 
										</div>
										<div class="clear"></div><div class="clear"></div>
										<div>
												<span>비밀번호<label>*</label></span>
											<input type="password" name="password" maxlength="50"> 
										</div>
										<div>
											<span>비밀번호 재확인<label>*</label></span>
											<input type="password" name="passwordcheck" maxlength="50"> 
										</div>
										<div>
												<span>이메일<label>*</label></span>
												<input type="text" name="email"> 
											</div>
											<div>
													<span>휴대전화<label>*</label></span>
													<input type="text" name="phone"> 
												</div>
										<div class="clear"> </div>
											<a class="news-letter" href="#">
												<label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i> </i>이벤트 등 프로모션 알림 메일 수신</label>
											</a>
										<div class="clear"> </div><br>
										<div class="subscribe1">
										<input type="submit" value="가입하기" text-align:center></div>
								</div></div>
								<div class="col-md-1"></div>
								<div class="clear"> </div>
					
								
						</form>
					</div>
				</div>
         </div>
         <div class="footer-bottom">
		   <div class="container">
		 	 <div class="row section group">
				<div class="col-md-4">
				   <h4 class="m_7">Newsletter Signup</h4>
				   <p class="m_8">Lorem ipsum dolor sit amet, consectetuer adipiscing elit sed diam nonummy.</p>
				      <form class="subscribe">
			             <input type="text" value="Insert Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Insert Email';}">
					  </form>
			          <div class="subscribe1">
			            <a href="#">Submit Email<i class="but_arrow"> </i></a>
			          </div>
				</div>
				<div class="col-md-4">
					<div class="f-logo">
						<img src="/library/basic-theme/images/logo.png" alt=""/>
					</div>
					<p class="m_9">Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis</p>
					<p class="address">Phone : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="m_10">(00) 222 666 444</span></p>
					<p class="address">Email : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="m_10">info[at]mycompany.com</span></p>
				</div>
				<div class="col-md-4">
					<ul class="list">
						<h4 class="m_7">Menu</h4>
						<li><a href="#">About</a></li>
						<li><a href="#">Trainers</a></li>
						<li><a href="#">Classes</a></li>
						<li><a href="#">Pricing</a></li>
						<li><a href="#">Privacy</a></li>
						<li><a href="#">Contact</a></li>
					</ul>
					<ul class="list1">
						<h4 class="m_7">Community</h4>
						<li><a href="#">Blog</a></li>
						<li><a href="#">Forum</a></li>
						<li><a href="#">Support</a></li>
						<li><a href="#">Newsletter</a></li>
					</ul>
				</div>
				<div class="clear"></div>
	  		  </div>
		 	</div>
		 </div>
		 <div class="copyright">
		  <div class="container">
		    <div class="copy">
		        <p>© 2014 Template by <a href="http://w3layouts.com" target="_blank"> w3layouts</a></p>
		    </div>
		    <div class="social">	
			   <ul>	
				  <li class="facebook"><a href="#"><span> </span></a></li>
				  <li class="twitter"><a href="#"><span> </span></a></li>
				  <li class="pinterest"><a href="#"><span> </span></a></li>	
				  <li class="google"><a href="#"><span> </span></a></li>
				  <li class="tumblr"><a href="#"><span> </span></a></li>
				  <li class="instagram"><a href="#"><span> </span></a></li>	
				  <li class="rss"><a href="#"><span> </span></a></li>							
			   </ul>
		    </div>
		   <div class="clear"></div>
		  </div>
     </div>

     <script src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>
      <script type="text/javascript">
            $(document).ready(function(){
//               $("#menu").load("header.html")
              /* id 지정을 통해서도 가능합니다. 
              $("#header").load("header.html #navbar")
              */       
            });
      </script>    

</body>
</html>