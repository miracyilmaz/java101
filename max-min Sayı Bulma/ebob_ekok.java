package ebobEkok;
import java.util.*;
public class ebob_ekok {

	public static void main(String[] args) {
		int sayi1,sayi2,sayac=1,ebob=1;
		double ekok;
		Scanner klv=new Scanner(System.in);
		System.out.println("Bu Program Girilen 2 sayinin ebob ve ekokunu bulmaktadir");
		System.out.println("--------------------------------------------------");
		System.out.print("Birinci Sayiyi Giriniz: ");
		sayi1=klv.nextInt();
		System.out.print("Ikinci Sayiyi Giriniz: ");
		sayi2=klv.nextInt();
		if(sayi1>0&&sayi2>0) {
			while(true) {
				if(sayac<=sayi1&&sayac<=sayi2) {
					if(sayi1%sayac==0&&sayi2%sayac==0) {
						ebob=sayac;
						sayac++;
					}
					else {
						sayac++;
					}
				}
				else
					break;
			}
			ekok=sayi1*sayi2/ebob;
			System.out.println("EBOB: "+ebob+"\nEKOK:"+ekok);
		}
		else
			System.out.println("Girdiginiz Sayilar Sifirdan Buyuk Olmalidir!..");
		
	}
	

}
