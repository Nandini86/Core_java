package com.tns.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//"jdbc:mysql://localhost:3306/b25","root", "Nandini@89"
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nandu","root", "Tnsif@1234");
			 // Step 2: Allocate a 'Statement' object in the Connection
	         Statement stmt = conn.createStatement();
	       {
	          
	         // INSERT a record
	         String sqlInsert = "insert into books values (3001, 'Gone Fishing', 11.11, 11)";
	         System.out.println("The SQL statement is: " + sqlInsert + "\n");  // Echo for debugging
	         int countInserted = stmt.executeUpdate(sqlInsert);
	         System.out.println(countInserted + " records inserted.\n");
	 
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


}

	}


