package mukemmelSayi;
import java.util.*;
public class mukemmel_sayi {

	public static void main(String[] args) {
		int sayi,toplam=0;
		Scanner klv = new Scanner (System.in);
		System.out.println("Bu Program Bir Sayinin Mükemmel Sayi Olup Olmadigini Kontrol Eder");
		System.out.println("_________________________________________________________");
		System.out.print("Sayiyi Giriniz: ");
		sayi=klv.nextInt();
		if(sayi>0) {
			for(int i=1;i<sayi;i++) {
				if(sayi%i==0) {
					toplam+=i;
				}
			}
			if(toplam==sayi) {
				System.out.println("Mukemmel Sayi");
			}
			else
				System.out.println("Mukemmel Sayi Degil!...");
			
		}
		else
			System.out.println("Lutfen pozitif bir sayi giriniz!...");
		}

}
