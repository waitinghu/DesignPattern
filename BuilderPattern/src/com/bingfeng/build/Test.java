package com.bingfeng.build;

public class Test {
	
	public static void main(String[] args) {
		
		Waiter waiter = new Waiter();//ָ����
		StarBucksBuilder teabuilder = new TeaBuilder();//������
		waiter.setBuilder(teabuilder);
		waiter.construckStarBucks();
		StarBucks drink = waiter.getDrink();
		drink.getSize();
		drink.getDrink();
		
		/*
		 * �����StringBuild���ǽ�����Ҳ��ָ��վ��director��
		 */
		StringBuilder sb = new StringBuilder();
		sb.append("");
		sb.append("");
		sb.toString();
	}

}