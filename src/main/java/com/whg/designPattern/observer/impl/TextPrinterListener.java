package com.whg.designPattern.observer.impl;

import com.whg.designPattern.observer.Listener;
import com.whg.designPattern.observer.Subject;

public class TextPrinterListener implements Listener<Integer> {

	@Override
	public void update(Subject<Integer> subject) {
		System.out.println(this.getClass().getName()+" : "+subject.getContent());
	}

}
