package com.tns.jdbcprograms;
import javax.sql.*;
import java.sql.*;
public class PreparedStamentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/c21","root","Tnsif@1234");
		
		// create the statement
			Statement stmt= conn.createStatement();
			
//		// Execute a sql insert statement via executeupdate()	
//			
//			String sqlInsert="insert into books values(3002,'c',250,4)";
//			System.out.println("the sql statement is"+sqlInsert);
//			int countInserted=stmt.executeUpdate(sqlInsert);
//			System.out.println(countInserted+ "records inserted");
//			
			// delete the recor from the database
			
			String  sqlDelete="delete from books where bookid=3000";
			System.out.println("the sql statement is"+sqlDelete);
			int countDeleted=stmt.executeUpdate(sqlDelete);
			System.out.println(countDeleted+ "records Deleted");
			
			// display the records in my console
			String strSelect="Select*from books";
			System.out.println(" The records are"+strSelect);
			ResultSet rset=stmt.executeQuery(strSelect);
			int rowCount=0;
			while(rset.next()) {
				System.out.println(rset.getInt("bookid"));
				System.out.println(rset.getString("booktitle"));
				System.out.println(rset.getInt("price"));
				System.out.println(rset.getInt("qty"));
				
				++rowCount;
			}
			
			
			
		} 
		
		
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
