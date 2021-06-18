package faktoriyel;
import java.util.Scanner;
public class faktoriyel_hesapla {
	static Scanner klv=new Scanner(System.in);
	public static void main(String[] args) {
		int secim;
		while (true) {
			System.out.print("Faktoriyel Hesaplamak Icin 1'e\n"
					+"kombinasyon hesaplamak icin 2'ye basiniz: ");
			secim=klv.nextInt();
			if(secim==1) {
				faktoriyelHesapla();
				break;
			}
			else if(secim==2) {
				kombinasyonHesapla();
				break;
			}
			else {
				System.out.println("yanlis tuslama yaptiniz tekrar deneyin");
				System.out.println("-----------------------------------------\n");
			}
				
		}			
	}
	static void kombinasyonHesapla() {
		int n,r,sonuc,nFaktoriyel=1,rFaktoriyel=1,n_rFaktoriyel=1;
		System.out.println("Bu program kombinasyon hesaplamaktadir.\n");
		System.out.print("n degerini giriniz: ");
		n=klv.nextInt();
		System.out.print("r degerini giriniz: ");
		r=klv.nextInt();
		if(n>=r) {
			if(n>0) {
				if(r>0) {
					for(int i=1;i<=n;i++) {
						nFaktoriyel*=i;
					}
					for(int i=1;i<=r;i++) {
						rFaktoriyel*=i;
					}
					for(int i=1;i<=n-r;i++) {
						n_rFaktoriyel*=i;
					}
					sonuc=nFaktoriyel/(rFaktoriyel*n_rFaktoriyel);
					System.out.println(n+" sayisinin "+r+" ile kombinasyonu: "+sonuc);
				}
				else if(r==0) {
					System.out.println("sonuc 1'dir");
				}
				else {
					System.out.println("Bu islem Yapilamaz");
				}
			}
			else if(n==0) {
				System.out.println("sonuc 1'dir");
			}
			else
				System.out.println("bu islem yapilamaz");
		}
		else
			System.out.println("bu islem yapilamaz n rden kucuk olamaz");
	}
	static void faktoriyelHesapla() {
		int girilenSayi,carpma=1;
		System.out.println("bu program faktoriyel hesaplamaktadir\n");
		System.out.print("bir sayi giriniz: ");
		girilenSayi=klv.nextInt();
		if(girilenSayi>0) {
			for(int i=1;i<=girilenSayi;i++) {
				carpma*=i;
			}
			System.out.println(girilenSayi+" sayisinin faktoriyeli: "+carpma);
		}
		else if(girilenSayi==0) {
			System.out.println("sonuc 1'dir");
		}
		else
			System.out.println("lutfen sifirdan buyuk bir sayi giriniz...");
	}
}
