package ternary;
import java.util.Scanner;
public class ternary_java101 {

	public static void main(String[] args) {
		 Scanner klv = new Scanner(System.in);
	        System.out.println("Matematik Notunu Giriniz: ");
	        int mat = klv.nextInt();
	        System.out.println("Fizik Notunu Giriniz: ");
	        int fizik = klv.nextInt();
	        System.out.println("Kimya Notunu Giriniz: ");
	        int kimya = klv.nextInt();
	        System.out.println("Türkçe Notunu Giriniz: ");
	        int turkce = klv.nextInt();
	        System.out.println("Tarih Notunu Giriniz: ");
	        int tarih = klv.nextInt();
	        System.out.println("Müzik Notunu Giriniz: ");
	        int muzik = klv.nextInt();
	        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
	        double sonuc = (double)toplam / 6.0;
	        System.out.println("Notlarýn Ortalamasý: " + sonuc);
	        
	        String durum = sonuc>=60 ? "Sýnýfý Geçti" : "Sýnýfta Kaldý";
	        System.out.println(durum);

	}

}
