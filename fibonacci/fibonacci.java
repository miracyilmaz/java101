package fibonacci;
import java.util.*;
public class fibonacci {

	public static void main(String[] args) {
		Scanner klv = new Scanner(System.in);
        int n1=0,n2=1,n3,i,n;
        System.out.print("N Sayýsýný Girin:");
        n = klv.nextInt();
        for(i=2;i<=n;++i){  
        	n3=n1+n2;  
        	System.out.println(n1+"+"+n2+"="+n3);  
			n1=n2;  
			n2=n3;  
			}
        System.out.println();
        }
	}


