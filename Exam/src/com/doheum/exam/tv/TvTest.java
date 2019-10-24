package com.doheum.exam.tv;

public class TvTest {

	public static void main(String[] args) {
		//객체화, 인스턴스
		Tv tv1 = new Tv(330, 11); //주소값 (레퍼런스 변수)(참조 변수)		
		Tv tv2 = new Tv(1, 2);
		tv2.setChannel(20);
		tv2.setVolume(100);
				
		tv1.showState();
		tv2.showState();
		
		int volume = tv2.getVolume();
		System.out.println("tv1의 볼륨 : " + volume);
				
	}	
}
