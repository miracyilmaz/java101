package yildizlarlaElmas;

import java.util.*;

public class yildizlarla_elmas_yapimi {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayý Giriniz :");
        int uzunluk=klavye.nextInt();
        ustUcgen(uzunluk);        
	}
	public static void ustUcgen(int uzunluk) {
		for(int satirSayisi=0;satirSayisi<uzunluk-1;satirSayisi++) {
			for(int sutun=uzunluk;sutun>satirSayisi;sutun--) {
				System.out.print(" ");
		     }
		    for(int sutun=0;sutun<=satirSayisi;sutun++) {
		    	System.out.print("*");
		    }
		    for(int sutun=0;sutun<satirSayisi;sutun++) {
		    	System.out.print("*");
		    }
		    System.out.println("");
		}
		altUcgen(uzunluk);
	}
	public static void altUcgen(int uzunluk) {
		for(int satir=0;satir<uzunluk;satir++) {
        	System.out.print(" ");
        	for(int sutun=0;sutun<satir;sutun++) {
        		System.out.print(" ");
        	}
        	for(int sutun=uzunluk;sutun>satir;sutun--) {
        		System.out.print("*");
        	}
        	for(int sutun=uzunluk-1;sutun>satir;sutun--) {
        		System.out.print("*");
        	}
        	System.out.println(" ");
        }
	}

}
