package com.bingfeng.connection;

public interface MyConnection {

	public interface MyStatment{
		
	}
	
	public interface MyPreparedStatment{
		
	}
	
	MyStatment getStatement();
	MyPreparedStatment preparedStatement();
	
}
