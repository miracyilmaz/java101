package recursiveToplama;
import java.util.*;
public class recursive_arttirma_azaltma {
	static int sinir;
	public static void main(String[] args) {
		int sayi;
		System.out.print("Bir Sayi Giriniz: ");
		Scanner klv = new Scanner(System.in);
		sayi = klv.nextInt();
		sinir=sayi;		
		azalt(arttir(sayi));

	}
	static public int arttir (int sayi) {
		
		int sonuc;
		if (sayi > 0) {
			sayi -= 5;
			System.out.print(sayi+" ");
			return arttir(sayi);
		} 
		
		return sayi;
	}
	static public int azalt(int sayi) {
		if ( sayi<sinir) {
			sayi+=5;
			System.out.print(sayi+" ");
			return azalt(sayi);
			
		}
		return sayi;
	}
	

}
