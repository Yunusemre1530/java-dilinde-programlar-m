import java.util.Scanner;


public class koþullu_durumlar {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("vizeyi giriniz");
		int vize=scan.nextInt();
		System.out.println("finali giriniz");
		int fýnal=scan.nextInt();
		double ortalama=(vize*((double)4/10))+(fýnal*((double)6/10));
		if(ortalama>85){ 
			if(fýnal<55){
				System.out.println("ortalamanýz "+ ortalama +" ama kaldýnýz");
			}
			else{
				System.out.println("ortalamanýz "+ortalama+" Geçtiniz");
			}
		}
		else if(ortalama>70){
			if(fýnal<55){
				System.out.println("ortalamanýz "+ ortalama +" ama kaldýnýz");
			}
			else{
				System.out.println("ortalamanýz "+ ortalama +" geçtiniz");
			}
		}
		else if(ortalama>55){
			if(fýnal<55){
				System.out.println("ortalamanýz "+ ortalama +" ama kaldýnýz");
			}
			else{
				System.out.println("ortalamanýz "+ ortalama +" geçtiniz");
			}
		}
		else{
			System.out.println("kaldýnýz "+ ortalama);
		}
		
		
		

	}

}
