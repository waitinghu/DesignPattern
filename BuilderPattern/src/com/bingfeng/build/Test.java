package com.bingfeng.build;

public class Test {
	
	public static void main(String[] args) {
		
		Waiter waiter = new Waiter();//指导者
		StarBucksBuilder teabuilder = new TeaBuilder();//建造者
		waiter.setBuilder(teabuilder);
		waiter.construckStarBucks();
		StarBucks drink = waiter.getDrink();
		drink.getSize();
		drink.getDrink();
		
		/*
		 * 这里的StringBuild既是建造者也是指导站（director）
		 */
		StringBuilder sb = new StringBuilder();
		sb.append("");
		sb.append("");
		sb.toString();
	}

}
