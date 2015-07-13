package com.bingfeng.oracleconnection;

import com.bingfeng.connection.MyConnection;

public class OracleConntion implements MyConnection{

	@Override
	public MyStatment getStatement() {
		return new OracleStatement();
	}

	@Override
	public MyPreparedStatment preparedStatement() {
		return new OraclePreparedStatment();
	}
	
	
	private class OracleStatement implements MyStatment {
		
	}
	
	private class OraclePreparedStatment implements MyPreparedStatment{
		
	}

}
