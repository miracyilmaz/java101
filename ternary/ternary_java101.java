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
	        System.out.println("T�rk�e Notunu Giriniz: ");
	        int turkce = klv.nextInt();
	        System.out.println("Tarih Notunu Giriniz: ");
	        int tarih = klv.nextInt();
	        System.out.println("M�zik Notunu Giriniz: ");
	        int muzik = klv.nextInt();
	        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
	        double sonuc = (double)toplam / 6.0;
	        System.out.println("Notlar�n Ortalamas�: " + sonuc);
	        
	        String durum = sonuc>=60 ? "S�n�f� Ge�ti" : "S�n�fta Kald�";
	        System.out.println(durum);

	}

}
