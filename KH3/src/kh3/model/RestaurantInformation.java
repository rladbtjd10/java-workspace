package kh3.model;

public class RestaurantInformation {
	
	 private String name; // 식당이름
	 private String address; //식당의 주소
	 private String phoneNumber; //식당의 전화번호
	 private String operatingHours; //식당의 영업시간
	 private double rating; //식당의 평점
	 private String discounts; //식당의 할인 정보
	 private double latitude; //식당의 위치 정보 위도
	 private double longitude; //식당의 위치 정보 경도
	 private String photos; //식당사진 -수정,삭제
	 private String menu; //식당메뉴-대표메뉴1개보기 -메뉴 여러개 보기 -메뉴업로드
	 private String reviews; //리뷰(후기) -작성,수정,삭제
	 private String operatingInfo; //식당 영업정보 작성,수정,삭제 - 운영시간 -휴식시간 -휴무일 -전화번호 
	 private String facilities; //	편의시설 - 남녀화장실구분, 무선인터넷, 단체석구비, 등
	 private String introduction; // 매장소개
	 private boolean isPicked; //매장Pick - 친구랑 같이 가기 좋은, 한식, 깔끔한, 홀테이블, 단체 예약이 가능한, 회식하기 좋은, 애인이랑 오기 좋은, 분위기 좋은, 한식, 해산물, 육류, 포차분위기, 전통적인, 한잔하기좋은등...
	 


	
	
	
	



//	식당 목록
	 
//	 식당 사진/메뉴 업로드
//	 uploadPhoto(String photo): 주어진 사진을 식당의 사진 목록에 추가합니다.
//	 식당 영업정보
//	 setOperatingInfo(String operatingInfo): 식당의 영업정보를 설정합니다.
//	 편의시설
//	 addFacility(String facility): 주어진 편의시설을 식당의 편의시설 목록에 추가합니다.
//	 매장소개
//	 setIntroduction(String introduction): 식당의 매장 소개를 설정합니다.
//	 매장Pick
//	 setPicked(boolean picked): 식당의 Pick 여부를 설정합니다.
//	 식당 목록
//	 getRestaurantList(): 식당 목록을 얻어옵니다.
//	 대표메뉴 1개 보기
//	 getRepresentativeMenu(): 대표 메뉴를 반환합니다.
//	 메뉴 여러개 보기
//	 getMenu(): 식당의 메뉴 목록을 반환합니다.
//	 사진 수정
//	 updatePhoto(int index, String newPhoto): 주어진 인덱스에 해당하는 사진을 새로운 사진으로 업데이트합니다.
//	 사진 삭제
//	 deletePhoto(int index): 주어진 인덱스에 해당하는 사진을 삭제합니다.
//	 후기 작성
//	 writeReview(String review): 주어진 후기를 식당의 후기 목록에 추가합니다.
//	 후기 수정
//	 updateReview(int index, String newReview): 주어진 인덱스에 해당하는 후기를 새로운 후기로 업데이트합니다.
//	 후기 삭제
//	 deleteReview(int index): 주어진 인덱스에 해당하는 후기를 삭제합니다.
	 
//	 식당 주소
//
//	 setAddress(String address): 식당의 주소를 설정합니다.
//	 getAddress(): 식당의 주소를 반환합니다.
//	 식당 전화번호
//
//	 setPhoneNumber(String phoneNumber): 식당의 전화번호를 설정합니다.
//	 getPhoneNumber(): 식당의 전화번호를 반환합니다.
//	 식당 운영시간
//
//	 setOperatingHours(String operatingHours): 식당의 운영시간을 설정합니다.
//	 getOperatingHours(): 식당의 운영시간을 반환합니다.
//	 식당 평점
//
//	 setRating(double rating): 식당의 평점을 설정합니다.
//	 getRating(): 식당의 평점을 반환합니다.
//	 식당 예약
//
//	 makeReservation(Date date, int numOfPeople): 주어진 날짜와 인원수로 식당 예약을 생성합니다.
//	 cancelReservation(Date date): 주어진 날짜의 식당 예약을 취소합니다.
//	 식당 할인 정보
//
//	 addDiscount(String discount): 주어진 할인 정보를 식당의 할인 목록에 추가합니다.
//	 removeDiscount(String discount): 주어진 할인 정보를 식당의 할인 목록에서 제거합니다.
//	 getDiscounts(): 식당의 할인 목록을 반환합니다.
//	 식당 위치 정보
//
//	 setLatitude(double latitude): 식당의 위도를 설정합니다.
//	 setLongitude(double longitude): 식당의 경도를 설정합니다.
//	 getLongitude(): 식당의 경도를 반환합니다.
	 
//	 위의 기능들을 Restaurant 클래스에 추가하고, 필요에 따라 메서드를 구현하여 사용할 수 있습니다.
	 
	 


	
	

}
