package maasHesabi;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner klv=new Scanner(System.in);
		Employee eleman= new Employee();
		System.out.print("Elemanin ismini giriniz: ");
		eleman.name=klv.next();
		System.out.print("Elemanin maasini giriniz: ");
		eleman.salary=klv.nextDouble();
		System.out.print("Elemanin Haftalik Calisma Saatini Giriniz: ");
		eleman.workHours=klv.nextDouble();
		System.out.print("Elemanin Ise Baslngic Yilini Giriniz: ");
		eleman.hireYear=klv.nextInt();
		eleman.str_toString();
	}

}
