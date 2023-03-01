/**
File : Titik.java
Nama : Iqbal Ali Akbar Muhammad
NIM : 24060121130046
Lab : PBO C2
Tanggal : 22 Februari 2023
**/
class Titik{
 double absis;
 double ordinat;
 static int counterTitik;

 Titik(double a, double o){
  counterTitik++;
  absis=a;
  ordinat=o;
 }

 Titik(){
  absis = 0;
  ordinat = 0;
  counterTitik++;
 }

 void setAbsis(double a){
  absis = a;
 }

 void setOrdinat(double o){
  ordinat = o;
 } 

 double getAbsis(){
  return absis;
 }

 double getOrdinat(){
  return ordinat;
 }

 int getCounterTitik(){
  return counterTitik;
 }

}
