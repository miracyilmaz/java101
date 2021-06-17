package kitleIndex;
import java.util.Scanner;
public class kitleIndex {
	public static void main(String[] args) {
		Scanner klv = new Scanner (System.in);
		double boy,kilo,sonuc;
		System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
		boy=klv.nextDouble();
		System.out.print("Lütfen kilonuzu giriniz : ");
		kilo=klv.nextDouble();
		sonuc= kilo/Math.pow(boy, 2);
		System.out.println("Vücut Kitle Ýndeksiniz : "+sonuc);
	}

}
