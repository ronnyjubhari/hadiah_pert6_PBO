import java.util.Scanner;

class Kubus{
	int sisi;
	String loop = "";	
}

public class VolumeKubus{
	public static void main(String args[]){
		
		int volume;
		Kubus k = new Kubus();
		Scanner input = new Scanner(System.in);
		
		for (k.loop = "Y"; k.loop.equals("Y") || k.loop.equals("y");){
			System.out.print("Input Sisi/Panjang Rusuk Kubus = ");
			k.sisi = input.nextInt();
		
			volume = k.sisi * k.sisi * k.sisi;
			System.out.println("\nVolume Kubus = " + volume + " cm3");
			
			System.out.print("\nIngin hitung lagi? (Y/T) = ");
			k.loop = input.next();
			System.out.print("\n------------------------------\n");
		}
		
	}
}