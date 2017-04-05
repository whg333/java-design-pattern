package com.whg.designPattern.observer;

public interface Subject<T> {

	boolean addListener(Listener<T> listener);
	boolean removeListener(Listener<T> listener);
	
	void notifyListeners();
	
	T getContent();
	
}
