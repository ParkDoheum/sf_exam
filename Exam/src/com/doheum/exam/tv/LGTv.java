package com.doheum.exam.tv;

public class LGTv extends Tv {
	
	public static String model;
	
	public LGTv() {
		super(1, 2);
	}
	
	public LGTv(String str) {
		super(1, 1);		
		System.out.println("LGTv 생성자!!");		
		model = str;
	}
	
	public void record() {
		System.out.println("녹화를 하고 있습니다.");
	}
	
	@Override
	void showState() {		
		System.out.println("!!!!!!!");
	}
	
	@Override
	public String toString() {
		return "LGtv임!! ㅋㅋㅋ";
	}
	
}
