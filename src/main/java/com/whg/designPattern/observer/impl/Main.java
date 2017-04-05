package com.whg.designPattern.observer.impl;

public class Main {

	public static void main(String[] args) {
		RandomNumberSubject subject = new RandomNumberSubject();
		subject.addListener(new TextPrinterListener());
		subject.addListener(new StarPrinterListener());
		for(int i=0;i<5;i++){
			subject.generateRandomNumber();
		}
	}
	
}
