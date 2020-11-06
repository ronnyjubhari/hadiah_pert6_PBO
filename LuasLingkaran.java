import java.util.Scanner;

class Lingkaran{
	int r;
	double phi = 3.14;
	String loop = "";
	
	public double luas(){
		return 3.14 * r * r;
	}
	
	void cetak(){		
		System.out.println("\nLuas Lingkaran = " + luas() + " cm\u00b2");
	}
}

public class LuasLingkaran{
	public static void main(String args[]){
		
		Lingkaran l = new Lingkaran();
		Scanner input = new Scanner(System.in);
		
		for (l.loop = "Y"; l.loop.equals("Y") || l.loop.equals("y");){
			System.out.print("Input Jari-Jari Lingkaran = ");
			l.r = input.nextInt();
			l.cetak();
			
			System.out.print("\nIngin hitung lagi? (Y/T) = ");
			l.loop = input.next();
			System.out.print("\n------------------------------\n");
		}	
	}
}