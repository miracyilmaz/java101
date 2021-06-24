package matris_transpoz;
import java.util.*;
public class matrisTranspoze {

	public static void main(String[] args) {
		int satirSayisi,sutunSayisi;
        Scanner klv = new Scanner(System.in);
        System.out.print("satir sayisini giriniz: ");
        satirSayisi = klv.nextInt();
        System.out.print("sutun sayisini giriniz: ");
        sutunSayisi = klv.nextInt();
        int matris[][] = new int[satirSayisi][sutunSayisi];
        for(int i=0;i<satirSayisi;i++)
        {
            for(int j=0;j<sutunSayisi;j++)
            {	
            	System.out.print((i+1)+". satirin "+(j+1)+". elemanini giriniz: ");
                matris[i][j]=klv.nextInt();
            }
        }
        int transpoz[][] = new int[sutunSayisi][satirSayisi];
        for(int i=0;i<satirSayisi;i++)
        {
             for(int j=0;j<sutunSayisi;j++)
             {
                 transpoz[j][i]=matris[i][j];
             }
        }
        System.out.println("Matris");
        for(int i=0;i<satirSayisi;i++)
        {
             for(int j=0;j<sutunSayisi;j++)
             {
               System.out.print(matris[i][j]+" ");
             }
             System.out.println();
        }
                System.out.println("Transpoz ");
        for(int i=0;i<sutunSayisi;i++)
        {
             for(int j=0;j<satirSayisi;j++)
             {
                 System.out.print(transpoz[i][j]+" ");
             }
             System.out.println();
        }
	}

}
