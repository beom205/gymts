<%@ page contentType="text/html; charset=utf-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<head>
  <!-- Site made with Mobirise Website Builder v4.11.5, https://mobirise.com -->
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="generator" content="Mobirise v4.11.5, mobirise.com">
  <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1">
  <link rel="shortcut icon" href="assets/images/logo2.png" type="image/x-icon">
  <meta name="description" content="">
  
  <title>Home</title>
  <link rel="stylesheet" href="/library/basic-theme2/assets/web/assets/mobirise-icons/mobirise-icons.css">
  <link rel="stylesheet" href="/library/basic-theme2/assets/web/assets/mobirise-icons2/mobirise2.css">
  <link rel="stylesheet" href="/library/basic-theme2/assets/bootstrap/css/bootstrap.min.css">
  <link rel="stylesheet" href="/library/basic-theme2/assets/bootstrap/css/bootstrap-grid.min.css">
  <link rel="stylesheet" href="/library/basic-theme2/assets/bootstrap/css/bootstrap-reboot.min.css">
  <link rel="stylesheet" href="/library/basic-theme2/assets/dropdown/css/style.css">
  <link rel="stylesheet" href="/library/basic-theme2/assets/tether/tether.min.css">
  <link rel="stylesheet" href="/library/basic-theme2/assets/socicon/css/styles.css">
  <link rel="stylesheet" href="/library/basic-theme2/assets/theme/css/style.css">
  <link rel="preload" as="style" href="/library/basic-theme2/assets/mobirise/css/mbr-additional.css">
  <link rel="stylesheet" href="/library/basic-theme2/assets/mobirise/css/mbr-additional.css" type="text/css">
  
  <link rel="stylesheet" href="/library/basic-theme2/signin.css">
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
  <link rel="stylesheet" href="/library/basic-theme2/library/air-datepicker/air-datepicker.css" type="text/css"/>
  <script src="https://code.jquery.com/jquery-3.4.1.min.js"
  integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
  crossorigin="anonymous"></script>

  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">

  <style>
    .navbar-dropdown.bg-color.transparent {
          background: #333333; }
    
    #form1-7 {
      margin-top : 40px;          
    }
  
  </style>
