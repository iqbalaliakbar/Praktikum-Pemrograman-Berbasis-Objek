/**
* File : AngkaSial.java 4/02/2023
* Penulis : Iqbal Ali Akbar Muhammad / 24060121130046
* Deskripsi : Program penggunaan exception buatan sendiri pengenalan klausa 'throw' dan 
*		  'throws'
*/ 	

public class AngkaSial{
	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka==13){
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial");
	}
	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}catch(AngkaSialException ase){
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka");
		}
	}
}

// Jawab pertanyaan
// 1. Baris 12 akan dieksekusi jika angka tidak sama dengan 13, seperti contoh
//    pada try yang pertama yaitu as.cobaAngka(10) baris 12 akan dieksekusi. Sedangkan
//    jika as.cobaAngka(13) maka, baris 12 tidak akan dieksekusi.
// 2. Baris 21 hanya akan dieksekusi jika angka sama dengan 13. Baris ini mengecek
//    apakah masukkan angka sama dengan 13, jika ya maka akan throw AngkaSialException
//    atau print message dari AngkaSialException, setelah itu print "hati-hati memasukkan
//    angka" dan tidak akan melanjutkan ke cobaAngka berikutnya. Jika angka tidak sama
//    dengan 13 maka, catch tidak akan dieksekusi.