import java.util.Scanner;


public class Aritmetik_operatörler {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("1. sayiyi giriniz: ");
	int x=scan.nextInt();
	    System.out.println("2.sayiyi giriniz");
	int y=scan.nextInt();
	System.out.println("toplam= "+ (x+y));
	System.out.println("fark= "+ (x-y));
	System.out.println("bölüm= "+((double) x/y));
	System.out.println("kalan= "+x%y);

	}

}
