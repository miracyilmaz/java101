package fibonacciSayilar;
import java.util.*;
public class fibonacci {

	public static void main(String[] args) {
		int girilenSayi;
		Scanner klv = new Scanner (System.in);
		System.out.println("Bu Program Girilen Fibonacci Serisi Bulmaktadir");
		System.out.println("________________________________________________");
		System.out.print("Iterasyon Sayisini Giriniz: ");
		girilenSayi=klv.nextInt();
		if(girilenSayi>0) {
			System.out.println(hesapla(girilenSayi));
		}
		else
			System.out.println("Lutfen pozitif bir sayi giriniz!...");
		
	}
	static public int hesapla(int sayi) {
		
		if (sayi == 1 || sayi == 2) {
            return 1;
        }
        return hesapla(sayi - 1) + hesapla(sayi - 2);
    
	}

}
