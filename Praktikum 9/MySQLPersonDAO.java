import java.sql.*;

/**
* File : MySQLPersonDAO.java 5/31/2023
* Penulis : Iqbal Ali Akbar Muhammad / 24060121130046
* Deskripsi : 
*/ 	

public class MySQLPersonDAO implements PersonDAO{
 public void savePerson(Person person) throws Exception{
  String name=person.getName();
  Class.forName("com.mysql.cj.jdbc.Driver");
  Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pbo","root","");
  String query = "INSERT INTO peron(name) VALUES('"+name+"')";
  System.out.println(query);
  Statement s = con.createStatement();
  s.executeUpdate(query);
  con.close();
 }
}