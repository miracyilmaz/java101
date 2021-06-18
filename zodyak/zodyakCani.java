package zodyak;
import java.util.Scanner;
public class zodyakCani {

	public static void main(String[] args) {
		int yil;
		String burc;
		Scanner klv = new Scanner(System.in);
		System.out.print("Dogum Yilinizi Giriniz: ");
		yil=klv.nextInt();
		if(yil<2022&&yil>1900) {
			if(yil%12==0)
				burc="maymun";
			else if(yil%12==1)
				burc="horoz";
			else if(yil%12==2)
				burc="kopek";
			else if(yil%12==3)
				burc="domuz";
			else if(yil%12==4)
				burc="fare";
			else if(yil%12==5)
				burc="okuz";
			else if(yil%12==6)
				burc="kaplan";
			else if(yil%12==7)
				burc="tavsan";
			else if(yil%12==8)
				burc="ejderha";
			else if(yil%12==9)
				burc="yilan";
			else if(yil%12==10)
				burc="at";
			else 
				burc="koyun";
			System.out.println("Cin Zodyagi Burcunuz: "+burc);
		}
		else
			System.out.println("Lütfen gecerli bir tarih giriniz...");
		
	}

}
