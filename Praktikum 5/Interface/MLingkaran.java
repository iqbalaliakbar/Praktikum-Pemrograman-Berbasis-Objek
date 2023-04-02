/**
* File : MLingkaran.java 4/02/2023
* Penulis : Iqbal Ali Akbar Muhammad
* Deskripsi : implementasi cara menghitung luas lingkaran
*/ 	
import java.util.Scanner;

public class MLingkaran{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan sisi bujur sangkar : ");
		double jejari = scan.nextDouble();
		Lingkaran l = new Lingkaran(jejari);
		scan.close();

		System.out.println("Luas lingkaran dengan jejari "+ jejari +" adalah "+ l.hitungLuas());
	}
}