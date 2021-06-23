package bHarfi;
import java.util.*;
public class b_harfi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int hx2 = 5;
        int genislik = (2 * hx2) - 1;
        int i, j, h = (hx2 / 2);
        for (i = 0; i < hx2; i++) {
            System.out.print("*");
            for (j = 0; j < genislik; j++) {
                if ((i == 0 || i == hx2 - 1 || i == h)
                    && j < (genislik - 2))
                    System.out.print("*");
                else if (j == (genislik - 2)
                         && !(i == 0 || i == hx2 - 1
                              || i == h))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }

	}

}
