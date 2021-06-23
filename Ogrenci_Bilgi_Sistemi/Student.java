package ogrenciBilgiSistemi;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat,int matSozlu, int fizik,int fizikSozlu,  int kimya,int kimyaSozlu) {
    	
    	
        if (mat >= 0 && mat <= 100) {
        	this.mat.sozlu=matSozlu;
            this.mat.note = (mat*80/100)+(matSozlu*20/100);
        }

        if (fizik >= 0 && fizik <= 100) {
        	this.fizik.sozlu=fizikSozlu;
            this.fizik.note = fizik*0.8+fizikSozlu*0.2;
        }

        if (kimya >= 0 && kimya <= 100) {
        	this.kimya.sozlu=kimyaSozlu;
            this.kimya.note = (kimya*100/60)+(kimyaSozlu*40/100);;
        }

    }
    

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiþ");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sýnýfý Geçti. ");
            } else {
                System.out.println("Sýnýfta Kaldý.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öðrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }

}

