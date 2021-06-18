package usluSayi;
import java.util.Scanner;
public class uslu_sayi {

	public static void main(String[] args) {
		int sayi1,sayi2,carpma=1;
		Scanner klv= new Scanner(System.in);
		System.out.println("bu program girilen sayinin girilen kuvvetini almak icin yazilmistir");
		System.out.println("____________________________________________________________________");
		System.out.print("kuvvetini almak istediginiz sayiyi giriniz: ");
		sayi1=klv.nextInt();
		System.out.print("sayinin kacinci kuvvetini almak istersiniz: ");
		sayi2=klv.nextInt();
		if(sayi2==0) {
			System.out.println("sonuc 1'dir");
		}
		else if(sayi2>0) {
			for(int i=0;i<sayi2;i++) {
				carpma*=sayi1;
			}
			System.out.println(carpma);
		}
		else
			System.out.println("Sonuc Kesirlidir");
		}
		

}
