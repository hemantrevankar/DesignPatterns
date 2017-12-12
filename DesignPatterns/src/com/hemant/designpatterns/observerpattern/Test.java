package com.hemant.designpatterns.observerpattern;

public class Test {
	public static void main(String[] args) {
		CricketScoreSubject starSportsSubject = new CricketScoreSubjectImpl();
		CricketScoreObserver criccbuzz = new CriccbuzzObserver();
		CricketScoreObserver msn = new BingCricketObserver();
		starSportsSubject.registerObserver(criccbuzz);
		starSportsSubject.registerObserver(msn);
		
		starSportsSubject.updateScore(101, 1, 19.2f);
	}
}
