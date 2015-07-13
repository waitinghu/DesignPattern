package com.bingfeng.build;

public class TeaBuilder extends StarBucksBuilder{

	@Override
	public void buildSize() {
		starBucks.setSize("large");
	}

	@Override
	public void buildDrink() {
		starBucks.setDrink("tea");
	}

}
