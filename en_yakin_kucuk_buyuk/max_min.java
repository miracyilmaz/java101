package maxMinBulma;
import java.util.*;
public class max_min {

	public static void main(String[] args) {
		int girilenSayi,fark=999999999,enkucuk=-999999999;
		 List<Integer> liste = new ArrayList<Integer>();
		int[]dizi= {15,12,788,1,-1,-778,2,0};
	
		Scanner klv = new Scanner (System.in);
		System.out.print("Bir sayi giriniz: ");
		girilenSayi=klv.nextInt();
		
		/*Yakýn olan En Kucuk Sayiyi Bulmak Icin girilen sayiyla dizideki elemalarin 
		 farkini aliyoruz en kücük farka sahip olan sayiyi da en kucuk sayi seciyoruz
		 */
		
		for(int i=0;i<dizi.length;i++) {
			if(Math.abs(dizi[i]-girilenSayi)<=fark&&Math.abs(dizi[i]-girilenSayi)!=0){				
				enkucuk=dizi[i];			
				fark=Math.abs(dizi[i]-girilenSayi);
			}	
		}
		
		/*Girilen sayidan buyuk en yakin  sayiyi bulmak icin dizide bulunan sayilar icinde 
		 girilen sayidan büyük olan sayilari listeye kopyaliyoruz*/
		
		for(int i=0;i<dizi.length;i++) {
			if(girilenSayi<dizi[i]) {
				liste.add(dizi[i]);
			}
		}
		Collections.sort(liste);
		
		
		
		System.out.print("Dizi: {");
		for(int i=0;i<dizi.length-1;i++) {
			System.out.print(dizi[i]+", ");
		}
		System.out.println(dizi[dizi.length-1]+"}");
		
		System.out.println("Girilen Sayi: "+girilenSayi);
		System.out.println("Girilen sayýdan küçük en yakýn sayý: "+enkucuk);
		System.out.println("Girilen sayýdan büyük en yakýn sayý: "+liste.get(0));
	}

}
