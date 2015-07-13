package com.bingfeng.build;

public abstract class StarBucksBuilder {
	
	StarBucks starBucks;
	
	public void createStarBucks(){
		starBucks = new StarBucks();
	}
	
	public StarBucks getStarBucks() {
		return starBucks;
	}
	
	public abstract void buildSize();
	public abstract void buildDrink();

}
