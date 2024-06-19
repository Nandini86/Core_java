package com.tns.jdbcprograms.alloperations;

public class Alloperations {
	
	void insert() {

		String sqlInsert="insert into books values(3002,'c',250,4)";
		System.out.println("the sql statement is"+sqlInsert);
		int countInserted=stmt.executeUpdate(sqlInsert);
		System.out.println(countInserted+ "records inserted");
		
	}
	
	void delete() {
		
	}

	
	
	void update()
	{
		
	}
}
