package recursiveUsAlma;
import java.util.*;
public class recursive_usalma {

	public static void main(String[] args) {
		int sayi,us;
		Scanner klv= new Scanner(System.in);
		System.out.println("Bu program recursive us alma uygulamasidir. ");
		System.out.println("__________________________________________ ");
		System.out.print("Ussu Alinacak Sayi: ");
		sayi=klv.nextInt();
		System.out.print("Ussu Girin ");
		us=klv.nextInt();
		System.out.println("__________________________________________ ");
		System.out.println("Sonuc: "+usAl(sayi, us)); 
		
	}
	public static int usAl(int sayi,int us) {
		if (us==0)
				return 1;
			else if(sayi==1)
				return 1;
			else
				return sayi*usAl(sayi, us-1);
	}

}
