package havaDurumu;
import java.util.Scanner;
public class havaDurumu {

	public static void main(String[] args) {
		int sicaklik;
		Scanner klv= new Scanner(System.in);
		System.out.print("Hava Sicakligi Kac Derece:");
		sicaklik = klv.nextInt();
		if(sicaklik<5) 
			System.out.println("Kayak Yapiniz");
		else if(sicaklik>=5&&sicaklik<15) 
			System.out.println("Sinemaya Gidiniz");
		else if(sicaklik>=15&&sicaklik<25) 
			System.out.println("Piknik Yapiniz");
		else 
			System.out.println("Yüzmeye Gidiniz");
		
		
	}

}
