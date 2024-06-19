package com.tns.jdbcprograms;
import java.sql.*;
import javax.sql.*;// Step 1 import the pakages
public class JdbcSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step 2 load and register drivers not mandatory for later versions
		//Step 3 establish the connection
try {
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/c21","root","Tnsif@1234");
// Step 4Create a statement
	Statement st=conn.createStatement();
	
	//execute the query
	String  strSelect="select booktitle,price,qty from books";
	System.out.println("the sql statement is"+strSelect);
	
	//process the result to display
	
	ResultSet rst= st.executeQuery(strSelect);
	System.out.println("the records are");
	 // Step 4: Process the 'ResultSet' by scrolling the cursor forward via next().
    //  For each row, retrieve the contents of the cells with getXxx(columnName).
	int rowCount=0;
	// Row-cursor initially positioned before the first row of the 'ResultSet'.
    // rset.next() inside the whole-loop repeatedly moves the cursor to the next row.
    // It returns false if no more rows.
	while(rst.next()) {
		String booktitle=rst.getString("booktitle");
		int price=rst.getInt("price");
		int qty =rst.getInt("qty");
		System.out.println(booktitle+""+price+""+qty);
		++rowCount;
		
		
	}
	
	
	

} 


catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
	}

}
