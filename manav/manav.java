package manav;

import java.util.Scanner;

public class manav {
	static final double armutBirim= 2.14,elma= 3.67,domates=1.11,muz=0.95,patlican=5.0;
	public static void main(String[] args) {
		int armutKg,elmaKg,domatesKg,muzKg,patlicanKg;
		double tutar;
		Scanner klv = new Scanner(System.in);
		System.out.print("Armut Ka� Kilo ? :");
		armutKg=klv.nextInt();
		System.out.print("Elma Ka� Kilo ? :");
		elmaKg=klv.nextInt();
		System.out.print("Domates Ka� Kilo ? :");
		domatesKg=klv.nextInt();
		System.out.print("Muz Ka� Kilo ? :");
		muzKg=klv.nextInt();
		System.out.print("Patl�can Ka� Kilo ? :");
		patlicanKg=klv.nextInt();
		tutar=(armutBirim*armutKg)+(elma*elmaKg)+(domates*domatesKg)+(muz*muzKg)+(patlican*patlicanKg);
		System.out.println("Toplam Tutar: "+tutar);
	}

}
