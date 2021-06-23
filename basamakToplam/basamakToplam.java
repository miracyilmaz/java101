package basamakToplami;
import java.util.Scanner;
public class basamakToplam {
	public static void main(String[]args) {
		int sayi;
		Scanner klv = new Scanner (System.in);
		System.out.println("Bu program girilen sayinin basamak sayilarini toplamak için yazilmistir.");
		System.out.println("lutfen bir sayi giriniz");
		sayi = klv.nextInt();
		basamakTopla(sayi);
		
	}
	public static void basamakTopla(int sayi) {
		 int adet = 0,toplam=0;		 
	        while(sayi != 0)
	        {
	           toplam=(sayi%10)+toplam;
	           sayi /= 10;
	            ++adet;
	        }
	        System.out.println(toplam);
	}

}
