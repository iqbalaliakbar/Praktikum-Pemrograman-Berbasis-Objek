/**
* File : DAOManager.java 5/31/2023
* Penulis : Iqbal Ali Akbar Muhammad / 24060121130046
* Deskripsi : 
*/ 	

public class DAOManager{
 private PersonDAO personDAO;

 public void setPersonDAO(PersonDAO person){
  personDAO=person;
 }

 public PersonDAO getPersonDAO(){
  return personDAO;
 }
}