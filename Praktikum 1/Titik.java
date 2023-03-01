/**
 * File      : Titik.java		22/02/23
 * Penulis   : Iqbal Ali Akbar Muhammad
 * Deskripsi : Kelas yang berisi Titik
 * 
 */
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
