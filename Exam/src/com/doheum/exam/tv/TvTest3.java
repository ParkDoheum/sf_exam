package com.doheum.exam.tv;

public class TvTest3 {
	public static void main(String[] args) {
		LGTv tv1 = new LGTv("AA-BB1");
		tv1.record();
		
		
		Tv tv = tv1;
		
		
		tv.showState();
		
		
	}
}
