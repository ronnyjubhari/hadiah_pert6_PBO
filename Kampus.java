import java.util.Scanner;

class Siswa{
	String nama;
	String nim;	
	String jurusan;
			
	void cetak(){
		System.out.println("\nNama saya adalah " + nama + ", nim saya " + nim + ", dan jurusan saya " + jurusan);
	}
}

public class Kampus{
	public static void main(String args[]){
		
		Siswa s = new Siswa();
		Scanner input = new Scanner(System.in);
		System.out.print("Input Nama = ");
		s.nama = input.nextLine();
		System.out.print("Input Nim = ");
		s.nim = input.nextLine();
		System.out.print("Input Jurusan = ");
		s.jurusan = input.nextLine();
		s.cetak();
	}
}