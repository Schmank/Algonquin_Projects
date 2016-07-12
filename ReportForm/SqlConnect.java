package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SQLconnect {
	public void Insert(String Fname, String Lname, int DOB){
		try{
			String insert1="INSERT INTO Student_T "+"Values("+Fname+","+Lname+","+DOB+")";
			String url="jbdc:mysql://192.168.2.130/Archive"; //Local server. need to get usable/Host PC for demo
			Connection conn1=DriverManager.getConnection(url,"","");//Put connection w/ close into another method so connection isn't always opening and closing constantly
			Statement st1=conn1.createStatement();
			st1.executeUpdate(insert1);
			conn1.close();
		}catch (Exception e){
			System.out.println("Problem");
			System.out.println(e.getMessage());
		}
	}

	//Not done yet
	public String search(String cAccount, String inventory, String query3, String query4){ //Find a way to have method take variable amount of parameters. Worst case scenario, can make alternate methods containing different number of parameters and have conditional in the either the app or this class decide which method to call based on if fields in form are filled out or not.
		String search=cAccount+inventory+query3+query4;

		return search;
	}

	public void searchDecide(){

	}
}
