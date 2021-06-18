package loginIslemi;
import java.util.Scanner;
public class loginIslem {
	static String userName="mirac",password="Asd123";
	static Scanner klv = new Scanner (System.in);
	public static void main(String[] args) {
		String kullaniciAdi,sifre;				
		System.out.print("Kullanici Adini Giriniz: ");
		kullaniciAdi=klv.next();
		System.out.print("Sifrenizi Giriniz: ");
		sifre=klv.next();
		if(kullaniciAdi.equals(userName)&&sifre.equals(password)) {
			System.out.println("Giris Yapýlýyor ...");		
		}
		else {
			if(kullaniciAdi.equals(userName)==false) {
				System.err.print(" Bir Kullanci Bulunmamaktadir");	
				
			}	
			else  {
				System.err.println("Sifre Yanlis");
				System.out.println("Sifrenizi Sifirlamak ister misiniz?");
				System.out.print("Evet cevabi icin 1'e\n"
								+"Hayir cevabi icin 2'ye basiniz: ");
				int yanit=klv.nextInt();
				switch(yanit) {
					case 1:sifreOlustur();break;
					case 2: System.out.println("Sifrenizi Kontrol Edip Tekrar Deneyin"); break;
					default:System.out.println("Yanlis Tuslama Yaptiniz");
				}				
			}
		}
	}
	static void sifreOlustur() {
		while(true) {
			String yeniSifre;
			System.out.print("Yeni Sifrenizi Giriniz:");
			yeniSifre=klv.next();
			if(yeniSifre.equals(password)) {
				System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz.");
			}
			else {
				System.out.println("Ýslem Basarili");
				password=yeniSifre;
				break;
			}
				

		}
	}

}
