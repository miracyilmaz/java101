package ucakBileti;
import java.util.Scanner;
public class ucakBileti {
	public static void main(String[] args) {
		 Scanner klv = new Scanner(System.in);
	        System.out.print("Mesafeyi Km turunden giriniz: "); 
	        int km = klv.nextInt();
	        System.out.print("Yasinizi giriniz: ");
	        int yas = klv.nextInt();
	        System.out.print("Yolculuk tipi seciniz (=> 1-Tek Yon, => 2-Gidis Donus): ");
	        int secim = klv.nextInt();
	        
	        if(km>0 && yas>0 && secim==1 || secim==2){
	            int fiyat = (int) (km * 0.10);
	            System.out.println("Normal Tutar: "+fiyat);
	            if(yas<12 && secim==1){
	                int indirimli = (int) (fiyat*0.50);
	                fiyat -= indirimli;
	                System.out.println("Ýndirimli tutar: "+fiyat);
	            }
	            else if(yas<12 && secim==2){
	                int indirimli = (int) (fiyat*0.50);
	                int indirimliTutar = fiyat-indirimli;
	                int donusIndirim = (int) (indirimliTutar*.20);
	                fiyat = (indirimliTutar-donusIndirim)*2;
	                System.out.println("Ýndirimli tutar: "+fiyat);
	            }
	            else if(yas>=12 || yas<=24 && secim==1){
	                int indirimli = (int) (fiyat*0.10);
	                fiyat -= indirimli;
	                System.out.println("Ýndirimli tutar: "+fiyat);
	            }
	            else if(yas>=12 || yas<=24 && secim==2){
	                int indirimli = (int) (fiyat*0.10);
	                int indirimliTutar = fiyat-indirimli;
	                int donusIndirim = (int) (indirimliTutar*0.20);
	                fiyat = (indirimliTutar-donusIndirim)*2;
	                System.out.println("Ýndirimli tutar: "+fiyat);
	            }
	            else if(yas>=65 && secim==1){
	                int indirimli = (int) (fiyat*0.30);
	                fiyat -= indirimli;
	                System.out.println("Ýndirimli tutar: "+fiyat);
	            }
	            else if(yas>=65 && secim==2){
	                int indirimli = (int) (fiyat*0.30);
	                int indirimliTutar = fiyat-indirimli;
	                int donusIndirim = (int) (indirimliTutar*0.20);
	                fiyat = (indirimliTutar-donusIndirim)*2;
	                System.out.println("Ýndirimli tutar: "+fiyat);
	            }
	            
	            
	            
	        }else{
	            System.out.println("Hatalý Veri Girdiniz");
	        }

	}

}
