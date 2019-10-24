package com.doheum.exam.tv;

public class TvTest2 {
	public static void main(String[] args) {
		LGTv lgtv2 = new LGTv();
		
		LGTv lgtv3 = new LGTv();
		
		SamsungTv smtv1 = new SamsungTv();
		
		System.out.println(lgtv2);
		System.out.println(smtv1);
		smtv1.showState();
		
		/*
		LGTv lgtv1 = new LGTv();
		lgtv1.showState();
		lgtv1.channelUp();
		lgtv1.channelUp();
		lgtv1.showState();
		lgtv1.record();

		SamsungTv smtv1 = new SamsungTv();
		for (int i = 0; i < 10; i++) {
			smtv1.channelUp();
		}
		smtv1.showState();
		*/
	}
}