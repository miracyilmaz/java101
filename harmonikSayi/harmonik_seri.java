package harmonikSeri;
import java.util.*;
public class harmonik_seri {

	public static void main(String[] args) {
		 Scanner klv = new Scanner(System.in);
	        System.out.println("N sayısını giriniz :");
	        double n = klv.nextInt();
	        double result = 0;
	        while (n > 0) {
	            result += (1 / n);
	            n--;
	        }

	        System.out.println(result);
	    }

	}


