<%@ page contentType="text/html; charset=utf-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html  >
<head>
  <!-- Site made with Mobirise Website Builder v4.11.5, https://mobirise.com -->
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="generator" content="Mobirise v4.11.5, mobirise.com">
  <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1">
  <link rel="shortcut icon" href="/library/basic-theme2/assets/images/membership-114x114.png" type="image/x-icon">
  <meta name="description" content="Site Builder Description">
  
  <title>Page 1</title>
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
  
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css" />

<!-- jquert 자동완성용 -->
	  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<!-- jquert 자동완성용 -->
  
   <style>
	    .navbar-dropdown.bg-color.transparent {
	          background: #333333;  
	    }
	    
	    #form1-7 {
	      margin-top : 40px;          
	    }
	    
	    .radius_border{border:1px solid #919191;border-radius:5px;}     
/* 		.custom_typecontrol { */
/* 			position:absolute;top:10px;right:10px;overflow:hidden; */
/* 			width:300px;margin:0;padding:0; */
/* 			z-index:10;font-size:12px;font-family:'Malgun Gothic', '맑은 고딕', sans-serif; */
/* 		} */

		.custom_typecontrol { 
 			position:absolute;top:10px;right:10px;overflow:hidden; 
			margin:0;padding:0; 
			z-index:10;font-size:12px;font-family:'Malgun Gothic', '맑은 고딕', sans-serif; 
		} 
	    
	    
	    .form-control {
	    	height: 40px;
	    	min-height: 0em;
	    }
  
  
  
  		/* test */
  		.search-form .form-group {
		  float: right !important;
		  transition: all 0.35s, border-radius 0s;
		  width: 32px;
		  height: 32px;
		  background-color: #fff;
		  box-shadow: 0 1px 1px rgba(0, 0, 0, 0.075) inset;
		  border-radius: 25px;
		  border: 1px solid #ccc;
		}
		.search-form .form-group input.form-control {
		  padding-right: 20px;
		  border: 0 none;
		  background: transparent;
		  box-shadow: none;
		  display:block;
		}
		.search-form .form-group input.form-control::-webkit-input-placeholder { 
		  display: none; 
		} 
		.search-form .form-group input.form-control:-moz-placeholder { 
		  /* Firefox 18- */ 
		  display: none; 
		} 
		.search-form .form-group input.form-control::-moz-placeholder { 
		  /* Firefox 19+ */ 
		  display: none; 
		} 
		.search-form .form-group input.form-control:-ms-input-placeholder { 
		  display: none; 
		} 
		.search-form .form-group:hover, 
		.search-form .form-group.hover { 
		  width: 100%; 
		  border-radius: 4px 25px 25px 4px; 
		} 
		.search-form .form-group span.form-control-feedback {
		  position: absolute;
		  top: -1px; 
		  right: -2px; 
		  z-index: 200; 
		  display: block;
		  width: 34px;
		  height: 34px;
		  line-height: 34px;
		  text-align: center;
		  color: #3596e0;
		  left: initial;
		  font-size: 14px;
		}
  		
/*   		.search-icon{ */
/*   			z-index: 30;  */
/*   		} */
  
  </style>
  
  
</head>
<body>
  <section class="menu cid-qTkzRZLJNu" once="menu" id="menu1-0">
  	<jsp:include page="/WEB-INF/views/includer/header.jsp"/>
  </section>

<section class="engine"><a href="https://mobirise.info/f">easy site creator</a></section>

	<section class="map1 cid-rHCKrWYRqd" id="map1-8">
	
		 <div class="custom_typecontrol ">
<!-- 	        <input type="text" class="inner_input form-control mr-sm-2" placeholder="Search"> -->
 			<form action="" class="search-form">
                <div class="form-group has-feedback">
            		<label for="search" class="sr-only">Search</label>
            		<input type="text" class="form-control" name="search" id="search-input" placeholder="search">
<!--               		<span class="glyphicon glyphicon-search form-control-feedback"></span> -->
              		<span class="fa fa-search form-control-feedback search-icon"></span>
            	</div>
            </form>
	    </div>
		
	    <div id="map" class="google-map" style="width:100%;height:900px; margin-top:70px;"> </div>
	</section>

	<section class="cid-qTkAaeaxX5" id="footer1-2">
		<jsp:include page="/WEB-INF/views/includer/footer.jsp"/>
	</section>


  <script src="/library/basic-theme2/assets/web/assets/jquery/jquery.min.js"></script>
  <script src="/library/basic-theme2/assets/popper/popper.min.js"></script>
  <script src="/library/basic-theme2/assets/bootstrap/js/bootstrap.min.js"></script>
  <script src="/library/basic-theme2/assets/tether/tether.min.js"></script>
  <script src="/library/basic-theme2/assets/dropdown/js/nav-dropdown.js"></script>
  <script src="/library/basic-theme2/assets/dropdown/js/navbar-dropdown.js"></script>
  <script src="/library/basic-theme2/assets/touchswipe/jquery.touch-swipe.min.js"></script>
  <script src="/library/basic-theme2/assets/smoothscroll/smooth-scroll.js"></script>
  <script src="/library/basic-theme2/assets/theme/js/script.js"></script>
  <script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=b88f73c214829c5ab902ccaa171c4747"></script>
  
<!--   <script src="/library/basic-theme2/daum-map-test/2-multi-marker-event-customOverlay.js"></script> -->
	  <jsp:include page="/WEB-INF/views/includer/checker.jsp"/>

  <script src="/js/search-map.js"></script>
  <script>
	

  </script>
  
</body>
</html>