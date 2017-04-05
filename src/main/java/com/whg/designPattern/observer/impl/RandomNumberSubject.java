package com.whg.designPattern.observer.impl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

import com.whg.designPattern.observer.Listener;
import com.whg.designPattern.observer.Subject;

public class RandomNumberSubject implements Subject<Integer> {

	private static final Random random = new Random();
	
	private final Collection<Listener<Integer>> listeners = new HashSet<Listener<Integer>>();
	
	private int number;
	
	@Override
	public boolean addListener(Listener<Integer> listener) {
		return listeners.add(listener);
	}

	@Override
	public boolean removeListener(Listener<Integer> listener) {
		return listeners.remove(listener);
	}

	@Override
	public void notifyListeners() {
		for(Listener<Integer> listener:listeners){
			listener.update(this);
		}
	}

	@Override
	public Integer getContent() {
		return number;
	}

	public void generateRandomNumber() {
		number = 1+random.nextInt(50);
		notifyListeners();
	}

}
