package com.hemant.designpatterns.observerpattern;

public interface CricketScoreSubject {
	void registerObserver(CricketScoreObserver observer);
	void unRegisterObserver(CricketScoreObserver observer);
	void notifyObservers();
	void updateScore(int runs, int wickets, float overs);
}
