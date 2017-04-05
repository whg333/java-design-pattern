package com.whg.designPattern.observer;

public interface Listener<T> {

	void update(Subject<T> subject);

}
