
/**
* File : MainDAO.java 5/31/2023
* Penulis : Iqbal Ali Akbar Muhammad / 24060121130046
* Deskripsi : 
*/ 	

public class MainDAO{
 public static void main(String args[]){
  Person person = new Person("Indra");
  DAOManager m = new DAOManager();
  m.setPersonDAO(new MySQLPersonDAO());

  try{
   m.getPersonDAO().savePerson(person);
  }catch(Exception e){
   e.printStackTrace();
  }
 }
}