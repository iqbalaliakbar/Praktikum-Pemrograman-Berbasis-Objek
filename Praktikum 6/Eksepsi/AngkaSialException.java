/**
* File : AngkaSialException.java 4/02/2023
* Penulis : Iqbal Ali Akbar Muhammad / 24060121130046
* Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 12
*/ 	

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan memasukkan agnka 13 karena angka sial !!");
	}
}
