/**
 *  show map page에서 지도로 찾기
 */

$(function() { 
	
	ckLoggedIn();
	
	var mapContainer = document.getElementById('map'),
	    mapOption = { 
	        center: new kakao.maps.LatLng(37.501283, 127.039505), // 지도의 중심좌표
	        level: 3 // 지도의 확대 레벨
	    };
	
	var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다
	
	// 일반 지도와 스카이뷰로 지도 타입을 전환할 수 있는 지도타입 컨트롤을 생성합니다
	var mapTypeControl = new kakao.maps.MapTypeControl();
	
	//jquery ajax 자동완성
//	  function log( message ) {
//	      $( "<div>" ).text( message ).prependTo( "#log" );
//	      $( "#log" ).scrollTop( 0 );
//	    }
//
//	    $( "#search-input" ).autocomplete({
//	      source: function( request, response ) {
//	        $.ajax({
//	          url: "http://localhost:8080/search",
//	          dataType: "JSON",
//	          data: {
//	            q: request.term
//	          },
//	          success: function( data ) {
//	            response( data );
//	          }
//	        });
//	      },
//	      minLength: 3,
//	      select: function( event, ui ) {
//	        log( ui.item ?
//	          "Selected: " + ui.item.label :
//	          "Nothing selected, input was " + this.value);
//	      },
//	      open: function() {
//	        $( this ).removeClass( "ui-corner-all" ).addClass( "ui-corner-top" );
//	      },
//	      close: function() {
//	        $( this ).removeClass( "ui-corner-top" ).addClass( "ui-corner-all" );
//	      }
//	    });
	
	//ajax test
//	$.ajax({
//		type: 'GET',
//		url: '/search',
//		dataType: 'json'
//	}).done(funtion(data){
//		console.log("ajax done data: ",data);
//	});
	
	$.ajax({
		type : "GET",
		url : "/map/search",
		dataType : "JSON",
	})
	.done(function(result){
		console.log("ajax done result : ",result);
	});
	
});