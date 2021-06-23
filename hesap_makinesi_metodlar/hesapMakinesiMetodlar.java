package hesapMakinesiMetodlar;
import java.util.*;
public class hesapMakinesiMetodlar {
	static Scanner klv=new Scanner(System.in);
	public static void main(String[] args) {
		int secim;
		System.out.println("Bu bir hesap makinesi programidir");
		System.out.println("__________________________________");
		System.out.print("toplama yapmak icin 1'e \n"+
				"cikarma yapmak icin 2'ye\n"+
				"carpma yapmak icin 3'e \n"+
				"bolme yapmak icin 4'e \n"+
				"us almak icin 5'e \n"+
				"faktoriyel hesaplamak icin 6'ya \n"+
				"dikdortgenin alanini ve cevresini bulmak icin 7'ye \n"+
				"mod almak icin 8'e basiniz: ");
		secim=klv.nextInt();
		System.out.println("__________________________________________________");
		switch(secim) {
			case 1:{
				System.out.println("Sectiginiz Islem Toplama");
				System.out.println("_________________________");
				topla();
				break;
			}
			case 2:{
				System.out.println("Sectiginiz Islem Cikarma");
				System.out.println("_________________________");
				cikar();
				break;
			}
			case 3:{
				System.out.println("Sectiginiz Islem Carpma");
				System.out.println("_________________________");
				carp();
				break;
			}
			case 4:{
				System.out.println("Sectiginiz Islem Bolme ");
				System.out.println("_________________________");
				bol();
				break;
			}
			case 5:{
				System.out.println("Sectiginiz Islem Us alma");
				System.out.println("_________________________");
				usAl();
				break;
			}
			case 6:{
			
				System.out.println("Sectiginiz Islem faktoriyel hesaplama");
				System.out.println("_________________________");
				faktoriyel();
				break;
			
			}
			case 7:{
				System.out.println("Sectiginiz Islem Cevre ve Alan Hesaplama");
				System.out.println("_________________________");
				alanCevreHesapla();
				break;
			}
			case 8:{
				System.out.println("Sectiginiz Islem mod alma");
				System.out.println("_________________________");
				modAl();
				break;
			}
			default:{
				System.out.println("Yanlis tuslama yaptiniz");
			}
				
		}
		
	}
	public static void topla() {
		int toplam=0,secim;
		double girilenSayi;
		System.out.print("Kac Sayiyi Toplamak Istersiniz: ");
		secim=klv.nextInt();
		for(int i=0;i<secim;i++) {
			System.out.print((i+1)+". Sayiyi Giriniz: ");
			girilenSayi=klv.nextInt();
			toplam+=girilenSayi;
		}
		System.out.println("_________________________");
		System.out.println("Sonuc: "+toplam);
	}
	public static void cikar() {
		int sayi1,sayi2;
		System.out.print("Çikan  Sayiyi Giriniz: ");	
		sayi1=klv.nextInt();
		System.out.print("Çikarilan Sayiyi Giriniz: ");	
		sayi2=klv.nextInt();
		System.out.println("_________________________");
		System.out.println("Sonuc: "+(sayi1-sayi2));
	}
	public static void carp () {
		int carpim=1,secim;
		double girilenSayi;
		System.out.print("Kac Sayiyi Carpmak Istersiniz: ");
		secim=klv.nextInt();
		for(int i=0;i<secim;i++) {
			System.out.print((i+1)+". Sayiyi Giriniz: ");
			girilenSayi=klv.nextInt();
			carpim*=girilenSayi;
		}
		System.out.println("Sonuc: "+carpim);
	}
	public static void bol() {
		int sayi1,sayi2;
		System.out.print("Bolunen  Sayiyi Giriniz: ");	
		sayi1=klv.nextInt();
		System.out.print("Bolen Sayiyi Giriniz: ");	
		sayi2=klv.nextInt();
		System.out.println("_________________________");
		System.out.println("Sonuc: "+((double)sayi1/sayi2));
	}
	public static void usAl() {
		int sayi1,sayi2;
		System.out.print("Ussu Alinacak  Sayiyi Giriniz: ");	
		sayi1=klv.nextInt();
		System.out.print("Sayinin Ussunu Giriniz: ");	
		sayi2=klv.nextInt();
		System.out.println("_________________________");
		System.out.println("Sonuc: "+Math.pow(sayi1, sayi2));
	
	}
	public static void faktoriyel() {
		int girilenSayi,carpma=1;
		System.out.println("bu program faktoriyel hesaplamaktadir\n");
		System.out.print("bir sayi giriniz: ");
		girilenSayi=klv.nextInt();
		if(girilenSayi>0) {
			for(int i=1;i<=girilenSayi;i++) {
				carpma*=i;
			}
			System.out.println("_________________________");
			System.out.println(girilenSayi+" sayisinin faktoriyeli: "+carpma);
		}
		else if(girilenSayi==0) {
			System.out.println("_________________________");
			System.out.println("sonuc 1'dir");
		}
		else
			System.out.println("lutfen sifirdan buyuk bir sayi giriniz...");
	}
	
	public static void alanCevreHesapla() {
		double uzunKenar,kisaKenar;
		System.out.print("Dýkdortgenin Uzun Kenarini Giriniz: ");
		uzunKenar=klv.nextDouble();
		System.out.print("Dýkdortgenin Kisa Kenarini Giriniz: ");
		kisaKenar=klv.nextDouble();
		System.out.println("_________________________");
		System.out.println("Dikdortgenin Alani: "+(uzunKenar*kisaKenar));
		System.out.println("Dikdortgenin Cervresi: "+(uzunKenar+kisaKenar)*2);
	}
	public static void modAl() {
		int sayi1,sayi2;
		System.out.print("modu Alinacak  Sayiyi Giriniz: ");	
		sayi1=klv.nextInt();
		System.out.print("bolumu Giriniz: ");	
		sayi2=klv.nextInt();
		System.out.println("_________________________");
		System.out.println("Sonuc: "+sayi1%sayi2);
	
	}
	
}
