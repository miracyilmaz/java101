package sayiSiralama;
import java.util.Scanner;
public class sayiSiralama {

	public static void main(String[] args) {
		double sayi1,sayi2,sayi3;
		double temp;
		Scanner klv= new Scanner(System.in);
		System.out.print("Birinci Sayiyi Giriniz: ");
		sayi1=klv.nextDouble();
		System.out.print("ikinci Sayiyi Giriniz: ");
		sayi2=klv.nextDouble();
		System.out.print("Ucuncu Sayiyi Giriniz: ");
		sayi3=klv.nextDouble();
		double dizi[]={sayi1,sayi2,sayi3};
		
		for(int i = 0; i < 3; i++)
        {
            for(int j = i+1; j < 3; j++)
            {
                if(dizi[j] < dizi[i]) {
                    temp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = temp;
                }
            }
        }
		System.out.println("buyuktan kucuga siralama");
		for(int i=0;i<dizi.length-1;i++) {
			System.out.print(dizi[i]+" > ");
		}
		System.out.println(dizi[dizi.length-1]);
		System.out.println("kucuktan buyuge siralama");
		for(int i=dizi.length-1;i>=1;i--) {
			System.out.print(dizi[i]+" > ");
		}
		System.out.println(dizi[0]);

	}

}
