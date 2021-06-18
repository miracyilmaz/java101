package dersler;
import java.util.Scanner;
	public class derslerOrtalama {
		
		static Scanner klv= new Scanner(System.in);
		static int matVize,matFinal,fizikVize,fizikFinal,turkceVize,turkceFinal;
		static int muzikVize,muzikFinal,kimyaVize,kimyaFinal;
		static double genelOrt;
		
		public static void main(String[] args) {
			sonuc(matOrtHesapla(),fizikOrtHesapla(),turkceOrtHesapla(),kimyaOrtHesapla(),muzikOrtHesapla());	
		}
		static double matOrtHesapla() {
			System.out.print("Matematik Vize Notunu Giriniz: ");
			matVize=klv.nextInt();
			System.out.print("Matematik Final Notunu Giriniz: ");
			matFinal=klv.nextInt();
			return (matVize+matFinal)/2;
		}
		static double fizikOrtHesapla() {
			System.out.print("Fizik Vize Notunu Giriniz: ");
			fizikVize=klv.nextInt();
			System.out.print("Fizik Final Notunu Giriniz: ");
			fizikFinal=klv.nextInt();
			return (fizikVize+fizikFinal)/2;
		}
		static double turkceOrtHesapla() {
			System.out.print("Turkce Vize Notunu Giriniz: ");
			turkceVize=klv.nextInt();
			System.out.print("Turkce Final Notunu Giriniz: ");
			turkceFinal=klv.nextInt();
			return (turkceVize+turkceFinal)/2;
		}
		static double kimyaOrtHesapla() {
			System.out.print("Kimya Vize Notunu Giriniz: ");
			kimyaVize=klv.nextInt();
			System.out.print("Kimya Final Notunu Giriniz: ");
			kimyaFinal=klv.nextInt();
			return (kimyaVize+kimyaFinal)/2;
		}
		static double muzikOrtHesapla() {
			System.out.print("Muzik Vize Notunu Giriniz: ");
			muzikVize=klv.nextInt();
			System.out.print("Muzik Final Notunu Giriniz: ");
			muzikFinal=klv.nextInt();
			return (muzikVize+muzikFinal)/2;
		}
		static void sonuc(double matOrt,double fizikOrt,double TRort,double kimyaOrt,double muzikOrt) {
			
			int dersSayisi=0,toplamNot=0;
			
			if(matOrt>0&&matOrt<100) {
				toplamNot+=matOrt;
				dersSayisi++;
			}
			if(fizikOrt>0&&fizikOrt<100) {
				toplamNot+=fizikOrt;
				dersSayisi++;
			}
			if(TRort>0&&TRort<100) {
				toplamNot+=TRort;
				dersSayisi++;
			}
			if(kimyaOrt>0&&kimyaOrt<100) {
				toplamNot+=kimyaOrt;
				dersSayisi++;
			}
			if(muzikOrt>0&&muzikOrt<100) {
				toplamNot+=muzikOrt;
				dersSayisi++;
			}
			if(dersSayisi!=0) {
				genelOrt=toplamNot/dersSayisi;
				if(genelOrt>=55) 
					System.out.println("Sinifi Gectiniz");
				else
					System.out.println("Sinif Tekrari");
			}
			else
				System.out.println("Hata");
		
		}

}
