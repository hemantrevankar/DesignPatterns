package com.hemant.designpatterns.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class CricketScoreSubjectImpl implements CricketScoreSubject {
	int runs, wickets;
	float overs;

	List<CricketScoreObserver> observerList;
	
	public CricketScoreSubjectImpl() {
		this.observerList = new ArrayList<>();
	}

	@Override
	public void registerObserver(CricketScoreObserver observer) {
		observerList.add(observer);
	}

	@Override
	public void unRegisterObserver(CricketScoreObserver observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (CricketScoreObserver observer : observerList) {
			observer.update(this.runs, this.wickets, this.overs);
		}
	}

	public void updateScore(int runs, int wickets, float overs) {
		this.runs = runs;
		this.wickets = wickets;
		this.overs = overs;
		notifyObservers();
	}
	
}
