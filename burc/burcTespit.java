package burc;
import java.util.Scanner;
public class burcTespit {
	static String [] aylar= {"ocak","subat","mart","nisan","mayis","haziran","temmuz","agustos","eylul","ekim",
			"kasim","aralik"};
	static String tarih,ay,burc;

	public static void main(String[] args) {
		
		Scanner klv= new Scanner(System.in);
		System.out.print("Dogum tarihinizi gun/ay/yil seklinde giriniz: ");
		tarih = klv.next();
		String []dizi=diziOlustur(tarih);
		burcBul(ayBul(dizi[1]),dizi);
		
		
			
		
	}
	static void burcBul(String ay,String []dizi) {
		if(ay.equals(aylar[0])) {
			if(Integer.parseInt(dizi[0])>=22) 
				burc="kova";		
			else
				burc="oglak";				
		}
		else if(ay.equals(aylar[1])) {
			if(Integer.parseInt(dizi[0])>=20)
				burc="balik";
			else
				burc="kova";
		}
		else if(ay.equals(aylar[2])) {
			if(Integer.parseInt(dizi[0])>=21)
				burc="koc";
			else
				burc="balik";
		}
		else if(ay.equals(aylar[3])) {
			if(Integer.parseInt(dizi[0])>=21)
				burc="boga";
			else
				burc="koc";
		}
		else if(ay.equals(aylar[4])) {
			if(Integer.parseInt(dizi[0])>=22)
				burc="ikizler";
			else
				burc="boga";
		}
		else if(ay.equals(aylar[5])) {
			if(Integer.parseInt(dizi[0])>=23)
				burc="yengec";
			else
				burc="ikizler";
		}
		else if(ay.equals(aylar[6])) {
			if(Integer.parseInt(dizi[0])>=23)
				burc="aslan";
			else
				burc="yengec";
		}
		else if(ay.equals(aylar[7])) {
			if(Integer.parseInt(dizi[0])>=23)
				burc="basak";
			else
				burc="aslan";
		}
		else if(ay.equals(aylar[8])) {
			if(Integer.parseInt(dizi[0])>=23)
				burc="terazi";
			else
				burc="basak";
		}
		else if(ay.equals(aylar[9])) {
			if(Integer.parseInt(dizi[0])>=23)
				burc="akrep";
			else
				burc="terazi";
		}
		else if(ay.equals(aylar[10])) {
			if(Integer.parseInt(dizi[0])>=22)
				burc="yay";
			else
				burc="akrep";
		}
		else if(ay.equals(aylar[11])) {
			if(Integer.parseInt(dizi[0])>=22)
				burc="oglak";
			else
				burc="yay";
		}
			else
				burc="yilan";
		
		System.out.println(burc);	
		
	
	}
	static String ayBul(String numara) {
		switch(numara) {
		case "01":ay=aylar[0];break;
		case "02":ay=aylar[1];break;
		case "03":ay=aylar[2];break;
		case "04":ay=aylar[3];break;
		case "05":ay=aylar[4];break;
		case "06":ay=aylar[5];break;
		case "07":ay=aylar[6];break;
		case "08":ay=aylar[7];break;
		case "09":ay=aylar[8];break;
		case "10":ay=aylar[9];break;
		case "11":ay=aylar[10];break;
		case "12":ay=aylar[11];break;
		default: ay="hata";
		}
		return ay;
	}
	static String [] diziOlustur(String tarih) {
		String[] dizi = tarih.split("/");
		return dizi;
	}

}
