/**
* File : ExceptionOnArray.java 4/02/2023
* Penulis : Iqbal Ali Akbar Muhammad / 24060121130046
* Deskripsi : Program penggunaan eksepsi menggunakan class library java
*/ 	

public class ExceptionOnArray{
	public static void main(String[] args){
		Integer[] arrayInteger = new Integer[4];
		try{
			arrayInteger[2]=11;
			arrayInteger[4]=10;
		}catch(ArrayIndexOutOfBoundsException exception){
			exception.printStackTrace();
		}finally{
			System.out.println("clean up code...");
		}
	}
}
