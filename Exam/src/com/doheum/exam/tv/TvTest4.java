package com.doheum.exam.tv;

public class TvTest4 {

	public static void main(String[] args) {
		/*
		Tv tv = new Tv(1, 2);
		LGTv ll = (LGTv)tv;
		*/
		
		//---------------
		LGTv lgtv = new LGTv();
		
		Tv tv = lgtv; //자동형변환
		
		tv = new SamsungTv();
		
		SamsungTv sstv2 = (SamsungTv)tv; //강제형변환
	}

}
