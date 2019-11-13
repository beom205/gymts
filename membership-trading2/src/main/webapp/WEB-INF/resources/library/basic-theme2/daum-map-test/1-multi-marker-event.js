// 첫번째 테스트
// 마커 여러개 생성하고 각각 클릭, 오버 이벤트 걸어서 마커 변경 및 이벤트 확인

$(function() {

    var positions = [  // 마커의 위치
            new kakao.maps.LatLng(33.44975, 126.56967),
            new kakao.maps.LatLng(33.450579, 126.56956),
            new kakao.maps.LatLng(33.4506468, 126.5707)
        ],
        selectedMarker = null; // 클릭한 마커를 담을 변수

    var mapContainer = document.getElementById('map'), // 지도를 표시할 div
        mapOption = { 
            center: new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
            level: 3 // 지도의 확대 레벨
        };

    var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

    //기본 마커 설정
    var imageSrc = 'http://127.0.0.1:5501/main/marker.png', // 마커이미지의 주소입니다    
        imageSize = new kakao.maps.Size(25,35), // 마커이미지의 크기입니다
        imageOption = {offset: new kakao.maps.Point(20, 38)}; // 마커이미지의 옵션입니다. 마커의 좌표와 일치시킬 이미지 안에서의 좌표를 설정합니다.
            
    // 기본 마커의 이미지정보를 가지고 있는 마커이미지를 생성합니다
    var normalImage = new kakao.maps.MarkerImage(imageSrc, imageSize, imageOption),
        markerPosition = new kakao.maps.LatLng(37.54699, 127.09598); // 마커가 표시될 위치입니다

    //오버 마커
    var overImageSrc = 'http://127.0.0.1:5501/main/marker_over_s.png',
        overImageSize = new kakao.maps.Size(25,35),
        overImageOption = {offset: new kakao.maps.Point(20,38)};

    //오버 마커 이미지 생성    
    var overImage = new kakao.maps.MarkerImage(overImageSrc, overImageSize, overImageOption);    

    // 지도 위에 마커를 표시합니다
    for (var i = 0, len = positions.length; i < len; i++) {
            
        // 마커를 생성하고 지도위에 표시합니다
        addMarker(positions[i]);
    }

    // 마커를 생성하고 지도 위에 표시하고, 마커에 mouseover, mouseout, click 이벤트를 등록하는 함수입니다
    function addMarker(position) {

        // 마커를 생성하고 이미지는 기본 마커 이미지를 사용합니다
        var marker = new kakao.maps.Marker({
            map: map,
            position: position,
            image: normalImage
        });

        // 마커 객체에 마커아이디와 마커의 기본 이미지를 추가합니다
        marker.normalImage = normalImage;

        // 마커에 mouseover 이벤트를 등록합니다
        kakao.maps.event.addListener(marker, 'mouseover', function() {

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
            }else if(selectedMarker == marker){
                marker.setImage(normalImage);
                selectedMarker = null;
                return;
            }

            // 클릭된 마커를 현재 클릭된 마커 객체로 설정합니다
            selectedMarker = marker;
        });
    }

});
 