package Daire;

import java.util.Scanner;

public class daire {
	static final double pi=3.14;
	public static void main(String[] args) {
		Scanner klv = new Scanner(System.in);
		int secim;
		while(true) {
			
			System.out.print("Dairenin Alanini  Bulmak icin 1'e"
					+ "\nDairenin Cevresini Hesaplamak icin 2'ye\n"
					+ "Daire Diliminin Alanini Hesaplamak icin 3'e basýnýz: ");
			secim=klv.nextInt();
			
			if(secim==1) {
				int yaricap;
				System.out.print("Dairenin Yari Capi:");
				yaricap=klv.nextInt();
				System.out.println("Dairenin Alani:"+alanHesapla(yaricap));
				break;
			}
			else if(secim==2) {
				int yaricap;
				System.out.print("Dairenin Yari Capi:");
				yaricap=klv.nextInt();
				System.out.println("Dairenin Cevresi:"+cevreHesapla(yaricap));
				break;
					
			}
			else if(secim==3) {
				int yaricap, aci;
				System.out.print("Dairenin Yari Capi:");
				yaricap=klv.nextInt();
				System.out.print("Dairenin Diliminin Acisi:");
				aci=klv.nextInt();
				System.out.println("Dairenin Diliminin Alani:"+dilimHesapla(yaricap, aci));
				
				break;
			}
			else {
				System.out.println("Yanlis tuslama yaptiniz");
			}
		}
	}
	static double alanHesapla(int yaricap) {
		double alan=pi*Math.pow(yaricap, 2);
		return alan;
	}
	static double cevreHesapla(int yaricap) {
		double cevre=pi*yaricap*2;
		return cevre;
	}
	static double dilimHesapla(int yaricap,int aci) {
		double dilim=(pi*Math.pow(yaricap, 2)*aci)/360;
		return dilim;
	}

}