</head>
<body>
  <section class="menu cid-qTkzRZLJNu" once="menu" id="menu1-0">
  	<jsp:include page="/WEB-INF/views/includer/header.jsp"/>
  </section>

	<section class="engine"><a href="https://mobirise.info/e">how to make your own website for free</a></section>
	
	<section class="mbr-section form1 cid-rHFp46Dp98" id="form1-7">
	
	    <div class="container">
	        <div class="row">
	          <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
	            <div class="card card-signin my-5">
	              <div class="card-body">
	                <h4 class="card-title mt-3 text-center">Sign In</h4>
	                <hr class="my-4">
	                <form class="form-signin " action="/signin" method="post" name="login" id="login-form" >
	                  <div class="form-label-group">
	                    <input type="text" id="id"  name="id" class="form-control" placeholder="아이디 입력" autocomplete="off" required autofocus>
	                    <label for="id">ID</label>
	                  </div>
	    
	                  <div class="form-label-group">
	                    <input type="password" id="inputPassword"  name="password" class="form-control" placeholder="비밀번호 입력" required>
	                    <label for="inputPassword">Password</label>
	                  </div>
	                  <div id="invalid-str" class="invalid-feedback">
	                       	이메일 혹은 비밀번호를 확인하세요.	         	
                        </div>
	                  
	<!--     				<a target="_blank" id="join" href="/register">회원가입</a></div> -->
	                  <div class="custom-control mb-3">
	                    <label class="custom-control-label" for="customCheck1">Remember Me</label>
	                  </div>
	                  
	                  <button id="login-btn" class="btn btn-lg btn-primary btn-block text-uppercase" type="button">Sign in</button>
	                	<div class="mt-4 text-center">
							Don't have an account? <a href="/signup">Create One</a>
						</div>
	                </form>
	              </div>
	            </div>
	          </div>
	        </div>
	      </div>
	    
	</section>
	
	<section class="cid-qTkAaeaxX5" id="footer1-2">
		<jsp:include page="/WEB-INF/views/includer/footer.jsp"/>
	</section>

  <script src="/library/basic-theme2/assets/web/assets/jquery/jquery.min.js"></script>
  <script src="/library/basic-theme2/assets/popper/popper.min.js"></script>
  <script src="/library/basic-theme2/assets/bootstrap/js/bootstrap.min.js"></script>
  <script src="/library/basic-theme2/assets/smoothscroll/smooth-scroll.js"></script>
  <script src="/library/basic-theme2/assets/dropdown/js/nav-dropdown.js"></script>
  <script src="/library/basic-theme2/assets/dropdown/js/navbar-dropdown.js"></script>
  <script src="/library/basic-theme2/assets/touchswipe/jquery.touch-swipe.min.js"></script>
  <script src="/library/basic-theme2/assets/parallax/jarallax.min.js"></script>
  <script src="/library/basic-theme2/assets/mbr-switch-arrow/mbr-switch-arrow.js"></script>
  <script src="/library/basic-theme2/assets/tether/tether.min.js"></script>
  <script src="/library/basic-theme2/assets/theme/js/script.js"></script>
  <script src="/library/basic-theme2/assets/formoid/formoid.min.js"></script>
  
  <jsp:include page="/WEB-INF/views/includer/checker.jsp"/>
  <script>
      $(document).ready(function(){

    	  console.log("gUid : ", gUid);
//        $("#menu1-0").load("http://127.0.0.1:5501/hearder.html")
//                /* id 지정을 통해서도 가능합니다. 
//                $("#header").load("header.html #navbar")
//                */      

		ckLoggedIn();

			$('#login-btn').on('click',function(){
				//로그인이 정상적으로 완료되면 로그인 페이지를 호출한 곳으로 이동
				if(checkLoginForm()){ 
					console.log("로그인 완료?")
					location.href="http://70.12.229.181:8080/";			
				}
			});

			//로그인 이메일,비번 체크 후 로그인
			function checkLoginForm() {
				var id = $('#id').val(),
					password = $('#inputPassword').val();
// 				$("#login_invalid").css("display","none");
// 				if (isEmpty(password)) {
// 					$("#login_invalid").css("display","block");
// 					return false;
// 				}
				return doLogin(id, password);
			}

			//로그인 
			function doLogin(userId, password) {
				var url = 'http://70.12.229.181:8080/signin';
				var loginData = {
					id : userId,
					password : password
				};
				var result;
				$.ajax({
					cache : false,
					async : false,
					type : 'POST',
					url : url,
					headers : {
						'Accept' : 'application/json',
						'Content-Type' : 'application/json'
					},
					dataType : 'json',
					data : JSON.stringify(loginData),
					beforeSend : function() {
						//$('#login_email, #login_pw').css('color', '#85c7d3');
					},
					success : function(data) {
						console.log("login success data : ",data);
						result = data.result;
						if (result == false) {
							console.log("로그인 실패");
							 $("#id").addClass('is-invalid');
							 $("#inputPassword").addClass('is-invalid');
							 document.getElementById("invalid-str").style.display="inline-block";
// 							$("#login_invalid").css("display","block");
						} else {
							
						}
					},
					error : function(jqXHR,status, errorThrown) {
						if(errorThrown == "Unauthorized"){
							var ob = jqXHR.responseJSON;
							console.log("ob : "+ ob.text);
							console.log("이메일 인증 및 재발송 페이지로 이동 필요, 구현해야함");
						}
						$("#login_invalid").css("display","block");
						result = false;
					}
				});
				return result;
			}

			//DestUrl 체크
			//올바른 값이 있으면 true, 없거나, login페이지면 false
			function isDestUrl(){
				var nowUrl = window.location.href;
				if(isBlank(destUrl) || destUrl == nowUrl){
					return false;
				}
				return true;
			}

			
	        function chkEmail(str) {
	            var regExp = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
	            if (regExp.test(str)) return true;
	            else return false;
	        }
	
	        function chkPhoneNo(str) {
	            var regExp = /^[0-9]{10,11}$/i;
	            if (regExp.test(str)) return true;
	            else return false;
	        }
	        function chkBirth(str) {
	            var regExp = /^[0-9]{2}\/[0-9]{2}\/[0-9]{4}/i;
	
	            if (regExp.test(str) && (str != '00/00/0000')) return true;
	            else return false;
	        }
	        //8~16자 영문, 숫자 1개 이상, 특수문자 1개 이상을 사용하세요.
	        function chkPassword(str) {
	            var regExp = /^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,16}/i;
	            if (regExp.test(str)) return true;
	            else return false;
	        }
	
	        function chkPasswordConfim(ps1, ps2){
	            console.log("ps1 : ",ps1 ,"ps2",ps2);
	            if(ps1 == ps2){
	                console.log("")
	                return true;
	            }else {
	                return false;
	            }
	        }
	        function isBlank(val){
	            if(val == "" || val== null || val == " "){
	                return true;
	            }
	        }
  });
</script>
</body>
</html>