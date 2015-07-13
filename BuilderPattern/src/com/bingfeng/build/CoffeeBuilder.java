package com.bingfeng.build;

public class CoffeeBuilder extends StarBucksBuilder{

	@Override
	public void buildSize() {
		starBucks.setSize("mid");
	}

	@Override
	public void buildDrink() {
		starBucks.setDrink("coffee");
	}

}
