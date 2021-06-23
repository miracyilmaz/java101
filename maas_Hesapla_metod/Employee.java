package maasHesabi;
public class Employee {
	String name ;		//Çalýþanýn adi
	double salary;		// Çalýþanýn maaþý
	double workHours; 	// Haftalýk çalýþma saati
	int hireYear; 		// Ýþe baþlangýç yýlý
	
	
	public void Employee(String name,double salary,double workHours,int hireYear) {
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
	}
	 /*
	 tax() : Maaþa uygulanan vergiyi hesaplayacaktýr.
		Çalýþanýn maaþý 1000 TL'den az ise vergi uygulanmayacaktýr.
		Çalýþanýn maaþý 1000 TL'den fazla ise maaþýnýn %3'ü kadar vergi uygulanacaktýr.
	 */
	public double tax(double salary) {
		double vergi=0;
		if(salary<=1000) {
			return 0;
		}
		else {
			vergi=salary*0.03;
			return vergi;
		}
		
	}
	/*
	 * bonus() : Saat baþýna 30 TL olacak þekilde maaþa uygulanacak bonus ücretleri hesaplayacaktýr.
	 */
	public double bonus() {
		double genelCalismaSaati=45;
		double bonus= workHours- genelCalismaSaati;
		return bonus;
	}
	/*	raiseSalary() : Çalýþanýn iþe baþlangýç yýlýna göre maaþ artýþýný hesaplayacaktýr. Þuan ki yýlý 2021 olarak alýn.
		Eðer çalýþan 10 yýldan az bir süredir çalýþýyorsa maaþýna %5 zam yapýlacaktýr.
		Eðer çalýþan 9 yýldan fazla ve 20 yýldan az çalýþýyorsa maaþýna %10 zam yapýlacaktýr.
		Eðer çalýþan 19 yýldan fazla çalýþýyorsa %15 zam yapýlacaktýr.
	*/
	public double raiseSalary(int hireYear,double salary) {
		if(2021-hireYear>19) {
			return salary*0.15;
		}
		else if(2021-hireYear<10) {
			return salary*0.05;
		}
		else
			return salary*0.10;
	}
	/*str_toString() : Çalýþana ait bilgileri ekrana bastýracaktýr.*/
	
	public void str_toString() {

		System.out.println("Adi: "+name);
		System.out.println("Maasi: "+salary);
		System.out.println("Calisma Saati: "+workHours);
		System.out.println("Bailangic Yili: "+hireYear);
		System.out.println("Vergi: "+tax(salary));
		System.out.println("Bonus: "+bonus());
		System.out.println("Maas Artisi: "+raiseSalary(hireYear,salary));
		System.out.println("Vergi ve Bonuslar ile birlikte maas: "+(salary+tax(salary)+bonus()));
		System.out.println("Toplam Maas: "+(salary+tax(salary)+bonus()+raiseSalary(hireYear, salary)));
	}
}

