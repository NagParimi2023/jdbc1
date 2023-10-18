package com.lbrce;

import java.sql.*;


public class jdbc1 {

	public static void main(String[] args) throws SQLException,ClassNotFoundException{
		
      Class.forName("oracle.jdbc.driver.OracleDriver");
      //DriverManager.registerDriver(d);
      Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
      Statement s=c.createStatement();
      //s.executeUpdate("insert into Employee values(1,'SeetaRam')");
//      s.executeUpdate("Create table Employee(eno int,ename varchar(20))");
      ResultSet rs=s.executeQuery("Select * from Employee");
      while(rs.next()) {
    	  System.out.println(rs.getInt(1)+" "+rs.getString(2));
      }
     // System.out.println("Table has its values");
      c.close();
	}

}
