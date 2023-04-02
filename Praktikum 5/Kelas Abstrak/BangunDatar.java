/**
* File : BangunDatar.java 4/02/2023
* Penulis : Iqbal Ali Akbar Muhammad
* Deskripsi : kelas abstrak, berisi abstraksi bangun datar
*/ 	


public abstract class BangunDatar{
	protected double luas;

	public abstract double hitungLuas(double sisi);

	public void setLuas(double luas){
		this.luas = luas;
	}

	public double getLuas(){
		return luas;
	}
	
}