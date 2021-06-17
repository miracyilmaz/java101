package manav;

import java.util.Scanner;

public class manav {
	static final double armutBirim= 2.14,elma= 3.67,domates=1.11,muz=0.95,patlican=5.0;
	public static void main(String[] args) {
		int armutKg,elmaKg,domatesKg,muzKg,patlicanKg;
		double tutar;
		Scanner klv = new Scanner(System.in);
		System.out.print("Armut Kaç Kilo ? :");
		armutKg=klv.nextInt();
		System.out.print("Elma Kaç Kilo ? :");
		elmaKg=klv.nextInt();
		System.out.print("Domates Kaç Kilo ? :");
		domatesKg=klv.nextInt();
		System.out.print("Muz Kaç Kilo ? :");
		muzKg=klv.nextInt();
		System.out.print("Patlýcan Kaç Kilo ? :");
		patlicanKg=klv.nextInt();
		tutar=(armutBirim*armutKg)+(elma*elmaKg)+(domates*domatesKg)+(muz*muzKg)+(patlican*patlicanKg);
		System.out.println("Toplam Tutar: "+tutar);
	}

}
