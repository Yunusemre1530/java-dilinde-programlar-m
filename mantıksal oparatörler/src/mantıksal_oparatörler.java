import java.util.Scanner;


public class mant�ksal_oparat�rler {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String ska="Yunus Emre";
		String spa="56321";
		System.out.println("kullan�c� ad�n� giriniz");
		String ka=scan.nextLine();
		System.out.println("�ifrenizi giriniz");
		String pa=scan.nextLine();
		if(!(ska.equals(ka)) && !(spa.equals(pa))){
			System.out.println("�ifre ve kullan�c� ad� hatal�");
		}
		else if((ska.equals(ka)) && !(spa.equals(pa))){
			System.out.println("�ifre hatal�");
		}
		else if(!(ska.equals(ka)) && (spa.equals(pa))){
			System.out.println("kullan�c� ad� hatal�");
		}
		else{
			if((ska.equals(ka)) && (spa.equals(pa))){
				System.out.println("giri� ba�ar�l�");
			}
		} 
		

	}

}
