package maasHesabi;
public class Employee {
	String name ;		//�al��an�n adi
	double salary;		// �al��an�n maa��
	double workHours; 	// Haftal�k �al��ma saati
	int hireYear; 		// ��e ba�lang�� y�l�
	
	
	public void Employee(String name,double salary,double workHours,int hireYear) {
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
	}
	 /*
	 tax() : Maa�a uygulanan vergiyi hesaplayacakt�r.
		�al��an�n maa�� 1000 TL'den az ise vergi uygulanmayacakt�r.
		�al��an�n maa�� 1000 TL'den fazla ise maa��n�n %3'� kadar vergi uygulanacakt�r.
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
	 * bonus() : Saat ba��na 30 TL olacak �ekilde maa�a uygulanacak bonus �cretleri hesaplayacakt�r.
	 */
	public double bonus() {
		double genelCalismaSaati=45;
		double bonus= workHours- genelCalismaSaati;
		return bonus;
	}
	/*	raiseSalary() : �al��an�n i�e ba�lang�� y�l�na g�re maa� art���n� hesaplayacakt�r. �uan ki y�l� 2021 olarak al�n.
		E�er �al��an 10 y�ldan az bir s�redir �al���yorsa maa��na %5 zam yap�lacakt�r.
		E�er �al��an 9 y�ldan fazla ve 20 y�ldan az �al���yorsa maa��na %10 zam yap�lacakt�r.
		E�er �al��an 19 y�ldan fazla �al���yorsa %15 zam yap�lacakt�r.
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
	/*str_toString() : �al��ana ait bilgileri ekrana bast�racakt�r.*/
	
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

