package diziOrtalama;

public class diziOrtalama {
	public static void main(String []args) {
		int[] numbers = {1, 2, 3, 4, 5};
        double toplam = 0;
        for (int i = 0; i < numbers.length; i++) {
        	  toplam = toplam + (double)1 / numbers[i];
        }      
        System.out.println("Harmonik Ortalama: "+((double) numbers.length/toplam));
	}
	
}
