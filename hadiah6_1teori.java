import java.util.Scanner;

class Lingkaran{
	int r, sisi;
	double phi = 3.14;

	
	public double luas(){
		return 3.14 * r * r;
	}	
	
	void cetak(){		
		System.out.println("\n\nLuas Lingkaran = " + (int)luas() + " cm\u00b2");
	}
}

class Kubus{
	int sisi;
	
	public int volume(){
		return sisi*sisi*sisi;
	}
	
	void cetak(){
		System.out.println("\nVolume Kubus = " + volume() + " cm3");
	}
}

public class hadiah6_1teori{
	public static void main(String args[]){
		
		String loop = "";
		Lingkaran l = new Lingkaran();
		Kubus k = new Kubus();
		Scanner input = new Scanner(System.in);
		
		for (loop = "Y"; loop.equals("Y") || loop.equals("y");){
			System.out.print("=====Hitung Luas Lingkaran=====\n");
			System.out.print("\nInput Jari-Jari Lingkaran = ");
			l.r = input.nextInt();
			
			System.out.print("\n\n=============================");
			System.out.print("\n=====Hitung Volume Kubus=====\n");
			System.out.print("\nInput Sisi/Panjang Rusuk Kubus = ");
			k.sisi = input.nextInt();
			
			l.cetak();
			k.cetak();
			
			System.out.print("\n\nIngin hitung lagi? (Y/T) = ");
			loop = input.next();
			System.out.print("\n------------------------------\n");
		}	
	}
}