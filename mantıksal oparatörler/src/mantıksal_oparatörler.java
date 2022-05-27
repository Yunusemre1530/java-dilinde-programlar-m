import java.util.Scanner;


public class mantýksal_oparatörler {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String ska="Yunus Emre";
		String spa="56321";
		System.out.println("kullanýcý adýný giriniz");
		String ka=scan.nextLine();
		System.out.println("þifrenizi giriniz");
		String pa=scan.nextLine();
		if(!(ska.equals(ka)) && !(spa.equals(pa))){
			System.out.println("þifre ve kullanýcý adý hatalý");
		}
		else if((ska.equals(ka)) && !(spa.equals(pa))){
			System.out.println("þifre hatalý");
		}
		else if(!(ska.equals(ka)) && (spa.equals(pa))){
			System.out.println("kullanýcý adý hatalý");
		}
		else{
			if((ska.equals(ka)) && (spa.equals(pa))){
				System.out.println("giriþ baþarýlý");
			}
		} 
		

	}

}
