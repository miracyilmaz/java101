package artikYil;
import java.util.Scanner;
public class artik_yil {
	public static void main(String[] args) {
		int yil;
		Scanner klv=new Scanner (System.in);
		System.out.print("Yili Giriniz: ");
		yil=klv.nextInt();
		boolean artik ;
        if(yil % 4 == 0)
        {
            if( yil % 100 == 0)
            {
                if ( yil % 400 == 0)
                    artik = true;
                else
                    artik = false;
            }
            else
                artik = true;
        }
        else
            artik = false;
        if(artik==true)
            System.out.println(yil + " bir artik yildir.");
        else
            System.out.println(yil + " bir artýk yil deðildir.");

	}

}
