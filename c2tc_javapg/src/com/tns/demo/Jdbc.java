package com.tns.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				//"jdbc:mysql://localhost:3306/b25","root", "Nandini@89"
			try {
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nandu","root", "Tnsif@1234");
				Statement st=conn.createStatement();// create a statement
				String  str=" select title,price,qty from book";
				System.out.println("the sql Statement is"+str+"\n");
				ResultSet rset=st.executeQuery(str);
				
				System.out.println("the records are");
				int rowCount=0;
				while(rset.next()) {
					String title=rset.getString("title");
					double price=rset.getDouble("price");
					int qty=rset.getInt("qty");
					System.out.println(title+" ,"+ price+ " ");
					++rowCount;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


	}

}
