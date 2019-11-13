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
<title>Free Gym Website Template | Register :: w3layouts</title>
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
						<form action="/register" method="post" onsubmit="return insertSubmit()">
								<div class="col-md-4">&nbsp;</div>
								<div class="col-md-7">
								<div class="register-top-grid">
										<h3>PERSONAL INFORMATION</h3>
										
										<div>
											<span>아이디<label>*</label></span>
											<input type="text" id="id" name="id" maxlength="50"> 
										</div>
										<div class="clear"></div><div class="clear"></div>
										<div>
												<span>비밀번호<label>*</label></span>
											<input type="password" id="password" name="password" maxlength="50"> 
										</div>
										<div>
											<span>비밀번호 재확인<label>*</label></span>
											<input type="password" id="passwordcheck" name="passwordcheck" maxlength="50"> 
										
										</div>
										<div>
												<span>이메일<label>*</label></span>
												<input type="text" id="email" name="email"> 
											</div>
											<div>
													<span>휴대전화<label>*</label></span>
													<input type="text" id="phone" name="phone"> 
												</div>
										<div class="clear"> </div>
											<a class="news-letter" href="#">
												<label class="checkbox"><input type="checkbox" id="checkbox" name="checkbox" checked=""><i> </i>이벤트 등 프로모션 알림 메일 수신</label>
											</a>
										<div class="clear"> </div><br>
										<div class="subscribe1">
										<input type="submit" value="가입하기" text-align:center ></div>
								</div></div>
								<div class="col-md-1"></div>
								<div class="clear"> </div>
					
								
						</form>
					</div>
				</div>
         </div>
         <div class="footer-bottom">
		   <div class="container">


				<div class="clear"></div>
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
       <script>     
     
        function insertSubmit(){
        if(insertCheck()==false) return false;
      
        alert("회원가입 완료");
        } //모두 작성시 저장완료
        
        
    function insertCheck(){
        
        if($.trim($('#id').val())==''){
            alert("아이디를 입력하세요");
            $('#id').focus();
            return false;
            } //아이디 미작성 시 
            
            var isID = /^[a-z0-9][a-z0-9_\-]{4,19}$/;
            if (!isID.test($('#id').val())) {
           	 alert("아이디는 5~20자의 영문 소문자, 숫자와 특수기호(_),(-)만 사용 가능합니다");
                $('#id').value = "";
                $('#id').focus();
                return false;
            }

        if($.trim($('#password').val())==''){
            alert("비밀번호를 입력하세요");
            $('#password').focus();
            return false;
            } //비밀번호 미작성 시
            
           var isPassword = /^[a-zA-z0-9]{4,12}$/; //비밀번호 유효성 검사
            if (!isPassword.test($('#password').val())) {
                alert("비밀번호는 영문 대소문자와 숫자 4~12자리로 입력해야합니다");
                $('#password').value = "";
                $('#password').focus();
                return false;
            }
            
        if($.trim($('#passwordcheck').val())==''){
            alert("비밀번호 재확인을 입력하세요");
            $('#passwordcheck').focus();
            return false;
            } //비밀번호 재확인 미작성 시
            
            if ($("#password").val() != $("#passwordcheck").val()) {
            	alert("비밀번호가 일치하지 않습니다.");
            	$('#passwordcheck').focus();
                return false;
            } 

            
            
            
        if($.trim($('#email').val())==''){
            alert("이메일을 입력하세요");
            $('#email').focus();
            return false;
            } //이메일 미작성 시
            
            var isEmail = /^[A-Za-z0-9_]+[A-Za-z0-9]*[@]{1}[A-Za-z0-9]+[A-Za-z0-9]*[.]{1}[A-Za-z]{1,3}$/;
            if (!isEmail.test($('#email').val())) {
                alert("이메일 형식이 올바르지 않습니다");
                $('#email').value = "";
                $('#email').focus();
                return false;
            }           
            
            
        if($.trim($('#phone').val())==''){
            alert("전화번호를 입력하세요");
            $('#phone').value="";
            $('#phone').focus();
            return false;
            } //전화번호 미작성 시 
            
            
            var isPhone = /^(01[016789]{1}|02|0[3-9]{1}[0-9]{1})-?[0-9]{3,4}-?[0-9]{4}$/;
            if (!isPhone.test($('#phone').val())) {
                alert("전화번호를 다시 확인해주세요");
                $('#phone').value = "";
                $('#phone').focus();
                return false;
            }           

           

        }
  
</script>



</body>
</html>