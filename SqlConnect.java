//modify to insert into sql connection
//Base target with more to come for queries.


import java.sql.*;
public class SqlConnect {
	public static void Insert(String Fname, String Lname, int DOB){
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
}
