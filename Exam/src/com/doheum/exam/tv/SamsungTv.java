package com.doheum.exam.tv;

public class SamsungTv extends Tv {
	
	public SamsungTv() {
		super(1, 10);
	}
	
	@Override
	void channelUp() {
		setChannel(channel + 5);		
	}
	
	@Override
	public String toString() {
		return String.format("%stv의 채널:%d, 볼륨:%d", "삼성", channel, volume);
	}
}
