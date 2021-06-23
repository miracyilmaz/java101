package palindromSayilar;
import java.util.*;
public class palindrom {

	public static void main(String[] args) {
		int sayi;
		Scanner klv= new Scanner(System.in);
		System.out.println("Bu Program Palindrom Sayilarin Tespiti icin yazilmistir");
		System.out.println("_________________________________________________________\n");
		System.out.print("Sayiyi Giriniz: ");
		sayi=klv.nextInt();
		if(sayi>9) {
			if(hesapla(sayi)==true) {
				System.out.println("Bu bir palindrom sayidir");
			}
			else {
				System.out.println("Bu bir palindrom sayi degildir!...");
			}
		}
		else
			System.out.println("Lutfen En Az Iki Haneli Bir Sayi Giriniz!...");
		
	}
	public static boolean hesapla(int sayi) {
		
		int temp = sayi, reverseNumber = 0, mod;
        while (temp != 0) {
            mod = temp % 10;
            reverseNumber = (reverseNumber * 10) + mod;
            temp /= 10;
        }
        return sayi == reverseNumber;
	}
}
