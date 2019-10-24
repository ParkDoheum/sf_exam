package com.doheum.exam.tv;

public class TvTest5 {
	public static void main(String[] args) {
		SamsungTv sstv = new SamsungTv();
		LGTv lgtv = new LGTv();
		
		mainShowState(sstv);
		mainShowState(lgtv);
	}
	
	public static void mainShowState(Tv tv) {
		tv.showState();
	}
	
		
}
