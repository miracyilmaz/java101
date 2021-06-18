package ciftBulma;

import java.util.Scanner;

public class cift_bulma {

	public static void main(String[] args) {
		int girilenSayi;
		Scanner klv = new Scanner(System.in);
		System.out.print("Bir Sayi Giriniz: ");
		girilenSayi=klv.nextInt();
		int sayac=0,bolunenSayiAdedi=0,toplam=0;
		if(girilenSayi>0) {
			for(int i=1;i<girilenSayi;i++) {
				
				if(i%2==0) {
					System.out.println(sayac+". sayimiz: "+i);
					sayac++;
					if(i%4==0&&i%3==0) {
						toplam+=i;
						bolunenSayiAdedi++;
					}
				}
				
			}
		}
		else
			System.out.println("0'dan Buyuk bir sayi giriniz...");
		
		if(bolunenSayiAdedi!=0) {
			System.out.println("3'e ve 4'e tam bölünen sayilarin ortalamasi: "+toplam/bolunenSayiAdedi);
		}
		else
			System.out.println("3 ve 4'e tam bolunen Sayi yoktur");
	}

}
