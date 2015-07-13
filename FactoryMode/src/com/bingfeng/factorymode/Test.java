package com.bingfeng.factorymode;

import com.bingfeng.List.MyList;
import com.bingfeng.List.MyList.MyIterator;
import com.bingfeng.MyArrayList.MyArrayList;

public class Test {
	/*
	 * 这里的MyList 是抽象的工厂。而MyIterator是抽象的产品。
	 * MyArraList的是具体的工厂。MyArrayList 是具体的产品，且不用对外暴露。
	 */
	public static void main(String[] args) {
		MyList list = new MyArrayList();
		MyIterator it  = list.Iterator();
		it.next();
	}
}
