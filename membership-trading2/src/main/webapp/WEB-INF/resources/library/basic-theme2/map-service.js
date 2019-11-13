/**
 *  2019. 05
 *  일정 상세 보기 전용 map javascript 파일
 */

var gMap,
	gService,
	gInfowindow,
	gMarkerCnt,
	gGeocoder,
	gMarkers=[],
	gContGeolocations=[],
	gmPlaceIdx,
	//글로벌 dayNum, day탭 이동 시 호출중인 구글 api 중단하기 위한 값
	gmDayNum,
	//setTimeout 걸어둔 것 지우기 위한 변수
	gTimer;
	//지도 로드 완료 플래그
	gIsLoadedMap=false;
	
	//지도 관련 값 초기화 및 지도 로드 후 callback으로 받은 함수들 실행
	var gMapObj = {
				
				init : function(){
					
					console.log("gMapObj init");
					let center, lat, lng;
					
					//itiDTO가 없으면 메인으로(잘못된 접근)
					// if(typeof itiDTO == "undefined"){
					// 	location.href="/";
					// 	return;
					// }else{
					// 	let itiDesti0 =itiDTO.itiDestinationVOList[0]; 
					// 	lat = itiDesti0.latitude;
					// 	lng = itiDesti0.longitude;
						
					// 	center = {lat : lat, lng : lng};
                    // }
                    
                    center = {lat : 37.501331, lng : 127.039645};
					//geocoder 생성
					gGeocoder = new google.maps.Geocoder();
					
					var mapOption = {
							center : center,
							zoom : 13,
							gestureHandling: 'greedy',
							streetViewControl: false,
							mapTypeControl : false
					}
					
					//지도 생성할 엘리먼트
					let mapTarget;
					//gMapObj.mapEle에 값을 설정했으면
					if(this.mapEle != "" && this.mapEle != 0 && this.mapEle != null){
						mapTarget = this.mapEle;
					//글로벌 mapEle에 값이 있으면
					}else if(typeof gMapEle != "undefined"){
						mapTarget = gMapEle;
					}else{
						//일정 상세 만들기, 일정 상세 보기에서 사용하는 지도 엘리먼트
						mapTarget = document.getElementById('google-map');
					}
					
					// 지도 생성
					gMap = new google.maps.Map(mapTarget, mapOption);
					gService = new google.maps.places.PlacesService(gMap);
					gInfowindow = new google.maps.InfoWindow();

					// 지도 로드 완료
					gIsLoadedMap = true;
					//로드 중 쌓인 콜백함수가 있으면 실행
					let callbackList = this.callbacks;
					if(callbackList.length > 0){
						callbackList.forEach(function(cb){
							cb();
						});
					}
				},
				mapEle : "",
				callbacks : []
	}		
	
	
	//일정 상세보기 마커 그리기
	//일정 상세보기는 변동이 없기 때문에 마커를 이차원 배열로 보관한다.
	//locationList : [{lat:123, lng:123}, {lat:123, lng:123} ...]
	function drawContMarkers(target, locationList, dayNum){
		
//		console.log("locationList : ",locationList);
		if(locationList.length <1) return 0;
		gMarkers = clearMarkers(gMarkers);
		
		//지도 로드가 완료되면
		if(gIsLoadedMap){
			
			var bounds = new google.maps.LatLngBounds();
			
			locationList.forEach((loc, i)=>{
//				console.log('loc ', loc);
				
				var	mt = ""+(i+1);
				
				var placeLatlng = new google.maps.LatLng(loc.lat, loc.lng);
				
				var marker = new google.maps.Marker({
					position: placeLatlng,
					map: gMap,
					label: mt
				});
				
				gMarkers[i] = marker;
				
				bounds.extend(placeLatlng);
			})
			//마커가 한 개일 땐 지도가 너무 확대된다.
			if(locationList.length < 2){
				gMap.panTo(gMarkers[0].getPosition());
				gMap.setZoom(13);
			}else{
				gMap.fitBounds(bounds);
			}
			
			
		}else{
			gMapObj.callbacks.push(function(){
				drawContMarkers(target, locationList, dayNum);
			});
		}
	}
	
	//지도에서 해당 idx의 마커 포커스
	function focusMarker(idx){
		
//		gMarkers.forEach(function(marker){
//			marker.setAnimation(null);
//		})
		
		let marker = gMarkers[idx];
		//마커에 bounce 동작 설정
		marker.setAnimation(google.maps.Animation.BOUNCE);
		setTimeout(function(){
//			console.log("마커 타임")
			marker.setAnimation(null)
		},1000);
		
		//마커 위치 기준으로 이동
		gMap.panTo(marker.getPosition());
		//지도 줌레벨 설정
		gMap.setZoom(15);
	}

	//마커들 지우기
	function clearMarkers(markers){
//		console.log("clear markers : ",markers);
		markers.forEach(function(marker){
			marker.setMap(null);
		});
		return [];
	}
	
	/********    콘텐츠 상세 정보 박스    ****************/
	function drawContDetailBox(contVO){
//		console.log("contDetail contVO : ",contVO);
//		var text = textContDetailEle(contVO);
//		var $contents = $(text);
//		console.log("text : ", text);
// 		var box = document.getElementsByClassName('plan_mapIti')[0];
// 		var $box = $(box);
		
// 		if(contVO == null) {
// 			$box.hide();
// 			return;
// 		}
		
// 		let placeSummary = contVO.placeSummary;
// 		let summary = (placeSummary == "-" || placeSummary == null) ? "" : contVO.placeSummary,
// 			memo = contVO.memo == null ? "" : contVO.memo;
// //		console.log("box : ",box);
		
// 		//콘텐츠 장소 이름
// 		$box.find('.plan_mapIti_name').text(contVO.placeName);
// 		//콘텐츠 장소 요약 설명
// 		$box.find('.plan_mapIti_ov').text(summary);
// 		//콘테츠 장소 카테고리 이미지
// 		$box.find('.plan_mapItiCate').html('<img src="/resources/img/plan/'+contVO.placeTypeName+'_clr.png" alt="'+contVO.placeTypeName+'">');
		
//		(budget != 0)? 
	}
	