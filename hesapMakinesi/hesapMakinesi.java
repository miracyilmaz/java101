package hesapMakinesi;
import java.util.Scanner;
public class hesapMakinesi {

	public static void main(String[] args) {
		double sayi1,sayi2;
		int durum;
		Scanner klv = new Scanner (System.in);
		System.out.print("1. Sayýyý Giriniz: ");
		sayi1=klv.nextDouble();
		System.out.print("2. Sayýyý Giriniz: ");
		sayi2=klv.nextDouble();
		System.out.print("toplama yapmak icin 1'e\n"
				+"cikarma yapmak icin 2'ye\n"
				+"carpma yapmak icin 3'e\n"
				+"bölme yapmak icin 4'e basiniz: ");
		durum=klv.nextInt();
		switch(durum){
		case 1: System.out.println(toplama(sayi1,sayi2)); break;
		case 2:	System.out.println(cikarma(sayi1,sayi2));break;
		case 3:	System.out.println(carpma(sayi1,sayi2));break;
		case 4:	System.out.println(bolme(sayi1,sayi2));break;
		default : System.out.println("Yanlýs Tuslama Yaptiniz");
		}
		
	}
	static double toplama (double sayi1, double sayi2) {		
		return sayi1+sayi2;
	}
	static double cikarma (double sayi1, double sayi2) {		
		return sayi1-sayi2;
	}
	static double carpma (double sayi1, double sayi2) {		
		return sayi1*sayi2;
	}
	static double bolme (double sayi1, double sayi2) {		
		return sayi1/sayi2;
	}

}
