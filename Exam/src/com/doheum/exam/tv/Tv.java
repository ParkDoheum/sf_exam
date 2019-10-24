package com.doheum.exam.tv;
 

//private, default, protected, public

//사용자정의 클래스
public class Tv extends Object {
	protected int channel;
	protected int volume;
		
	private Tv() {
		System.out.println("Tv 생성자!!!");
	}
	
	Tv(int channel, int volume) {
		System.out.println("Tv 생성자(파라미터)!!!");
		setChannel(channel);
		setVolume(volume);
	}
		
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if(channel < 1) {
			this.channel = 1;
		} else if(channel > 300) {
			this.channel = 300; 
		} else {
			this.channel = channel;
		}
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if(volume < 0) {
			this.volume = 0;
		} else if(volume > 20) {
			this.volume = 20;
		} else {
			this.volume = volume;
		}		
	}

	void showState() {		
		System.out.printf("channel : %d, volume: %d\n", channel, volume);
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	void volumeUp() {
		volume++;
	}
	
	void volumeDown() {
		volume--;
	}
}
