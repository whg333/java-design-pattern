package com.whg.designPattern.observer.impl;

import com.whg.designPattern.observer.Listener;
import com.whg.designPattern.observer.Subject;

public class StarPrinterListener implements Listener<Integer> {

	@Override
	public void update(Subject<Integer> subject) {
		System.out.print(this.getClass().getName()+" : ");
		for(int i=0;i<subject.getContent();i++){
			System.out.print("*");
		}
		System.out.println();
	}

}
