package tekleriTopla;
import java.util.Scanner;
public class tekleri_topla {
	static int sayi,toplam=0;
	static Scanner klv=new Scanner(System.in);
	public static void main(String[] args) {
		int secim;
		
		while (true) {
			System.out.print("tek sayilarin toplami icin 1'e\n"
					+"cift sayilarin ve 4ün katlarinin toplamini bulmak icin 2'ye basiniz: ");
			secim=klv.nextInt();
			if(secim==1) {
				tekleriTopla();
				break;
			}
			else if(secim==2) {
				dordunKatlari();
				break;
			}
			else 
				System.out.println("yanlis tuslama yaptiniz tekrar deneyin");
		}


	}
	static void tekleriTopla() {
		System.out.println("Negatif Sayi Girilene Kadar Program Devam Edecek\n"
				+"girilen her tek sayi toplanacak.\n");
		while(true) {
			System.out.print("bir sayi giriniz: ");
			sayi=klv.nextInt();
			if(sayi>=0) {
				if(sayi%2==1) {
					toplam+=sayi;
				}
			}
			else
				break;
		}
		System.out.println("Girilen Tek Sayilarin Toplam: "+toplam);
	}
	static void dordunKatlari() {
	
		System.out.println("Tek Girilene Kadar Program Devam Edecektir\n");
		while(true) {
			System.out.print("bir sayi giriniz: ");
			sayi=klv.nextInt();
			if(sayi%2==0) {
				if(sayi%4==0) {
					toplam+=sayi;
				}
				else if(sayi%2==0) {
					toplam+=sayi;
				}
			}
			else
				break;
		}
		System.out.println("2ye bolunen ve 4e bolunen sayilarin toplami: "+toplam);

	}
}
