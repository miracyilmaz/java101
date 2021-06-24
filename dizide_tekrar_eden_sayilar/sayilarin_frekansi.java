package dizi_tekrar_eden;
import java.util.*;
import java.util.stream.Collectors;
public class sayilarin_frekansi {

	public static void main(String[] args) {
		 int dizi[] = { 10, 20, 20, 10, 10, 20, 5, 20 };
	        List<Integer> diziListesi = new ArrayList<>();
	        List<Integer> diziListesiTemp = new ArrayList<>();
	        List<Integer> frekans = new ArrayList<>();
	     
	        for(int i = 0; i < dizi.length; i++) {
	            diziListesi.add(dizi[i]);
	            diziListesiTemp.add(dizi[i]);
	        }
	        diziListesi = diziListesi.stream().distinct().sorted().collect(Collectors.toList());
	        
	        diziListesi.forEach(i->{
	            frekans.add(0);
	        });
	       
	        int index = 0;
	        for(int i = 0; i < diziListesi.size(); i++) {
	            index = 0;
	            for(int j = 0; j < diziListesiTemp.size(); j++) {
	                if(diziListesiTemp.get(j) == diziListesi.get(i)) {
	                    index++;
	                    
	                }
	            }
	            frekans.set(i, index);
	        }
	        System.out.print("Dizi : [");
	        for(int i=0;i<dizi.length-1;i++) {
	        	System.out.print(dizi[i]+", ");
	        }
	        System.out.println(dizi.length-1+"]");
	        System.out.println("Tekrar Sayilari");
	        
	        for(int i = 0; i < diziListesi.size(); i++) {
	            System.out.println(diziListesi.get(i) + " sayisi " + frekans.get(i)+" kere tekrar edildi. ");
		
	        }
	   }

}
