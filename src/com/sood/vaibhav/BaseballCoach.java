package com.sood.vaibhav;

public class BaseballCoach implements Coach {
    
	private FortuneTeller theFt;
	
	public BaseballCoach(FortuneTeller ft) {
	setTheFt(ft);
	}
	
	@Override
	public String getDailyWorkout(){
	return "daily workout";

	}
	@Override
		public FortuneTeller getTheFt() {
		return theFt;
	}

	public void setTheFt(FortuneTeller theFt) {
		this.theFt = theFt;
	}
	
}
