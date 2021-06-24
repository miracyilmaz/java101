package dizi_siralama;
import java.util.*;
public class dizi_siralama {

	public static void main(String[] args) {
		Scanner klv=new Scanner(System.in);
		int diziBoyut;
		System.out.println("bu girilen diziyi kucukten buyuge siralama programidir.");
		System.out.println("______________________________________________________");
		System.out.print("dizinizin uzunlugunu giriniz: ");
		diziBoyut=klv.nextInt();
		if(diziBoyut>0) {
			int []dizi= new int[diziBoyut];
			for(int i =0;i<diziBoyut;i++) {
				System.out.print("dizinin "+(i+1)+". elemanini giriniz: ");
				dizi[i]=klv.nextInt();
			}
			Arrays.sort(dizi);
			System.out.print("Siralanmis dizi: {");
			for (int i = 0; i < dizi.length-1; i++) {
				System.out.print(dizi[i]+", ");
			}
			System.out.println(dizi[dizi.length-1]+" }");

		}
		else
			System.out.println("Gecerli Bir Sayi Giriniz!...");
	}

}
