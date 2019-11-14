<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script>

var gUid='${uid}';

//callBack : 실행할 함수, 이 callBack 함수의 파라미터로 boolean이 오거나 안와도된다.
function ckLoggedIn(callBack){
	callCkAjax(callBack);
}
//로그인 체크 Ajax
//로그인 된 상태: data.isLoggedIn = true , 로그아웃 상태: data.isLoggedIn = false
function callCkAjax(callBack){
	
	var ele = document.getElementById('signin-target');
	
	if(gUid){
		ele.innerHTML = '<span class="mobi-mbri mobi-mbri-user-2 mbr-iconfont mbr-iconfont-btn"></span> '
			+ 'Log out ';
		ele.href="/logout";
	}else {
		ele.innerHTML = '<span class="mobi-mbri mobi-mbri-user-2 mbr-iconfont mbr-iconfont-btn"></span> '
			+ 'Sign in ';
		ele.href="/signin";
	}
}


</script>