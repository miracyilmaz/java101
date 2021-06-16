package KDV;
import java.util.Scanner;

public class kdv {

	public static void main(String[] args) {
		
		double fiyat,kdvTutari,kdvliFiyat,kdv;
		Scanner klv= new Scanner(System.in);
		System.out.print("Alinan urunun fiyatini giriniz: ");
		fiyat=klv.nextDouble();
		if (fiyat>0&&fiyat<=1000) {
			kdv=18.0;
			kdvTutari=fiyat*kdv/100;
			kdvliFiyat=fiyat+kdvTutari;
			System.out.println("kdv miktari: "+kdv+"\n"+"kdv tutari: "+kdvTutari+"\n"+
			"girilen fiyat: "+fiyat+"\n"+"kdvli fiyat: "+kdvliFiyat);
		}
		else {
			kdv=8.0;
			kdvTutari=fiyat*kdv/100;
			kdvliFiyat=fiyat+kdvTutari;
			System.out.println("kdv miktari: "+kdv+"\n"+"kdv tutari: "+kdvTutari+"\n"+
			"girilen fiyat: "+fiyat+"\n"+"kdvli fiyat: "+kdvliFiyat);
		}

	}

}
