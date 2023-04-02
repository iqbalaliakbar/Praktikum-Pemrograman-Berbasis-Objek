/**
* File : MBujurSangkar.java 4/02/2023
* Penulis : Iqbal Ali Akbar Muhammad
* Deskripsi : kelas yang mengimplementasikan cara menghitung luas bujur sangkar
*/ 	
import java.util.Scanner;

class MBujurSangkar{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		BujurSangkar bs = new BujurSangkar();
		System.out.println("Masukkan sisi bujur sangkar : ");
		double sisi = scan.nextDouble();
		scan.close();

		System.out.println("Luas bujur sangkar dengan sisi "+ sisi +" adalah "+ bs.hitungLuas(sisi));
	}
}