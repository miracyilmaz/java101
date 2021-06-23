package boksMaci;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);

        
        int hesapla = (int) (Math.random()*2); // 0 marc || 1 alex
        if(hesapla==0){
            System.out.println("Marc Baþlýyor");
            Ring r = new Ring(alex,marc , 90 , 100);
            r.run();
        }
        if (hesapla==1) {
            System.out.println("Alex Baþlýyor");
            Ring r = new Ring(marc,alex , 90 , 100);
            r.run();
        }

      }

}
