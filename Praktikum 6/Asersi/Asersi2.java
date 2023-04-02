/**
* File : Asersi2.java 4/02/2023
* Penulis : Iqbal Ali Akbar Muhammad / 24060121130046
* Deskripsi : Program demo asersi, yang akan menolak input 
* 		  jari-jari lingkaran yang bernilai nol
*/ 	

//class Lingkaran
class Lingkaran{
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}

	public double hitungKeliling(){
		double keliling = 2*Math.PI*jariJari;
		return keliling;
	}
}

//class Asersi2
public class Asersi2{
	public static void main(String[] args){
		double jariJari = 5;
		assert(jariJari>0):"jari jari tidak boleh nol!!";
		Lingkaran l = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("Keliling lingkaran = "+kelilingLingkaran);
	}
}

// Jawab Pertanyaan
// Pada baris assert, dimana terdapat kondisi jariJari harus bernilai lebih
// besar daripada nol. Jika saat program dijalankan dan nilai jariJari diinisialisasi
// dengan nilai nol, maka program akan mengeluarkan message error. Assertion 
// tidak akan bekerja jika enable assertion tidak diaktifkan saat menjalankan program.
// Assertion akan lebih baik digunakan untuk memeriksa kondisi yang tidak harus terjadi
// dan menjadi tanda program error.