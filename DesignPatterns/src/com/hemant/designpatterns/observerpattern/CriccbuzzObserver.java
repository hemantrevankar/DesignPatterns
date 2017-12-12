package com.hemant.designpatterns.observerpattern;

public class CriccbuzzObserver implements CricketScoreObserver {
	int runs, wickets;
	float overs;
	float runRate;
	
	@Override
	public void update(int runs, int wickets, float overs) {
		this.runs = runs;
		this.wickets = wickets;
		this.overs = overs;
		this.runRate = this.runs / this.overs;
		displayScore();
	}

	public void displayScore() {
		System.out.println("Live Cricket score brought to you by CriccBuzz...");
		System.out.println("Runs: " + this.runs);
		System.out.println("Overs: " + this.overs);
		System.out.println("Wickets: " + this.wickets);
		System.out.println("Run Rate: " + this.runRate);
	}
}
