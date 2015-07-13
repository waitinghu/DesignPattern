package com.bingfeng.abstructfactory;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {

	
	/*
	 * 抽象工厂模式相对于工厂模式区别在于创建的是一个产品族
	 */
	public static void main(String[] args) {
		
		try {
			Class.forName("");
//			DriverManager manager = (DriverManager) clazz.newInstance();
			Connection connect = DriverManager.getConnection("");
			connect.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
