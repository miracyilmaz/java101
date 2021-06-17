package hipotenus;
import java.util.Scanner;
public class hipotenus {

	public static void main(String[] args) {
		int birinciKenar,ikinciKenar,ucuncuKenar;
		int secim;
		while(true) {
			Scanner klv = new Scanner(System.in);
			System.out.print("Hipotenüs Bulmak Ýçin 1'e\nAlan Hesaplamak için 2'ye basýnýz: ");
			secim=klv.nextInt();
			if(secim==1) {
				System.out.print("Birinci Kenari Giriniz: ");
				birinciKenar=klv.nextInt();
				System.out.print("Ikinci Kenari Giriniz: ");
				ikinciKenar=klv.nextInt();
				hipotenusBul(birinciKenar, ikinciKenar);
				break;
				
			}
			else if(secim==2) {
				System.out.print("Birinci Kenari Giriniz: ");
				birinciKenar=klv.nextInt();
				System.out.print("Ikinci Kenari Giriniz: ");
				ikinciKenar=klv.nextInt();
				System.out.print("Ucuncu Kenari Giriniz: ");
				ucuncuKenar=klv.nextInt();
				alanHesapla(birinciKenar, ikinciKenar, ucuncuKenar);
				break;
				
			}
			else {
				System.out.println("Yanlis tuslama yaptiniz");
			}
		}

	}
	
	static boolean ucgenOlurMu(int birinciKenar,int ikinciKenar ,int ucuncuKenar) {
		
		 if((Math.abs(birinciKenar-ikinciKenar))<ucuncuKenar&&ucuncuKenar<(birinciKenar+ikinciKenar)) 
			 if((Math.abs(ucuncuKenar-ikinciKenar))<birinciKenar&&ucuncuKenar<(ucuncuKenar+ikinciKenar)) 
				 if((Math.abs(ucuncuKenar-birinciKenar))<ikinciKenar&&ucuncuKenar<(ucuncuKenar+birinciKenar)) 
					 return true;
				 
				 else 
					 return false;
				 
			 
			 else 
				 return false;

		 else 
			 return false;
		 
		
	}
	static void alanHesapla(int birinciKenar,int ikinciKenar ,int ucuncuKenar) {
		double cevre,u,alan;
		
		if(ucgenOlurMu(birinciKenar, ikinciKenar, ucuncuKenar)==true) {
			cevre=birinciKenar+ikinciKenar+ucuncuKenar;
			u=cevre/2;
			alan=Math.sqrt(u*(u-birinciKenar)*(u-ikinciKenar)*(u-ucuncuKenar));
			System.out.println("ucgenin alani: "+alan);
		}
		else {
			System.out.println("Girdiðiniz Deðerlerle Bir üçgen Çizilemez");
		}
	
	}
	static void hipotenusBul(int birinciKenar,int ikinciKenar) {
		double hipotenus;
		hipotenus= Math.sqrt(Math.pow(birinciKenar, 2)+Math.pow(ikinciKenar, 2));
		System.out.println("Dik ucgenin hipotenus uzunlugu: "+hipotenus);
	}

}
