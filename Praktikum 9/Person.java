/**
* File : Person.java 5/31/2023
* Penulis : Iqbal Ali Akbar Muhammad / 24060121130046
* Deskripsi : 
*/ 	

public class Person{
 private int id;
 private String name;

 public Person(String n){
  name=n;
 }

 public Person(int i, String n){
  id=i;
  name=n;
 }

 public int getId(){
  return id;
 }

 public String getName(){
  return name;
 }
}