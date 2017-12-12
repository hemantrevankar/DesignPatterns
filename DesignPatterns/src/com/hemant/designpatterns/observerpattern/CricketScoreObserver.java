package com.hemant.designpatterns.observerpattern;

public interface CricketScoreObserver {
	void update(int runs, int wickets, float overs);
	void displayScore();
}
