package recursiveAsal;
import java.util.*;
public class recursive_Asal {

	public static void main(String[] args) {
		int sayi;
		Scanner klv= new Scanner(System.in);
		System.out.println("Bu program girilen sayinin asal olup olmadigini recursive bir sekilde bulmaktadir");
		System.out.println("___________________________________________________________");
        System.out.print("Sayiyi Giriniz : "); 
        sayi = klv.nextInt();
        
        if(asalMi(sayi, 2)==true)
            System.out.println("Sayi asaldir");
        else
            System.out.println("Sayi asal degildir");

	}
	  static boolean asalMi(int sayi, int sayac) {

	        if (sayi <= 2)
	        	if(sayi==2) {
	        		return true;
	        	}
	        	else
	        		return false;
	            
	        if (sayi % sayac == 0)
	            return false;
	        
	        if (sayac * sayac > sayi)
	            return true;
	      
	     
	        return asalMi(sayi, sayac +=1);
	    }

}
