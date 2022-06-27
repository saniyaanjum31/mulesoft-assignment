package movie_name;

import java.sql.*;
import java.sql.Connection;
import java.util.*;
import java.sql.Statement;
public class moviename {
	public static void main(String[] args) {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\DELL\\Desktop\\sqlite\\sqlite-tools-win32-x86-3390000\\movie1.db");
			System.out.println("Database Connection opened.");
			Statement st=con.createStatement();
			st.executeUpdate("create table movie2(moviename varchar(20),actor varchar(20),actress varchar(20),relesae varchar(10),director varchar(20))");
			System.out.println("Table Created");
			
			st.executeUpdate("INSERT INTO movie2 (moviename,actor,actress,relesae,director) VALUES ('rrr','ramcharan','oliva','2022','rajamouli')");
			st.executeUpdate("INSERT INTO movie2 (moviename,actor,actress,relesae,director) VALUES ('k3g','sharukh khan','kajol','2001','karan johar')");
			st.executeUpdate("INSERT INTO movie2 (moviename,actor,actress,relesae,director) VALUES ('kuch kuch hota hai','sharukh khan','kajol','1999','karan johar')");
			st.executeUpdate("INSERT INTO movie2 (moviename,actor,actress,relesae,director) VALUES ('bajrangi bhaijan','salman khan','kareena kapoor','2016','kabir khan')");
			st.executeUpdate("INSERT INTO movie2 (moviename,actor,actress,relesae,director) VALUES ('soty','sidharth malhotra','alia bhatt','2012','karan johar')");
			st.executeUpdate("INSERT INTO movie2 (moviename,actor,actress,relesae,director) VALUES ('bahubali 2','prabhas','anushka','2015','rajamouli')");
			st.executeUpdate("INSERT INTO movie2 (moviename,actor,actress,relesae,director) VALUES ('kgf2','yash','srinidhi','2022','prashanth')");
			st.executeUpdate("INSERT INTO movie2 (moviename,actor,actress,relesae,director) VALUES ('bahubali','prabhas','anushka','2015','rajamouli')");
			
			
			ResultSet rs = st.executeQuery("select * from movie2");
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+" : " +(rs.getString(2)+" : "+rs.getString(3)+" : "+ rs.getString(4)+" : "+rs.getString(5)));
			}
			
			con.close();
			System.out.println("Connection closed.");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
