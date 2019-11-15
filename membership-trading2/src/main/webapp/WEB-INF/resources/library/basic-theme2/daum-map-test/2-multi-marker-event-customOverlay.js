// 두번째 테스트
// 이제 첫번째 테스트에서 생성한 마커에
// 클릭 시 커스텀 오버레이 노출 설정

var overlay;
var callURL = 'http://127.0.0.1:8080';
$(function() {

    var positions = [  // 마커의 위치
            new kakao.maps.LatLng(37.498509, 127.035882),
            new kakao.maps.LatLng(37.504066, 127.040130),
            new kakao.maps.LatLng(37.501070, 127.040245)
        ],
        selectedMarker = null; // 클릭한 마커를 담을 변수

    var mapContainer = document.getElementById('map'), // 지도를 표시할 div
        mapOption = { 
            center: new kakao.maps.LatLng(37.501283, 127.039505), // 지도의 중심좌표
            level: 3 // 지도의 확대 레벨
        };



    var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

    //기본 마커 설정
    var imageSrc = callURL+'/library/basic-theme2/main/marker.png', // 마커이미지의 주소입니다    
        imageSize = new kakao.maps.Size(25,35), // 마커이미지의 크기입니다
        imageOption = {offset: new kakao.maps.Point(20, 38)}; // 마커이미지의 옵션입니다. 마커의 좌표와 일치시킬 이미지 안에서의 좌표를 설정합니다.
            
    // 기본 마커의 이미지정보를 가지고 있는 마커이미지를 생성합니다
    var normalImage = new kakao.maps.MarkerImage(imageSrc, imageSize, imageOption),
        markerPosition = new kakao.maps.LatLng(37.54699, 127.09598); // 마커가 표시될 위치입니다

    //오버 마커
    var overImageSrc = callURL+'/library/basic-theme2/main/marker_over_s.png',
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
            
            // 마커를 클릭했을 때 오버레이가 없거나 있으면 닫고, 클릭된 마커에 커스텀 오버레이를 표시합니다
            // if(!overlay || )
           
            // 클릭된 마커가 없고, click 마커가 클릭된 마커가 아니면
            // 마커의 이미지를 클릭 이미지로 변경합니다
            if (!selectedMarker || selectedMarker !== marker) {

                // 클릭된 마커 객체가 null이 아니면
                // 클릭된 마커의 이미지를 기본 이미지로 변경하고
                !!selectedMarker && selectedMarker.setImage(selectedMarker.normalImage);

                // 현재 클릭된 마커의 이미지는 클릭 이미지로 변경합니다
                marker.setImage(overImage);

                overlay = createOverlay(map, marker);
                overlay.setMap(map);
    
                document.getElementById("overlay-close").addEventListener('click',function(){
                  console.log("닫기 클릭");
                  overlay.setMap(null);
                  marker.setImage(normalImage);
                  selectedMarker = null;
                });
            }
            // else if(selectedMarker == marker){
            //     marker.setImage(normalImage);
            //     selectedMarker = null;
            //     return;
            // }

            // 클릭된 마커를 현재 클릭된 마커 객체로 설정합니다
            selectedMarker = marker;
        });

        
    }//end addMarker
    
   
});

// 커스텀 오버레이를 닫기 위해 호출되는 함수입니다 
function closeOverlay() {
  overlay.setMap(null);
}
 
function createOverlay(map, marker, data){
  // 커스텀 오버레이에 표시할 컨텐츠 입니다
        // 커스텀 오버레이는 아래와 같이 사용자가 자유롭게 컨텐츠를 구성하고 이벤트를 제어할 수 있기 때문에
        // 별도의 이벤트 메소드를 제공하지 않습니다 
        var content = '<div class="wrap">' + 
        '    <div class="info">' + 
        '        <div class="title">' + 
        '            모던헬스' + 
        // '            <div id="overlay-close" class="close" onclick="closeOverlay()" title="닫기"></div>' + 
        '            <div id="overlay-close" class="close" title="닫기"></div>' + 
        '        </div>' + 
        '        <div class="body">' + 
        '            <div class="img">' +
        '                <img src="http://localhost:8080/library/basic-theme2/main/overlay-sample.jpg" width="230" height="140">' +
        '           </div>' + 
        '            <div class="desc">' + 
        '                <div class="ellipsis">서울 강북구 솔샘로 327 테마</div>' + 
        '                <div class="jibun ellipsis">(지번) 미아동 373-14 테마빌</div>' + 
        '                <div class="jibun ellipsis">02-999-6666</div>' + 
        '                <div><button id="board-btn">판매글 보기</button></div>' + 
        '            </div>' + 
        '        </div>' + 
        '    </div>' +    
        '</div>';

        // 마커 위에 커스텀오버레이를 표시합니다
        // 마커를 중심으로 커스텀 오버레이를 표시하기위해 CSS를 이용해 위치를 설정했습니다
        return new kakao.maps.CustomOverlay({
          content: content,
          map: map,
          position: marker.getPosition()       
        });
}