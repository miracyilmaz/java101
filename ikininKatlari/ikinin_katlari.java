package ikininKatlari;
import java.util.Scanner;
public class ikinin_katlari {
	static int girilenSayi;
	static Scanner klv=new Scanner(System.in);

	public static void main(String[] args) {
		int secim;
		System.out.print("ikinin katlarini bulmak icin 1'e\n"
				+"dordun katlarini bulmak icin 2'ye \n "
				+"besin katlarini bulmak icin 3'e basiniz:");
		secim=klv.nextInt();
		switch(secim) {
			case 1:ikininKatlari();break;
			case 2:dordunKatlari();break;
			case 3:besinKatlari();break;
			default:System.out.println("yanlis tuslama yaptiniz");
		}
	}
	static void ikininKatlari() {
		System.out.println("Girdiginiz sayiya kadar ikinin katlari olan sayilari ekrana yazdiracaktir\n\n\n");
		System.out.print("Bir Sayi Giriniz: ");
		girilenSayi=klv.nextInt();
		if(girilenSayi<0) {
			for(int i=0;i>girilenSayi;i--) {
				if(i%2==0) 
					System.out.println(i);
			}
		}
		else if(girilenSayi>0){
			for(int i=0;i<girilenSayi;i++) {
				if(i%2==0) 
					System.out.println(i);
			}
		}
		else
			System.out.println("Baslangic noktamiz 0 oldugu icin bu islem yapilamaz");
	}
	static void dordunKatlari() {
		System.out.println("Girdiginiz sayiya kadar dortun katlari olan sayilari ekrana yazdiracaktir\n");
		System.out.print("Bir Sayi Giriniz: ");
		girilenSayi=klv.nextInt();
		if(girilenSayi<0) {
			for(int i=0;i>girilenSayi;i--) {
				if(i%4==0) 
					System.out.println(i);
			}
		}
		else if(girilenSayi>0){
			for(int i=0;i<girilenSayi;i++) {
				if(i%4==0) 
					System.out.println(i);
			}
		}
		else
			System.out.println("Baslangic noktamiz 0 oldugu icin bu islem yapilamaz");
	}
	static void besinKatlari() {
		System.out.println("Girdiginiz sayiya kadar besin katlari olan sayilari ekrana yazdiracaktir\n");
		System.out.print("Bir Sayi Giriniz: ");
		girilenSayi=klv.nextInt();
		if(girilenSayi<0) {
			for(int i=0;i>girilenSayi;i--) {
				if(i%5==0) 
					System.out.println(i);
			}
		}
		else if(girilenSayi>0){
			for(int i=0;i<girilenSayi;i++) {
				if(i%5==0) 
					System.out.println(i);
			}
		}
		else
			System.out.println("Baslangic noktamiz 0 oldugu icin bu islem yapilamaz");
	}

}
