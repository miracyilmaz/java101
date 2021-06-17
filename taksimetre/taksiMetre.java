package TaksiMetre;

import java.util.Scanner;

public class taksiMetre {

	public static void main(String[] args) {
		Scanner klv= new Scanner(System.in);
		double km,km_birim=2.2,tutar;
		int minTutar=20,acilisFiyati=10;
		
		System.out.print("gidilen yol: ");
		km=klv.nextDouble();
		tutar=km*km_birim+(double)acilisFiyati;
		
		if(tutar<=(double)minTutar) {
			tutar=(double)minTutar;
		}
		
		System.out.println("Tutar: "+tutar);	
	}

}
