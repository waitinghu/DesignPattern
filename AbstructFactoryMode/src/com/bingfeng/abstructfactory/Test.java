package com.bingfeng.abstructfactory;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {

	
	/*
	 * ���󹤳�ģʽ����ڹ���ģʽ�������ڴ�������һ����Ʒ��
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
