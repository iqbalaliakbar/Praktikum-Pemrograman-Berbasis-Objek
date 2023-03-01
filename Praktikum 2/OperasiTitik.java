/**
File : Titik.java
Nama : Iqbal Ali Akbar Muhammad
NIM : 24060121130046
Lab : PBO C2
Tanggal : 1 Maret 2023
**/
class OoperasiTitik{
 private void refleksiSumbuX(Titik titik){
  double ordinat = titik.getOrdinat(); 
  ordinat = ordinat * -1;
  titik.setOrdinat(ordinat);
 }

 private void refleksiSumbuY(Titik titik){
  titik.setAbsis(-titik.getAbsis());
 }

 public Titik refleksiX(Titik titik){
  refleksiSumbuX(titik);
  return titik;
 }

 public Titik refleksiY(Titik titik){
  refleksiSumbuY(titik);
  return titik;
 }

}
