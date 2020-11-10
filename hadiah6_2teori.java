import java.util.Scanner;

class Siswa{
	String nama;
	String nim;	
	String jurusan;
			
	void setnama(String namasiswa){
		nama = namasiswa;
	}
	
	void setjurusan(String jurusansiswa){
		jurusan = jurusansiswa;
	}
	
	void setnim(String nimsiswa){
		nim = nimsiswa;
	}
	
	void cetak(){
		System.out.println("\nNama saya adalah " + nama + ", jurusan saya adalah " + jurusan + ", dan nim saya " + nim);
	}
}

public class hadiah6_2teori{
	public static void main(String args[]){
		
		Siswa s = new Siswa();
		Scanner input = new Scanner(System.in);
		System.out.print("Input Nama = ");
		s.nama = input.nextLine();
		s.setnama(s.nama);
		
		System.out.print("Input Jurusan = ");
		s.jurusan = input.nextLine();
		s.setjurusan(s.jurusan);
		
		System.out.print("Input Nim = ");
		s.nim = input.nextLine();
		s.setnim(s.nim);		
		
		s.cetak();
	}
}