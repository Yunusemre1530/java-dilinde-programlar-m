import java.util.Scanner;


public class ko�ullu_durumlar {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("vizeyi giriniz");
		int vize=scan.nextInt();
		System.out.println("finali giriniz");
		int f�nal=scan.nextInt();
		double ortalama=(vize*((double)4/10))+(f�nal*((double)6/10));
		if(ortalama>85){ 
			if(f�nal<55){
				System.out.println("ortalaman�z "+ ortalama +" ama kald�n�z");
			}
			else{
				System.out.println("ortalaman�z "+ortalama+" Ge�tiniz");
			}
		}
		else if(ortalama>70){
			if(f�nal<55){
				System.out.println("ortalaman�z "+ ortalama +" ama kald�n�z");
			}
			else{
				System.out.println("ortalaman�z "+ ortalama +" ge�tiniz");
			}
		}
		else if(ortalama>55){
			if(f�nal<55){
				System.out.println("ortalaman�z "+ ortalama +" ama kald�n�z");
			}
			else{
				System.out.println("ortalaman�z "+ ortalama +" ge�tiniz");
			}
		}
		else{
			System.out.println("kald�n�z "+ ortalama);
		}
		
		
		

	}

}
