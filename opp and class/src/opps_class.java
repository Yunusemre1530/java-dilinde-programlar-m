import java.util.Scanner;


public class opps_class {

	public static void main(String[] args) {
	Car car1=new Car();
	Scanner scan= new Scanner(System.in);
	System.out.println("Araban�n rengini kap� say�s�n� motor g�c�n� ve modelini giriniz: ");
	car1.color=scan.nextLine();
	car1.doors=scan.nextInt();
	car1.engine=scan.nextInt();
	car1.model=scan.nextLine();
	System.out.println(car1.color+" "+car1.doors+" "+car1.engine+" "+car1.model);
	}

}
