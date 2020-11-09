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

public class Kampus{
	public static void main(String args[]){
		
		Siswa s = new Siswa();
		Scanner input = new Scanner(System.in);
		System.out.print("Input Nama = ");
		s.nama = input.nextLine();
		System.out.print("Input Jurusan = ");
		s.jurusan = input.nextLine();
		System.out.print("Input Nim = ");
		s.nim = input.nextLine();
				
		s.setnama(s.nama);
		s.setjurusan(s.jurusan);
		s.setnim(s.nim);
		s.cetak();
	}
}