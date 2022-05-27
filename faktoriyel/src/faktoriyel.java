import java.util.Scanner;


public class faktoriyel {

	public static void main(String[] args) {
		int sayi;
		Scanner scan=new Scanner(System.in);
		System.out.println("sayi giriniz: ");
		sayi=scan.nextInt();
		int sayi1=sayi;
		int faktoriyel=1;
		while(sayi>1){
			faktoriyel=faktoriyel*sayi;
			sayi--;
		}
		System.out.println(sayi1+"!= "+faktoriyel);

	}

}
