import java.util.Scanner;


public class breakandcontinue {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(true){
			String s;
			System.out.println("karakter giriniz: ");
			s=scan.nextLine();
			if(s.equals("y")){
				System.out.println("ÇIKILIYORR....");
				break;
			}
			else{
				System.out.println("karakter "+ s);
			}
		}
		int i=10;
		while(i>0){
			i--;
			if (i==5 || i==7){
				continue;
			}
			System.out.println(i);
		}

	}

}
