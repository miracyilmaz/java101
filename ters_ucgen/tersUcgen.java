package tersUcken;
import java.util.*;
public class tersUcgen {

	public static void main(String[] args) {
		
		int uzunluk;
		Scanner klv=new Scanner(System.in);
		System.out.println("Bu Program Girilen Sayi yüksekliginde ters ucgen olusturacaktir");
		System.out.println("___________________________________________________________");
		System.out.print("Yuksekligi Giriniz: ");
		uzunluk=klv.nextInt();
		System.out.println("\n");
		if(uzunluk>0) {
			for(int satir=0;satir<uzunluk;satir++) {
	        	System.out.print(" ");
	        	for(int sutun=0;sutun<satir;sutun++) {
	        		System.out.print(" ");
	        	}
	        	for(int sutun=uzunluk;sutun>satir;sutun--) {
	        		System.out.print("*");
	        	}
	        	for(int sutun=uzunluk-1;sutun>satir;sutun--) {
	        		System.out.print("*");
	        	}
	        	System.out.println(" ");
	        	}
			}
		else
			System.out.println("Lutfen Gecerli Bir Yukseklik Giriniz!...");
		}
	}
