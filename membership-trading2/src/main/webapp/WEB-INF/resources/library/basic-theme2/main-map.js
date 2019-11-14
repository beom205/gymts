$(function() {
    //일정 총 일 수 getDruation 함수에서 값 입력
    var itiDuration,
        //일정의 모든 콘텐츠를 담는 변수(dayContList의 배열임 : 2차원 배열)
        itiContList=[],
        gCurDay,
        gPlaceDetailOpen = false;
    
    showPlanInit();
    
    function showPlanInit(){
        initPlanValues();
    }
    
    function initPlanValues(){
        
        // var container = document.getElementById('map'); //지도를 담을 영역의 DOM 레퍼런스
        // var options = { //지도를 생성할 때 필요한 기본 옵션
        //     center: new kakao.maps.LatLng(33.450701, 126.570667), //지도의 중심좌표.
        //     level: 3 //지도의 레벨(확대, 축소 정도)
        // };

        // var map = new kakao.maps.Map(container, options); //지도 생성 및 객체 리턴

        var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
            mapOption = { 
                center: new kakao.maps.LatLng(37.54699, 127.09598), // 지도의 중심좌표
                level: 4 // 지도의 확대 레벨
            };

        var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

        var selectedMarker = null; //클릭한 마커를 담을 변수

        var imageSrc = 'http://127.0.0.1:5500/main/marker.png', // 마커이미지의 주소입니다    
            imageSize = new kakao.maps.Size(25,35), // 마커이미지의 크기입니다
            imageOption = {offset: new kakao.maps.Point(20, 38)}; // 마커이미지의 옵션입니다. 마커의 좌표와 일치시킬 이미지 안에서의 좌표를 설정합니다.
            
        // 마커의 이미지정보를 가지고 있는 마커이미지를 생성합니다
        var normalImage = new kakao.maps.MarkerImage(imageSrc, imageSize, imageOption),
            markerPosition = new kakao.maps.LatLng(37.54699, 127.09598); // 마커가 표시될 위치입니다

        var overImageSrc = 'http://127.0.0.1:5500/main/marker_over_s.png',
            overImageSize = new kakao.maps.Size(25,35),
            overImageOption = {offset: new kakao.maps.Point(20,38)};

        var overImage = new kakao.maps.MarkerImage(overImageSrc, overImageSize, overImageOption);

        // 마커를 생성합니다
        var marker = new kakao.maps.Marker({
            position: markerPosition, 
            image: normalImage // 마커이미지 설정 
        });

        // 마커가 지도 위에 표시되도록 설정합니다
        marker.setMap(map);  

        // 마커 객체에 마커아이디와 마커의 기본 이미지를 추가합니다
        marker.normalImage = normalImage;

        kakao.maps.event.addListener(marker,'mouseover',function(){
            // 클릭된 마커가 없고, mouseover된 마커가 클릭된 마커가 아니면
            // 마커의 이미지를 오버 이미지로 변경합니다
            if (!selectedMarker || selectedMarker !== marker) {
                marker.setImage(overImage);
            }
        });

        // 마커에 mouseout 이벤트를 등록합니다
        kakao.maps.event.addListener(marker, 'mouseout', function() {

            // 클릭된 마커가 없고, mouseout된 마커가 클릭된 마커가 아니면
            // 마커의 이미지를 기본 이미지로 변경합니다
            if (!selectedMarker || selectedMarker !== marker) {
                marker.setImage(normalImage);
            }
        });

    // 마커에 click 이벤트를 등록합니다
    kakao.maps.event.addListener(marker, 'click', function() {

        // 클릭된 마커가 없고, click 마커가 클릭된 마커가 아니면
        // 마커의 이미지를 클릭 이미지로 변경합니다
        if (!selectedMarker || selectedMarker !== marker) {

            // 클릭된 마커 객체가 null이 아니면
            // 클릭된 마커의 이미지를 기본 이미지로 변경하고
            !!selectedMarker && selectedMarker.setImage(selectedMarker.normalImage);

            // 현재 클릭된 마커의 이미지는 클릭 이미지로 변경합니다
            marker.setImage(overImage);
        }

        // 클릭된 마커를 현재 클릭된 마커 객체로 설정합니다
        selectedMarker = marker;
    });

        


        //지도
//		initMap(document.getElementById('plan_map'));
        // gMapObj.mapEle = document.getElementById('google-map');
        
        //title
        // $(".coverTit p").text(itiDTO.title);
//		let te = $(".coverTit p").text();
//		console.log("te : ",te);
        //likes
        // drawLikes();
        //duration
        // $(".coverDate p").html(getDruation());
        
        // //place count
        // drawPlaceCount();
        
        // //budget
        // drawBudget();
        
        // //companion
        // $(".coverCompanion p").text(companionConverter(itiDTO.companion));
        
        // //theme(placeTypeName)
        // let theme = changeTravelType(itiDTO.placeTypeName.split('|')),
        //     themeBox = document.getElementsByClassName('coverTheme')[0]; 
        // drawTheme(themeBox,theme);
        
        // //nickName
        // drawWriter();
        
        // //작성자 유저 페이지
        // let writerPageHTML = "<a href='/user/page/"+itiDTO.nickName+"'> Go to Creator's plan</a>";
        // $('.coverCont_right3rd').html(writerPageHTML);
        
        // //일정 days
        // drawDayElements();
        
        // //일정 contents
        // initDay1ContentsList();
        
        // //썸네일
        // var random = Math.floor(Math.random() * 5) + 1;
        // // 대체 이미지
        // $('.plan_finCoverImg').one('error', function(e){
        //     e.preventDefault();
        //     $(this).attr('src', '/resources/img/city_country/noimg_city/city_'+random+'.jpg');
        // });
//		// 대체 이미지
//	    $('.plan_finCoverImg').one('error', function(e){
//			e.preventDefault();
//			$(this).attr('src', '/resources/img/city_country/Sightseeing_noimg.jpg');
//		});
        
    }

});
 